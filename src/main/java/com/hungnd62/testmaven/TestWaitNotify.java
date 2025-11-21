package com.hungnd62.testmaven;

import java.util.LinkedList;
import java.util.Queue;

public class TestWaitNotify {
    private final int CAPACITY = 5;
    private final Queue<Integer> queue = new LinkedList<>();

    // Producer
    public void produce() throws InterruptedException {
        int value = 0;
        while (true) {
            synchronized (queue) {
                while (queue.size() == CAPACITY) {
                    System.out.println("Queue full. Producer waiting...");
                    queue.wait(); // nhả lock và chờ consumer lấy bớt
                }

                queue.add(value);
                System.out.println("Produced " + value++);
                queue.notify(); // đánh thức consumer
            }
            Thread.sleep(500); // tạm dừng cho dễ quan sát
        }
    }

    // Consumer
    public void consume() throws InterruptedException {
        while (true) {
            synchronized (queue) {
                while (queue.isEmpty()) {
                    System.out.println("Queue empty. Consumer waiting...");
                    queue.wait(); // nhả lock và chờ producer thêm dữ liệu
                }

                int val = queue.remove();
                System.out.println("Consumed " + val);
                queue.notify(); // đánh thức producer
            }
            Thread.sleep(1000);
        }
    }

    public static void main(String[] args) {
        TestWaitNotify ex = new TestWaitNotify();

        Thread producer = new Thread(() -> {
            try { ex.produce(); } catch (InterruptedException e) {}
        });

        Thread consumer = new Thread(() -> {
            try { ex.consume(); } catch (InterruptedException e) {}
        });

        producer.start();
        consumer.start();
    }
}
