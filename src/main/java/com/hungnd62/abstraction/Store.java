package com.hungnd62.abstraction;

public interface Store {
    /**
     * It is a constant field value.
     */
    static final double COMMISSION_RATE = 0.10;


    /**
     * It is a constant field value.
     */
    static final double TAX = 0.14;

    /**
     *
     * @return
     * @return- This method returns the calculateCommission.
     */
    public double calculateCommission();

    /**
     *
     * @param storeSales - The parameter storeSales is passed.
     * @return - This method returns the remaining store revenue.
     */
    public double calculateRemainingStoreRevenue(double storeSales);
}
