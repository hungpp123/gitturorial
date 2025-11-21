package com.hungnd62.testmaven;

public class TestCopilot {
    public static void main(String[] args) {
        //create a new person object and print the details
        Person person = new Person("John Doe", 30);
        person.printDetails();


    }

    //create class person with name and age attributes and a method to print the person's details
    static class Person {
        String name;
        int age;

        Person(String name, int age) {
            this.name = name;
            this.age = age;
        }

        void printDetails() {
            System.out.println("Name: " + name + ", Age: " + age);
        }
    }
}
