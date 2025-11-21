package com.learn.chroniclequeue;

import net.openhft.chronicle.core.OS;
import net.openhft.chronicle.queue.ChronicleQueue;
import net.openhft.chronicle.queue.ExcerptAppender;
import net.openhft.chronicle.queue.ExcerptTailer;
import net.openhft.chronicle.queue.TailerDirection;
import net.openhft.chronicle.queue.impl.single.SingleChronicleQueueBuilder;
import net.openhft.chronicle.wire.DocumentContext;

public class Test {
    public static void main(String[] args) {
        String basePath = "D:\\PROJECTS\\Data\\getting-started";
        ChronicleQueue queue = SingleChronicleQueueBuilder.single(basePath).build();
        ExcerptAppender appender = queue.acquireAppender();
//        appender.writeDocument(w -> w.write("msg").text("Hallo"));
//        appender.writeText("Hallo1");

        ExcerptTailer tailer = queue.createTailer();
//        while (queue.)
        try (DocumentContext context = tailer.readingDocument()) {
            if (context.isPresent()) {
                System.out.println(context.wire().read().text());
            }
        }
    }
}