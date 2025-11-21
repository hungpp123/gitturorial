package com.learn.review.mediator;

public abstract class User {
    protected ChatMediator mediator;
    protected String name;

    public User(ChatMediator mediator, String name) {
        this.mediator = mediator;
        this.name = name;
    }

    public abstract void send(String msg);

    public abstract void receive(String msg);

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

        User user = (User) obj;
        return name.equals(user.name);
    }

}
