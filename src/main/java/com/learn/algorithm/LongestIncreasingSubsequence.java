package com.learn.algorithm;

import java.util.Arrays;

public class LongestIncreasingSubsequence {
    public static int longestIncreasingSubsequence(int[] nums) {
        int max = 0;

        int n = nums.length;
        int[] dp = new int[n];
        Arrays.fill(dp, 1);

        for (int i = 1; i < n; i++) {
            for (int j = 0; j < i; j++) {
                if (nums[j] < nums[i] && dp[j] + 1 > dp[i]) {
                    dp[i] = dp[j] + 1;
                }
            }
        }

        for (int length : dp) {
            max = Math.max(max, length);
        }

        return max;
    }

    public static int longestIncreasingSubarraySum(int[] nums) {
        int n = nums.length;
        int maxSum = nums[0]; // Khởi tạo giá trị tổng lớn nhất ban đầu
        int currentSum = nums[0]; // Khởi tạo giá trị tổng hiện tại ban đầu

        for (int i = 1; i < n; i++) {
            if (nums[i] > nums[i - 1]) {
                currentSum += nums[i];
            } else {
                currentSum = nums[i];
            }

            maxSum = Math.max(maxSum, currentSum);
        }

        return maxSum;
    }

    public static void main(String[] args) {
        int[] nums = {1, 4, 3, 8, 9, 2, 6, 7};
        int result = longestIncreasingSubarraySum(nums);
        System.out.println(result); // Kết quả: 22
    }

}
