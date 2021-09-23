/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hungnd62.testmaven;

import java.util.Arrays;
/**
 *
 * @author Admin
 */
public class TwoSum {
    public static int[] twoSum(int[] numbers, int target) {
        Arrays.sort(numbers);
        int j = 0;
        for (int i = 0; i < numbers.length; i++) {
            j = Arrays.binarySearch(numbers, i + 1, numbers.length, target - numbers[i]);
            System.out.println(j);
            if (j > -1) {
                return new int[]{i, j+1};
            }
        }
        return null;
    }
    public static void main(String[] args) {
        System.out.println(Arrays.toString(twoSum(new int[]{1, 2, 9, 3, 5, 7}, 8)));
    }
}
