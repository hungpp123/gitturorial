/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hungnd62.mediator;

/**
 *
 * @author Admin
 */
public class UserImpl extends User {
    public UserImpl(ChatMediatorItf med, String name) {
        super(med, name);
    }
    @Override
    public void send(String msg) {
        System.out.println("----");
        System.out.println(this.name + " is sending the message: " + msg);
        mediator.sendMessage(msg, this);
    }

    @Override
    public void receive(String msg) {
        System.out.println(this.name + " received message: " + msg);
    }
    
}
