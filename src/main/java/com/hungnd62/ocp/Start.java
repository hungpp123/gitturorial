package com.hungnd62.ocp;

public class Start {
    public static void main(String[] args) {
        TestVariableInitianlization vm = new TestVariableInitianlization();
        TestVariableInitianlization.startClient();
        int a = 9;
        for (a = 0; a < 10; a ++) {
            System.out.println(a);
        }
        System.out.println(a);
    }
}
