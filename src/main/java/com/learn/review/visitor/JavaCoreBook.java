package com.learn.review.visitor;

public class JavaCoreBook implements ProgrammingBook{
    @Override
    public void accept(Visitor v) {
        v.visit(this);
    }

    @Override
    public String getResource() {
        return "https://github.com/gpcodervn/Java-Tutorial/";
    }

    public String getFavouriteBook() {
        return "The most favourite book of java core";
    }
}
