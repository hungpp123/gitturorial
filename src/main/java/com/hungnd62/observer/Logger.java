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
public class Logger implements ObserverItf {

    @Override
    public void update(User user) {
        System.out.println("Logger: " + user);
    }
    
}
