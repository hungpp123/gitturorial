package com.hungnd62.testlock;

public class ProducerThread extends Thread {
    public ProducerConsumerImpl pc;

    public ProducerThread(ProducerConsumerImpl sharedObj) {
        super("PRODUCER");
        this.pc = sharedObj;
    }
    public void run() {
        try {
            for(int i = 0; i < 20 ; i++) {
                pc.put();
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
