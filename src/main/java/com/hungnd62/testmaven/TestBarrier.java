package com.hungnd62.testmaven;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CyclicBarrier;

public class TestBarrier {
    public static void main(String[] args) {
        int parties = 3;
        CyclicBarrier barrier = new CyclicBarrier(parties,
                () -> System.out.println("All threads reached barrier, continue..."));

        for (int i = 0; i < parties; i++) {
            new Thread(() -> {
                try {
                    System.out.println(Thread.currentThread().getName() + " waiting...");
                    barrier.await(); // đợi tất cả đến
                    System.out.println(Thread.currentThread().getName() + " passed");
                } catch (Exception e) {}
            }).start();
        }
    }
}
