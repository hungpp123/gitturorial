package com.learn.review.singleton;

public class SingletonPattern {
    private static SingletonPattern instance = null;

    private SingletonPattern() {

    }

    public synchronized SingletonPattern getInstance() {
        if (instance == null) {
            instance = new SingletonPattern();
        }
        return instance;
    }
}
