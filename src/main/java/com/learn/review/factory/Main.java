package com.learn.review.factory;

public class Main {
    public static void main(String[] args) {
        Bank bank = BankFactory.getBank(BankType.VCB);
        System.out.println(bank.getBankName());
    }
}
