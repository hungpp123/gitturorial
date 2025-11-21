package com.learn.review.abstracfactory;

public class WoodChair implements Chair{
    @Override
    public void createChair() {
        System.out.println("Create wood chair");
    }
}
