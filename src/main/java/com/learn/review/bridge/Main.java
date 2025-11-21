package com.learn.review.bridge;

public class Main {
    public static void main(String[] args) {
        Bank bank = new VCB(new CheckingAccount());
        bank.openAccount();
    }
}
