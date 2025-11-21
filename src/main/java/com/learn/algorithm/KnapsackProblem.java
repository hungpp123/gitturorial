package com.learn.algorithm;

import java.util.Arrays;
import java.util.Comparator;

public class KnapsackProblem {
    public static int knapsackGreedy(Item[] items, int maxWeight) {
        Arrays.sort(items, Comparator.comparingDouble((Item i) -> (double) i.value/i.weight).reversed());

        int totalValue = 0;
        int currWeight = 0;

        for (Item item : items) {
            if (currWeight + item.weight <= maxWeight) {
                totalValue += item.value;
                currWeight += item.weight;
            }
        }

        return totalValue;
    }

    public static void main(String[] args) {
        Item[] items = {
                new Item(10, 60),
                new Item(20, 100),
                new Item(30, 120)
        };

        int maxWeight = 50;
        int maxValue = knapsackGreedy(items, maxWeight);
        System.out.println("Max Value: " + maxValue); // Kết quả: 240
    }

}

class Item {
    int weight;
    int value;

    public Item(int weight, int value) {
        this.weight = weight;
        this.value = value;
    }
}