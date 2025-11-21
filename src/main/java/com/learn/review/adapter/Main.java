package com.learn.review.adapter;

public class Main {
    public static void main(String[] args) {
        VietnameseTarget client = new TranslatorAdapter(new JapaneseAdaptee());
        client.send("Xin chao");
    }
}
