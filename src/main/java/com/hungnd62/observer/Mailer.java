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
public class Mailer implements ObserverItf {

    @Override
    public void update(User user) {
        if (user.getStatus() == Common.LoginStatus.EXPIRED) {
            System.out.println("Mailer: User " + user.getEmail() + "is expired. An email was sent!");
        }
    }
    
}
