/*
 * UCF COP3330 Fall 2021 Assignment 3 Solutions
 * Copyright 2021 Jonathan O'Leary
 */

package baseline;
import java.util.Scanner;
import java.util.ArrayList;

public class Solution34 {
    public static void main(String[] args) {

        Scanner scanR = new Scanner(System.in);

        ArrayList<String> names=new ArrayList();
        names.add("John Smith");
        names.add("Jackie Jackson");
        names.add("Chris Jones");
        names.add("Amanda Cullen");
        names.add("Jeremy Goodwin");

        int sizeOfArray = names.size();
        System.out.println("There are "+ sizeOfArray + " employees:");
        for (int i=0;i<sizeOfArray;i++){
            System.out.println(names.get(i));
        }
        System.out.println("\n");
        System.out.println("Enter the name you want to delete");
        String delete = scanR.nextLine();
        System.out.println("\n");

        names.remove(delete);
        sizeOfArray = names.size();
        System.out.println("There are "+ sizeOfArray + " employees:");
        for (int i=0;i<sizeOfArray;i++){
            System.out.println(names.get(i));
        }

    }
}
