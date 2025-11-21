package com.learn.designpattern.singleton;

public class Database {
    private static Database instance;

    public static synchronized Database getInstance() {
        if (instance == null) {
            instance = new Database();
        }
        return instance;
    }

    public void query(String s) {
        System.out.println("Executing query: " + s);
    }

}
