package com.hungnd62.testmaven;

import java.util.concurrent.locks.ReentrantLock;

class TestTryLock {
    private final ReentrantLock lock = new ReentrantLock();

    public void doTask(String name) {
        if (lock.tryLock()) { // thử lấy lock
            try {
                System.out.println(name + " acquired lock");
                Thread.sleep(1000);
            } catch (InterruptedException e) {}
            finally {
                lock.unlock();
                System.out.println(name + " released lock");
            }
        } else {
            System.out.println(name + " could NOT acquire lock, doing something else...");
        }
    }

    public static void main(String[] args) {
        TestTryLock ex = new TestTryLock();
        new Thread(() -> ex.doTask("T1")).start();
        new Thread(() -> ex.doTask("T2")).start();
    }
}
