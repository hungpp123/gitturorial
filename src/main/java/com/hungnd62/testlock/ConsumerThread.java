package com.hungnd62.testlock;

public class ConsumerThread extends Thread {
    ProducerConsumerImpl pc;
    public ConsumerThread(ProducerConsumerImpl sharedObj) {
        super("CONSUMER");
        this.pc = sharedObj;
    }

    public void run() {
        try {
            for (int i = 0; i < 40; i++) {
                pc.get();
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
