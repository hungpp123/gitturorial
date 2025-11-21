package com.learn.designpattern.singleton;

public class Main {
    public static void main(String[] args) {
        Database db1 = Database.getInstance();
        Database db2 = Database.getInstance();

        System.out.println(db1 == db2);
        db1.query("Select * from Tbl");
    }
}
