package com.hungnd62.testlock;

public class ProducerConsumerSolutionUsingLock {
    public static void main(String[] args) {
        ProducerConsumerImpl sharedObj = new ProducerConsumerImpl();
        ProducerThread p = new ProducerThread(sharedObj);
        ProducerThread p1 = new ProducerThread(sharedObj);
        ConsumerThread c = new ConsumerThread(sharedObj);
        p.start();
        p1.start();
        c.start();
    }
}
