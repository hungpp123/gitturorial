package com.learn.review.abstracfactory;

public class WoodFactory implements AbstractFurnitureFactory{

    @Override
    public Chair createChair() {
        return new WoodChair();
    }

    @Override
    public Table createTable() {
        return new WoodTable();
    }
}
