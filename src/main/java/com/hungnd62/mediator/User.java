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
public abstract class User {
    protected ChatMediatorItf mediator;
    protected String name;
    public User(ChatMediatorItf med, String name) {
        this.mediator = med;
        this.name = name;
    }
    @Override
    public int hashCode() {
        return name.hashCode();
    }
    
    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (this.getClass() != obj.getClass()) {
            return false;
        }
        
        User user1 = (User) obj;
        return name.equals(user1.name);
    }
    
    public abstract void send(String msg);
    
    public abstract void receive(String msg);
    
}
