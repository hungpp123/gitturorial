package com.hungnd62.testmaven;

public class TestWhile {
    public static void main(String[] args) {
        int i = 1;
        do {
            i++;
            System.out.println(i);
        } while (i <= 10);
        int a = 10;
        System.out.println("TestFunction: ");
        System.out.println(increment(a));
        System.out.println(a);
        System.out.println(factorial(4));
    }

    static int factorial(int n) {
        if (n != 0) {
            return n * factorial(n - 1);
        } else return 1;
    }

    static int increment(int a) {
        a = a + 1;
        return a;
    }
}
