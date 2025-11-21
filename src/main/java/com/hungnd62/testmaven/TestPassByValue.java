package com.hungnd62.testmaven;

import java.util.ArrayList;
import java.util.Arrays;

public class TestPassByValue {
    public static void main(String[] args) {
        ArrayList<Integer> listInt = new ArrayList<>();
        listInt.add(5);
//        addValueToList(listInt);
        changeReference(listInt);
        System.out.println(listInt);

    }

    public static void addValueToList(ArrayList<Integer> list){
        list.add(8);
    }

    public static void changeReference(ArrayList<Integer> list) {
        ArrayList<Integer> lstNew = new ArrayList<>();
        list = lstNew;
    }

}
