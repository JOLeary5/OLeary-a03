/*
 * UCF COP3330 Fall 2021 Assignment 3 Solutions
 * Copyright 2021 Jonathan O'Leary
 */
package baseline;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Random;

public class Solution35 {
    public static void main(String[] args) {
        ArrayList<String>listOfNames = new ArrayList<String>();
        Scanner scanR = new Scanner(System.in);
        int check = 0;
        while(check==0){
            System.out.println("Enter a name: ");
            String addString = scanR.nextLine();
            if (addString.isBlank())
                check = 1;
            else {
                listOfNames.add(addString);
            }
        }
        int size= listOfNames.size();

        Random random = new Random();
        int randomNumber = random.nextInt(size);

        System.out.println("The winner is ..."+listOfNames.get(randomNumber)+"!");
    }
}
