package com.learn.review.visitor;

public interface Book {
    void accept(Visitor v);
}
