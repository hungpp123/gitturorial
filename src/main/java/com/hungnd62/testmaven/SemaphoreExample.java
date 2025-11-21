package com.hungnd62.testmaven;

import java.util.concurrent.Semaphore;

public class SemaphoreExample {
    public static void main(String[] args) {
        Semaphore semaphore = new Semaphore(2); // tối đa 2 thread cùng vào

        for (int i = 1; i <= 5; i++) {
            int id = i;
            new Thread(() -> {
                try {
                    semaphore.acquire();
                    System.out.println("Thread " + id + " entered");
                    Thread.sleep(1000);
                    System.out.println("Thread " + id + " leaving");
                } catch (InterruptedException e) {}
                finally { semaphore.release(); }
            }).start();
        }
    }
}