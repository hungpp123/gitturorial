package com.hungnd62.clazz;

public class ClassWithStaticMethod {
    public static String strHello = "Hello From ClassStaticMethod";
    public static Long numberSuccess = 10000l;

    public ClassWithStaticMethod() {
        strHello = "Hello from constructor";
        numberSuccess = 99999l;
    }

    public static void println() {
        System.out.println("String from hello: " + strHello);
        System.out.println("number = " + numberSuccess);
    }

}
