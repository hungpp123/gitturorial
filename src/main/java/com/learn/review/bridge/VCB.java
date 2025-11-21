package com.learn.review.bridge;

public class VCB extends Bank {

    public VCB(Account account) {
        super(account);
    }

    @Override
    public void openAccount() {
        System.out.println("Account open in VCB is: ");
        account.openAccount();
    }
}
