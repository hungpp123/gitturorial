package com.hungnd62.callback;

public class Button {
    private ClickEventListener listener;
    public void onClickEvent(ClickEventListener listener) {
        this.listener = listener;
    }
    public void click() {
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Call Callback");
                if (listener != null) {
                    listener.onClick("username", "pass");
                }
            }
        }).start();
    }

}
