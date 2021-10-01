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
        Scanner scanR = new Scanner(System.in);

        System.out.println("Please enter your age");
        int age = scanR.nextInt();
        System.out.println("Please enter your resting heartRate");
        int restingHeartRate = scanR.nextInt();

        PrintChart(age, restingHeartRate);

    }
}
