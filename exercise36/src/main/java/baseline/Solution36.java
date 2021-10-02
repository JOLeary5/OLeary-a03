/*
 * UCF COP3330 Fall 2021 Assignment 3 Solutions
 * Copyright 2021 Jonathan O'Leary
 */
package baseline;

import java.util.ArrayList;
import java.util.Scanner;
import java.lang.*;
import java.util.*;

public class Solution36 {
    static double average(ArrayList<Integer> NumArray){
        double average =0;
        int size = (NumArray.size());
        if (size==0){
            return 0;
        }
        for (int i=0; i<NumArray.size(); i++){
            int number = NumArray.get(i);
            average+=number;
        }
        average = average/size;
        return average;
    }

    static int max(ArrayList<Integer> NumArray){
        int max=0;
        int size = (NumArray.size());
        if (size==0){
            return 0;
        }
        for (int i=0; i<NumArray.size(); i++) {
            if (max < NumArray.get(i)) {
                max = NumArray.get(i);
            }
        }
        return max;
    }

    static int min(ArrayList<Integer> NumArray){
        int min=9999;
        int size = (NumArray.size());
        if (size==0){
            return 0;
        }
        for (int i=0; i<NumArray.size(); i++) {
            if (NumArray.get(i)<min) {
                min = NumArray.get(i);
            }
        }
        return min;
    }

    static double std(ArrayList<Integer> NumArray){
        double sum =0;
        double sd = 0;
        double mean = 0;
        int size = NumArray.size();

        for (int i=0; i<size; i++){
            sum = sum + NumArray.get(i);
        }

        mean = sum/size;

        for (int i=0; i<size; i++){
            sd = sd + Math.pow((NumArray.get(i)-mean),2);
        }
        return Math.sqrt(sd/size);
    }
    public static void main(String[] args) {
        ArrayList<Integer> NumArray = new ArrayList<>();
        Scanner scanR = new Scanner(System.in);
        int check=0;
        int num = 0;
        while(check==0) {
            try {
                System.out.println("Enter a number: ");
                String userInput = scanR.nextLine();
                if (userInput.equals("done")) {
                    break;
                } else {
                    num = 1;
                    for (int i = 0; i < userInput.length(); i++) {
                        if (Character.isDigit(userInput.charAt(i))) {
                            continue;
                        } else {
                            num = 0;
                        }
                    }
                    if (num == 1) {
                        NumArray.add(Integer.parseInt(userInput));
                    }

                }
            }
            catch(Exception e)
            {
                System.out.println("Please enter an inter value");
            }
        }
        System.out.println("Numbers: "+NumArray);

        double average = average(NumArray);
        int max = max(NumArray);
        int min = min(NumArray);
        double std =  std(NumArray);

        System.out.println("The average is "+average);
        System.out.println("The minimum is "+ min);
        System.out.println("The maximum is "+ max);
        System.out.println("The standard deviation is "+std);
        //completeComment
    }

}
