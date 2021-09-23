/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hungnd62.mediator;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Admin
 */
public class ChatMediatorImpl implements ChatMediatorItf {
    public ChatMediatorImpl(String groupName) {
        System.out.println(groupName + " group already created");
    }
    private List<User> lstUser = new ArrayList<>();
    @Override
    public void sendMessage(String msg, User user) {
        for (User u : this.lstUser) {
            if (!u.equals(user)) {
                u.receive(msg);
            }
        }
    }

    @Override
    public void addUser(User user) {
        System.out.println(user.name + " joined this group");
        lstUser.add(user);
    }
    
}
