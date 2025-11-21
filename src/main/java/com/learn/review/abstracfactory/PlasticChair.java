package com.learn.review.abstracfactory;

public class PlasticChair implements Chair{
    @Override
    public void createChair() {
        System.out.println("Create plastic chair");
    }
}
