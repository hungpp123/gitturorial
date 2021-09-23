/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hungnd62.observer;

import com.hungnd62.observer.Common.LoginStatus;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Admin
 */
public class AccountService implements SubjectItf {
    
    private User user;
    private List<ObserverItf> lstObserver = new ArrayList<>();
    public AccountService(String email, String ip) {
        user = new User();
        user.setEmail(email);
        user.setIp(ip);
    }
    
    @Override
    public void attach(ObserverItf observer) {
        if (!lstObserver.contains(observer)) {
            lstObserver.add(observer);
        }
    }

    @Override
    public void detach(ObserverItf observer) {
        if (lstObserver.contains(observer)) {
            lstObserver.remove(observer);
        }
    }

    @Override
    public void notifyAllObserver() {
        lstObserver.forEach(t -> t.update(user));
    }
    
    public void changeStatus(LoginStatus status) {
        user.setStatus(status);
        System.out.println("Status is changed!");
        this.notifyAllObserver();
    }
    
    public void login() {
        if (!this.isValidIP()) {
            user.setStatus(LoginStatus.INVALID);
        } else if (this.isValidEmail()) {
            user.setStatus(LoginStatus.SUCCESS);
        } else {
            user.setStatus(LoginStatus.FAILURE);
        }
        this.notifyAllObserver();
    }
    
    private boolean isValidIP() {
        return "127.0.0.1".equals(user.getIp());
    }
    private boolean isValidEmail() {
        return "nguyendinhhunghn96@gmail.com".equalsIgnoreCase(user.getEmail());
    }
}
