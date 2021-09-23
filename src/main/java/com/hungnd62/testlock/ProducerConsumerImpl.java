package com.hungnd62.testlock;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class ProducerConsumerImpl {
    private static final int CAPACITY = 10;
    private final Queue queue = new LinkedList<>();
    private final Random theRandom = new Random();

    private final Lock aLock = new ReentrantLock();
    private final Condition bufferNotFull = aLock.newCondition();
    private final Condition bufferNotEmpty = aLock.newCondition();

    public void put() throws InterruptedException {
        aLock.lock();
        try {
            while (queue.size() == CAPACITY) {
                System.out.println(Thread.currentThread().getName() + " : Buffer is full, waiting");
                bufferNotEmpty.await();
            }
            int number = theRandom.nextInt();
            boolean isAdded = queue.offer(number);
            if (isAdded) {
                System.out.println(Thread.currentThread().getName() + " is added " + number + "into queue");
                System.out.println(Thread.currentThread().getName() + " : Signalling that buffer is no more empty now");
                bufferNotFull.signalAll();
            }
        } finally {
            aLock.unlock();
        }
    }

    public void get() throws InterruptedException {
        aLock.lock();
        try {
            while (queue.size() == 0) {
                System.out.println(Thread.currentThread().getName() + " : Buffer is empty, waiting");
                bufferNotFull.await();
            }
            Integer value = (Integer) queue.poll();
            if (value != null) {
                System.out.println(Thread.currentThread().getName() + " consumed " + value + " from queue");
                System.out.println(Thread.currentThread().getName() + " signaling that buffer may be empty now");
                bufferNotEmpty.signalAll();
            }
        } finally {
            aLock.unlock();
        }
    }

}
