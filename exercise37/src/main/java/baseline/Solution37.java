/*
 * UCF COP3330 Fall 2021 Assignment 3 Solutions
 * Copyright 2021 Jonathan O'Leary
 */
package baseline;
import java.util.*;

public class Solution37 {
    public static void main(String[] args) {
        Scanner scanR = new Scanner(System.in);
        System.out.println("What's the minimum length? ");
        int size = Integer.parseInt(scanR.nextLine());
        int catchtest = 0;
        int special = 0;
        int numbers = 0;
        while (catchtest==0){
            System.out.println("How many special Characters? ");
            special = Integer.parseInt(scanR.nextLine());

            System.out.println("How many Numbers? ");
            numbers = Integer.parseInt(scanR.nextLine());

            if ((special+numbers)>(size/2)){
                System.out.println("Sorry but the number of special characters and numbers has\n to be at least equal to the number of letters in your password\n");
            }
            else{
                catchtest = 1;
            }
        }


        String letters = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
        String specialCharacters = "!@#$%^&*";
        String numbersList = "1234567890";

        Random random = new Random();
        ArrayList<Character> chars = new ArrayList<>();

        for(int i=0; i<special; i++){
            chars.add(specialCharacters.charAt(random.nextInt(specialCharacters.length())));
        }
        for (int i=0; i<numbers; i++){
            chars.add(numbersList.charAt(random.nextInt(numbersList.length())));
        }

        for (int i=chars.size()-1; i<size; i++){
            chars.add(letters.charAt(random.nextInt(letters.length())));
        }

        Collections.shuffle(chars);
        String randomPassword = "";

        for(Character s : chars)
        {
            randomPassword += Character.toString(s);
        }
        System.out.println("Your password is: "+randomPassword);
    }
}
