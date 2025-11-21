package com.learn.review.abstracfactory;

public class PlasticFactory implements AbstractFurnitureFactory{
    @Override
    public Chair createChair() {
        return new PlasticChair();
    }

    @Override
    public Table createTable() {
        return new PlasticTable();
    }
}
