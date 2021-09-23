package com.hungnd62.callback;

public class TestCallBack {
    public static void main(String[] args) {
        Button btn = new Button();
        ClickEventListener listener = new ClickEventListenerImpl();
        btn.onClickEvent(listener);
        btn.click();
    }
}
