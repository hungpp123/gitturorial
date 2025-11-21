package com.learn.algorithm.knapsack;

import java.util.ArrayList;
import java.util.Collections;

public class KnapsackDP {
    static int knapsackDP(int W, int[] weights, int[] values, int n) {
        int[][] dp = new int[n + 1][W + 1];

        for (int i = 1; i <= n; i++) {
            for (int w = 0; w <= W; w++) {
                if (weights[i-1] > w) {
                    dp[i][w] = dp[i-1][w];//khong the chon vat thu i do trong luong lon hon w
                } else {
                    dp[i][w] = Math.max(dp[i-1][w], values[i-1] + dp[i-1][w-weights[i-1]]);
                }
            }
        }

        ArrayList<Integer> selectedItem = new ArrayList<>();
        int w = W;
        for (int i = n; i > 0; i--) {
            if (dp[i][w] != dp[i-1][w]) {
                selectedItem.add(i-1);
                w-= weights[i-1];
            }
        }
        Collections.sort(selectedItem);
        System.out.println("Selected Item: " + selectedItem);

        return dp[n][W];
    }

    public static void main(String[] args) {
        int[] values = {60, 100, 120};
        int[] weights = {10, 20, 30};

        int W = 50;
        int n = values.length;
        System.out.println("Gia tri lon nhat co the dat duoc la : " + knapsackDP(W, weights, values, n));
    }

}
