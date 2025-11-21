package com.learn.review.builder;

public class Main {
    public static void main(String[] args) {
        Order order = new FastFoodBuilder().orderType(OrderType.ON_SITE)
                .orderBread(BreadType.BEEF)
                .orderSauce(SauceType.SOY_SAUCE)
                .orderVegetable(VegetableType.SALAD)
                .build();
        System.out.println(order);
    }
}
