package com.learn.review.abstracfactory;

public class Main {
    public static void main(String[] args) {
        AbstractFurnitureFactory furnitureFactory = FurnitureFactory.getFurnitureFactory(MaterialType.PLASTIC);
        Chair chair = furnitureFactory.createChair();
        chair.createChair();
        Table table = furnitureFactory.createTable();
        table.createTable();
    }
}
