package com.learn.chroniclequeue;

import net.openhft.chronicle.bytes.Bytes;
import net.openhft.chronicle.bytes.BytesStore;
import net.openhft.chronicle.bytes.internal.NativeBytesStore;
import net.openhft.chronicle.core.Jvm;
import net.openhft.chronicle.queue.ChronicleQueue;
import net.openhft.chronicle.queue.ExcerptAppender;
import net.openhft.chronicle.queue.ExcerptTailer;
import net.openhft.chronicle.queue.impl.single.SingleChronicleQueueBuilder;

/**
 * Created by peter on 25/01/17.
 */
public enum RunLargeQueueMain {
    ;

    private static final int FILE_SIZE = Integer.getInteger("file.size", 2);
    private static final int MSG_SIZE = Integer.getInteger("msg.size", 512);
    private static final double BLOCK_SIZE = Double.parseDouble(System.getProperty("block.size", "64"));
    private static final boolean PRETOUCH = Boolean.getBoolean("pretouch");

    public static void main(String[] args) {
        String basePath = "D:\\PROJECTS\\Data\\RunLargeQueueMain";
        System.out.println("file.size: " + FILE_SIZE + " # GB");
        System.out.println("msg.size: " + MSG_SIZE + " # B");
        System.out.println("block.size: " + BLOCK_SIZE + " # MB");
        System.out.println("pretouch: " + PRETOUCH);
        try (ChronicleQueue queue = SingleChronicleQueueBuilder.binary(basePath).blockSize((int) (BLOCK_SIZE * (1 << 20))).build()) {
            ExcerptAppender appender = queue.acquireAppender();
            ExcerptTailer tailer = queue.createTailer();
            BytesStore bytes = NativeBytesStore.nativeStore(MSG_SIZE);
            Bytes bytes2 = Bytes.allocateDirect(MSG_SIZE);
            for (int t = 1; t <= FILE_SIZE; t++) {
                long start = System.currentTimeMillis();
                for (int i = 0; i < 1 << 30; i += MSG_SIZE) {
                    appender.writeBytes(bytes);
                }
                long mid = System.currentTimeMillis();
                for (int i = 0; i < 1 << 30; i += MSG_SIZE) {
                    bytes2.clear();
                    tailer.readBytes(bytes2);
                }
                long end = System.currentTimeMillis();
                System.out.printf("%d: Took %.3f seconds to write and %.3f seconds to read 1 GB%n", t, (mid - start) / 1e3, (end - mid) / 1e3);
                if (PRETOUCH)
                    appender.pretouch();
                Jvm.pause(8_000);
            }
        }
    }
}
