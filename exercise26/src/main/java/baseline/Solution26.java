/*
 * UCF COP3330 Fall 2021 Assignment 3 Solutions
 * Copyright 2021 Jonathan O'Leary
 */

package baseline;


class Solution26 {
    public static void main(String[] args) {
        PaymentCalculator PaymentCalculatorObject = new PaymentCalculator();
        double months = PaymentCalculator.calculateMonthsUntilPaidOff();
        System.out.println("It will take you "+ Math.round(months)+ " months to pay off this card");
    }
}
