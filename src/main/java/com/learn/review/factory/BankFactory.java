package com.learn.review.factory;

public class BankFactory {
    public BankFactory() {};

    public static Bank getBank(BankType bankType) {
        switch (bankType) {
            case VCB:
                return new VietcomBank();
            case TPBANK:
                return new TPBank();
            default:
                throw new IllegalArgumentException("This bank typ is not supported");
        }
    }
}
