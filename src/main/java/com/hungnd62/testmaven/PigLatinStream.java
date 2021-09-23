/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hungnd62.testmaven;

import java.util.Arrays;
import java.util.stream.Collectors;

/**
 *
 * @author Admin
 */
public class PigLatinStream {
    public static String pigIt(String str) {
        return Arrays.stream(str.trim().split(" "))
                .map(v -> v.matches("[a-zA-Z]+") ? v.substring(1).concat(v.substring(0,1)).concat("ay") : v)
                .collect(Collectors.joining(" "));
    }
    public static void main(String[] args) {
        System.out.println(pigIt("Xin chao cac ban !"));
    }
}
