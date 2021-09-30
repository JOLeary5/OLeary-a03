/*
 * UCF COP3330 Fall 2021 Assignment 3 Solutions
 * Copyright 2021 Jonathan O'Leary
 */

package baseline;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Solution27 {
        static void validateInput(String firstName, String lastName, String ZIP, String employeeID) {

            int firstNameLength, lastNameLength, zipcodeLength, letters=0, correctFormatCheck=0;
            firstNameLength = firstName.length();
            lastNameLength = lastName.length();
            zipcodeLength = ZIP.length();

            for (int i=0; i<zipcodeLength; i++) {
                if (Character.isLetter(ZIP.charAt(i))) {
                    letters++;
                }
            }
            if (firstNameLength<2){
                System.out.println("The first name must be at least 2 characters");
                correctFormatCheck++;
            }
            if (lastNameLength<2){
                System.out.println("The last name must be at least 2 characters");
                correctFormatCheck++;
            }
            if (firstNameLength == 0){
                System.out.println("The first name must be filled in");
                correctFormatCheck++;
            }
            if (lastNameLength ==0){
                System.out.println("The last name must be filled in");
                correctFormatCheck++;
            }

            String IDcheck = "[a-zA-Z]{2}[-]{1}[0-9]{4}";
            if (!Pattern.matches(IDcheck,employeeID)){
                System.out.println("The employee ID must be in the format AA-1234.");
                correctFormatCheck++;
            }


            if (zipcodeLength<5||letters>0)
            {
                System.out.println("The zipcode must be a 5 digit number");
                correctFormatCheck++;
            }
            if (correctFormatCheck==0){
                System.out.println("There were no errors found");
            }

        }
    public static void main(String[] args) {

        Scanner scanR = new Scanner(System.in);

        System.out.println("Enter the first name: ");
        String firstName = scanR.next();
        System.out.println("Enter the last name: ");
        String lastName = scanR.next();
        System.out.println("Enter the ZIP code: ");
        String ZIP = scanR.next();
        System.out.println("Enter the employee ID: ");
        String eployeeID = scanR.next();

        validateInput(firstName,lastName,ZIP,eployeeID);



    }
}
