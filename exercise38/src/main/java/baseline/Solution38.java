/*
 * UCF COP3330 Fall 2021 Assignment 3 Solutions
 * Copyright 2021 Jonathan O'Leary
 */
package baseline;
import java.util.ArrayList;
import java.util.Scanner;

public class Solution38 {

    public static Integer[] filterEvenNumbers(String[] userArray){
        ArrayList<Integer> evenList = new ArrayList<>();
        for (int i=0; i<userArray.length; i++){
            int num = Integer.parseInt(userArray[i]);
            if ((num % 2)==0){
                evenList.add(num);
            }
        }
        Integer[] evenArray = new Integer[evenList.size()];
        evenArray = evenList.toArray(evenArray);

        return evenArray;
    }


    public static void main(String[] args) {

        Scanner scanR = new Scanner(System.in);

        System.out.println("Enter a list of numbers, separated by spaces: ");
        String userInput = scanR.nextLine();

        String userArray[] = userInput.split(" ");

        Integer evenArray[] = filterEvenNumbers(userArray);

        System.out.println("The even numbers are");
        for (int i=0; i<evenArray.length ; i++){
            if (i < evenArray.length-1){
                System.out.print(evenArray[i]+" ");
            }
            else {
                System.out.print(evenArray[i]+".");
            }
        }
        System.out.println("\n");
    }
}
