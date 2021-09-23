/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hungnd62.observer;

/**
 *
 * @author Admin
 */
public class TestObserver {

    public static void main(String[] args) {
        AccountService account1 = createAccountService("nguyendinhhunghn96@gmail.com", "127.0.0.1");
        account1.login();
        account1.changeStatus(Common.LoginStatus.EXPIRED);
        System.out.println("--------------------");
        AccountService account2 = createAccountService("nguyendinhhunghn96@gmail.com", "127.1.0.1");
        account2.login();
    }

    private static AccountService createAccountService(String email, String ip) {
        AccountService account = new AccountService(email, ip);
        account.attach(new Logger());
        account.attach(new Mailer());
        account.attach(new Protector());
        return account;
    }
}
