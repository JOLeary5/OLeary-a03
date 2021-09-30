/*
 * UCF COP3330 Fall 2021 Assignment 3 Solutions
 * Copyright 2021 Jonathan O'Leary
 */
package baseline;
import java.util.Scanner;

public class PaymentCalculator {
    public static double calculateMonthsUntilPaidOff(){
        Scanner scanR = new Scanner(System.in);

        System.out.println("What is your balance?");
        double balance = scanR.nextDouble();

        System.out.println("What is the APR on your card (as a percent)?");
        double APR = scanR.nextDouble();
        APR = (APR/365);

        System.out.println("What is the monthly payment you can make?");
        double MonthlyPayment = scanR.nextDouble();

        double months, power;

        power = Math.pow((1+APR),30);

        months = -(1) * (Math.log(1+((balance*(1-power))/MonthlyPayment)));

        months = months/30;
        months = months / (Math.log(1+APR));
        months = -(months);


        //System.out.println(months);
        return months;
    }
}
