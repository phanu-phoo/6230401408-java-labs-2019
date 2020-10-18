/**
* Write a program called NumberGuessingConfigurableGame which is 
* an improved version of the previous program NumberGuessingMethodGame.  
* The main of the program should be as shown.
* In method configure(), 
*   The program lets you choose the minimum value of the guessing number, 
*   the maximum value of the guessing number, and the number of maximum number of tries.  
* In method playGames(),
*   Method playGame() that was implemented in problem 2 is called
*   The minimum and maximum values need to be updated at the prompt accepting 
* In method genAnswer() 
*   This is a static void subroutine that will generate the answer and then 
*   store the value in the variable answer.
*
* Author: Phanuwat Phoowichai
* ID: 623040140-8
* Sec: 2
* Date: January 4, 2020
*
**/

package phoowichai.phanuwat.lab3;

import java.util.*;

public class NumberGuessingConfigurableGame {
    static int realanswer, min, max, numTries;
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) { // main of code
        configure();
        genAnswer();
        playGame();
    }

    public static void configure() {
        System.out.print("Enter the min value:");
        min = input.nextInt(); // input min number
        System.out.print("Enter the max value:");
        max = input.nextInt(); // input max number
        System.out.print("Enter the maximum number of tries:");
        numTries = input.nextInt(); // input round of tries
    }

    public static void genAnswer() {
        Random random = new Random();
        realanswer = random.nextInt((max - min) + 1) + min; // random answer
    }

    public static void playGame() {
        System.out.println("Welcome to a number guessing game!"); // start
        int answer;
        int tried = 0;
        String playagain;
        do {
            System.out.print("Enter an integer between " + min + " and " + max + ":");
            answer = input.nextInt();
            if (answer < min) { // check answer, if answer less than min
                System.out.println("The number must be between " + min + " and " + max);
            } else if (answer > max) { // check answer, if answer more than max
                System.out.println("The number must be between " + min + " and " + max);
            } else {
                tried++; // increase the number of rounds
                if (answer < realanswer) { // if answer more than random number
                    System.out.println("Try a lower number!");
                } else if (answer > realanswer) { // if answer less than random number
                    System.out.println("Try a higher!");
                }
                if (answer == realanswer) { // if answer is correct
                    System.out.println("Congratulations!");
                    System.out.println("You have tried " + tried + " times");
                    break;
                } else if (tried == numTries) { // if round of the answer is full
                    System.out.println("You have tried " + tried + " times. You ran out of guesses!");
                    System.out.println("The answer is " + realanswer);
                    break;
                }
            }
        } while (answer != realanswer);
        System.out.print("Want to play again (Y or y):"); // if you want to play game again
        playagain = input.next();
        if (playagain.equals("Y") || playagain.equals("y")) { // answer
            playGame(); 
        } else {
            System.out.print("Thank you for playing our games. Bye!"); // end game
        }
    }
}