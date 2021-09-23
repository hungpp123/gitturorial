/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hungnd62.testmaven;

/**
 *
 * @author Admin
 */
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

class LongestConsec {

    public static String longestConsec1(String[] strarr, int k) {
        if (k <= 0) {
            return "";
        }
        return IntStream.rangeClosed(0, strarr.length - k)
                .mapToObj(i -> Arrays.stream(strarr, i, i + k).collect(Collectors.joining()))
                .max(Comparator.comparingInt(String::length)).orElse("");
//        return IntStream.rangeClosed(0, strarr.length - k)
//                .mapToObj(i -> Arrays.stream(strarr, i, i + k).collect(Collectors.joining()))
//                .max(Comparator.comparingInt(String::length))
//                .orElse("");
    }

    public static String longestConsec(String[] strarr, int k) {
        String maxStr = "";
        for (int i = 0; i <= strarr.length - k; i++) {
            String current = IntStream.range(i, i + k).mapToObj(j -> strarr[j]).collect(Collectors.joining());
            if (current.length() > maxStr.length()) {
                maxStr = current;
            }
        }
        return maxStr;
    }

    public static int countSmileys(List<String> arr) {
        // Just Smile :)
        if (arr.size() == 0) {
            return 0;
        }
        return (int) arr.stream().filter(s -> s.matches("[:;][-~]?[)D]")).count();

    }
    public static String rangeExtraction(int[] arr) {
        String str = String.valueOf(arr[0]);
        for (int i = 1; i < arr.length; i++) {
            str += (arr[i-1]==arr[i]-1 ? "<" : ",") + String.valueOf(arr[i]);
        }
        return str.replaceAll("<([^,]*<)+","-").replace("<", ",");
    }

    public static void main(String[] args) {
        String[] strArr = new String[]{"zone", "abigail", "thetssa", "form", "libe", "zas", "theta", "abigail"};
        System.out.println(Arrays.stream(strArr, 0, 2).collect(Collectors.joining()));
        System.out.println(longestConsec1(strArr, 2));
        List<String> a = new ArrayList<String>();
        a.add(":)");
        a.add("XD");
        a.add(":0}");
        a.add("x:-");
        a.add("):-");
        a.add("D:");
        System.out.println(countSmileys(a));
        System.out.println(rangeExtraction(new int[] {-6, -3, -2, -1, 0, 1, 3, 4, 5, 7, 8, 9, 10, 11, 14, 15, 17, 18, 19, 20}));
    }
}
