package com.learn.review.abstracfactory;

public class WoodTable implements Table{
    @Override
    public void createTable() {
        System.out.println("Create wood table");
    }
}
