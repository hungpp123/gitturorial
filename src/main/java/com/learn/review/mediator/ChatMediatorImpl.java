package com.learn.review.mediator;

import java.util.ArrayList;
import java.util.List;

public class ChatMediatorImpl implements ChatMediator{

    public ChatMediatorImpl(String groupName) {
        System.out.println(groupName + " group already created");
    }

    private List<User> users = new ArrayList<>();

    @Override
    public void sendMsg(String msg, User user) {
        for (User u: users) {
            if (!u.equals(user)) {
                u.receive(msg);
            }
        }
    }

    @Override
    public void addUser(User user) {
        System.out.println(user.name + " joined this group");
        users.add(user);
    }
}
