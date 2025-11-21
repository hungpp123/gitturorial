package com.learn.review.mediator;

public interface ChatMediator {
    void sendMsg(String msg, User user);
    void addUser(User user);
}
