package com.learn.review.bridge;

public class TPBank extends Bank {

    public TPBank(Account account) {
        super(account);
    }

    @Override
    public void openAccount() {
        System.out.println("Account open in TPBank is: ");
        account.openAccount();
    }
}
