/*
 * UCF COP3330 Fall 2021 Assignment 3 Solutions
 * Copyright 2021 Jonathan O'Leary
 */
package baseline;

public class Solution30 {
    public static void main(String[] args) {

        for(int i=1; i<=12; i++){
            for(int j=1; j<=12;j++){
                System.out.format("%5d",i*j);
            }
            System.out.println();
        }

    }
}
