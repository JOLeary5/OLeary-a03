/*
 * UCF COP3330 Fall 2021 Assignment 3 Solutions
 * Copyright 2021 Jonathan O'Leary
 */

package baseline;
import java.util.Scanner;
public class Solution33 {
    public static void main(String[] args) {

        Scanner scanR = new Scanner(System.in);
        String[] magicResponses ={"Yes","No","Maybe","Ask again later"};

        System.out.println("Please ask a question for the magic 8ball. ");
        String useless = scanR.next();

        int randomNumber = (int)(Math.random()*(3-0))+0;
        System.out.println(magicResponses[randomNumber]);
    }
}
