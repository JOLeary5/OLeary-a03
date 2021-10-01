/*
 * UCF COP3330 Fall 2021 Assignment 3 Solutions
 * Copyright 2021 Jonathan O'Leary
 */
package baseline;
import java.util.Scanner;

public class Solution32 {

    static int validUserInput() {
        Scanner scanR = new Scanner(System.in);
        int userInteger=0;
        boolean flag = false;
        while (true) {
            try {
                userInteger = Integer.parseInt(scanR.next()); //read r
                flag = true; //if exception not raised,set flag to true
            } catch (NumberFormatException e) //catch invalid number exception
            {
                System.out.println("Sorry. That's not a valid input");
            } catch (ArithmeticException e) //catch division by error exception
            {
                System.out.println("Sorry. That's not a valid input");
            }
            if (flag) //if exception not raised
            {
                break;
            }

        }
        return userInteger;
    }

    static void randomNumberGame(int difficulty) {
        int guessCounter = 0;
        int randomNumber = 0;
        if (difficulty == 1) {
            randomNumber = (int) (Math.random() * (10 - 1)) + 1;
        } else if (difficulty == 2) {
            randomNumber = (int) (Math.random() * (100 - 1)) + 1;
        } else {
            randomNumber = (int) (Math.random() * (1000 - 1)) + 1;
        }
        System.out.println("I have my number. Please give me your guess: ");
        int guess = validUserInput();
        int check = 0 ;
        while (check==0){
            guessCounter++;
            if (guess<randomNumber){
                System.out.println("Too Low. Guess again: ");
                guess = validUserInput();
            }
            else if (guess>randomNumber){
                System.out.println("Too High. Guess again: ");
                guess = validUserInput();
            }
            else {
                System.out.println("You got it in "+guessCounter+" guesses!\n");
                check=1;
            }
        }
    }

    public static void main(String[] args) {
        System.out.println("Lets play a guessing game!\n");

        int check=0;

        while (check==0) {
            System.out.println("Please enter a difficulty");
            int difficulty = validUserInput();
            if ((difficulty == 3) || (difficulty == 2) || (difficulty == 1)) {
                randomNumberGame(difficulty);

                System.out.println("Do you wish to play again (0 or yes/1 for no)");
                check = validUserInput();
            }
            else if (difficulty ==-1){
                check = 1;
            }

            else {
                System.out.println("Not a valid difficulty, please try again");
            }
        }
    }
}
