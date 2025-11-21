package com.hungnd62.testmaven;

public class DemoInitializer {
    static {
        System.out.println("Static Block");
    }

    {
        System.out.println("Instance Initializer Block");
    }

    public DemoInitializer() {
        System.out.println("Constructor");
    }

    public static void main(String[] args) {
        new DemoInitializer();
        new DemoInitializer();
        new Child();
    }
}
class Parent {

    static {
        System.out.println("Parent static block");
    }

    {
        System.out.println("Parent initializer block");
    }

    public Parent() {
        System.out.println("Parent constructor");
    }
}

class Child extends Parent {

    static {
        System.out.println("Child static block");
    }

    {
        System.out.println("Child initializer block");
    }

    public Child() {
        System.out.println("Child constructor");
    }
}