package com.hungnd62.clazz;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TestReference {
    public static void main(String[] args) {
        Map<Integer, List<String>> mapValue = new HashMap<>();
        List<String> lstStr = new ArrayList<>();
        lstStr.add("A");
        mapValue.put(1, lstStr);
        List<String> ln = mapValue.get(1);
        ln.add("B");
        ln.add("C");
        System.out.println(mapValue);
    }
}
