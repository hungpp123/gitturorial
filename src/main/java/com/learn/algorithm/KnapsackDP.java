package com.learn.algorithm;

import java.util.ArrayList;
import java.util.Collections;

public class KnapsackDP {
    public static int knapsack(int[] weights, int[] values, int W) {
        int n = weights.length;
        int[][] dp = new int[n + 1][W + 1];

        for (int i = 1; i <= n; i++) {
            for (int w = 0; w <= W; w++) {
                //neeus ko chon do vat thu i
                dp[i][w] = dp[i - 1][w];
                if (w >= weights[i - 1]) {
                    dp[i][w] = Math.max(dp[i][w], dp[i - 1][w - weights[i-1]] + values[i - 1]);
                }
            }
        }

        ArrayList<Integer> selectedItem = new ArrayList<>();
        int w = W;
        for (int i = n; i > 0; i--) {
            if (dp[i][w] != dp[i-1][w]) {
                selectedItem.add(i-1);
                w -= weights[i-1];
            }
        }

        Collections.sort(selectedItem);
        System.out.println("Selected items (index): " + selectedItem);

        return dp[n][W];
    }

    public static void main(String[] args) {
        int[] values = {60, 100, 120};
        int[] weights = {10, 20, 30};
        int W = 50;

        System.out.println("Maximum value: " + knapsack(weights, values, W));
    }


}
