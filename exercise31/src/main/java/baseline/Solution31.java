/*
 * UCF COP3330 Fall 2021 Assignment 3 Solutions
 * Copyright 2021 Jonathan O'Leary
 */
package baseline;

import java.util.Scanner;

public class Solution31 {
    public static void PrintChart(int age,int restingHeart){

        float activeHeartRate=0;
        System.out.println("Resting Pulse: "+restingHeart+"\t\t\t Age: "+age+"\n");
        System.out.println("Intensity \t| Rate\t");
        System.out.println("------------|--------------");
        for (int i=55; i<100; i+=5){
            float iStand = (float)i/100;
            //System.out.println(iStand);
            activeHeartRate = (((220 - age) - restingHeart) *iStand) + restingHeart;

            System.out.println(i + "          | "+ Math.round(activeHeartRate)+ " bpm      ");

        }
    }
    public static void main(String[] args) {
        int age=0;
        int restingHeart=0;
        Scanner sc=new Scanner(System.in);
        boolean flag=false;
        while(true)
        {
            try
            {
                System.out.print("What is your age? "); //ask interest rate
                age =Integer.parseInt(sc.next()); //read r
                flag=true; //if exception not raised,set flag to true
            }
            catch(NumberFormatException e) //catch invalid number exception
            {
                System.out.println("Sorry. That's not a valid input");
            }
            catch(ArithmeticException e) //catch division by error exception
            {
                System.out.println("Sorry. That's not a valid input");
            }
            if(flag) //if exception not raised
            {
                break;
            }

        }
        while(true)
        {
            try
            {
                System.out.print("What is your resting heart rate? "); //ask interest rate
                restingHeart =Integer.parseInt(sc.next()); //read r
                flag=true; //if exception not raised,set flag to true
            }
            catch(NumberFormatException e) //catch invalid number exception
            {
                System.out.println("Sorry. That's not a valid input");
            }
            catch(ArithmeticException e) //catch division by error exception
            {
                System.out.println("Sorry. That's not a valid input");
            }
            if(flag) //if exception not raised
            {
                break;
            }

        }
        PrintChart(age, restingHeart);


    }
}
