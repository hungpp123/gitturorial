package com.learn.review;

public class PassByValueTest {

    static class Dog {
        private String name;

        public Dog(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        @Override
        public String toString() {
            return "Dog{" +
                    "name='" + name + '\'' +
                    '}';
        }
    }

    public static void foo(Dog aDog) {
        aDog.setName("B");
        aDog = new Dog("C");
        aDog.setName("D");
    }

    public static void main(String[] args) {
        Dog test = new Dog("A");
        System.out.println("Value before call foo func: " + test);
        foo(test);
        System.out.println("Value after call foo func" + test);
    }
}
