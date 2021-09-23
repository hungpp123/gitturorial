package com.hungnd62.callback;

public class ClickEventListenerImpl implements ClickEventListener {

    @Override
    public void onClick(String username, String password) {
        System.out.println("Executing Callback ...");
        System.out.println("Username: " + username);
        System.out.println("Password: " + password);
    }
}
