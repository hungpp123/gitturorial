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
public class PersistenceStream {
    public static int persistence(int n) {
        if (n < 10) return 0;
        int newN = Arrays.stream(String.valueOf(n).split("")).mapToInt(Integer::valueOf).reduce(1, (acc, next) -> acc * next);
        return persistence(newN)+1;
    }
    public static void main(String[] args) {
        System.out.println(persistence(649));
    }
}
