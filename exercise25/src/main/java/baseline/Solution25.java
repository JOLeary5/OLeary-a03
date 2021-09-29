/*
 * UCF COP3330 Fall 2021 Assignment 3 Solutions
 * Copyright 2021 Jonathan O'Leary
 */
package baseline;
import java.util.Scanner;

public class Solution25 {
    static int passwordValidator(String password)
    {

        int numbers=0, letters=0, characters=0, passwordLength;
        passwordLength = password.length();

        for (int i=0; i<passwordLength; i++){
            if (Character.isLetter(password.charAt(i)))
            {
                letters++;
            }
            else if (Character.isDigit(password.charAt(i))){
                numbers++;
            }
            else
            {
                characters++;
            }
        }
        if (passwordLength<8)
        {
            if (numbers==passwordLength)
            {
                return 1;
            }
            if (letters==passwordLength)
            {
                return 2;
            }
        }

        else if (passwordLength>8)
        {
            if ((letters<passwordLength) && (numbers<passwordLength))
            {
                return 3;
            }
            if ((letters<=passwordLength) && (numbers<=passwordLength) && (characters>0))
            {
                return 4;
            }
        }
        return 0;
    }
    public static void main(String[] args)
    {
        Scanner scanR = new Scanner(System.in);
        String passcode;
        int strength;

        System.out.println("Enter your Password for judgment");
        passcode = scanR.nextLine();

        strength = passwordValidator(passcode);

        if (strength==1){
            System.out.println("VERY WEAK PASSWORD");
        }
        else if(strength==2){
            System.out.println("WEAK PASSWORD");
        }
        else if(strength==3){
            System.out.println("KINDA STRONG PASSWORD");
        }
        else if(strength==4){
            System.out.println("VERY STRONG PASSWORD");
        }
        else {
            System.out.println("THERE HAS BEEN AN ERROR");
        }
    }
}
