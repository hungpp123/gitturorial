package com.hungnd62.abstraction;

public interface Employee {

    /**
     * This method Calculates the pay of the employee.
     *
     * @return- This method returns double Pay of the Employee.
     */
    double calculatePay();

    /**
     * This method Checks if the employee should be awarded with a promotion.
     *
     * @return- This method returns boolean the eligibility status for
     * promotion. for an employee.
     */
    boolean checkPromotionEligibility();
}
