/*
 * UCF COP3330 Fall 2021 Assignment 3 Solutions
 * Copyright 2021 Jonathan O'Leary
 */
package baseline;

import java.util.Scanner;

public class Solution28 {
    public static void main(String[] args){
        Scanner scanR = new Scanner(System.in);
        int total=0, userInput;

        for (int i=0; i<5; i++){
            System.out.println("Enter a number: ");
            userInput = scanR.nextInt();
            total += userInput;
        }
        System.out.println("The total is "+ total);
    }
}
