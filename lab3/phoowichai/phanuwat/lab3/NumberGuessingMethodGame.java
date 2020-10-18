/**
* Write a Java program called NumberGuessingMethodGame.
* The program defines at least two subroutines, namely genAnswer(), and playGame() described below.
* The program also contains a static int variable answer which contains the answer of the game.
* The main of the program should be as shown.
* genAnswer() is a static void subroutine that will generate the answer and then store the value in the variable answer.
* playGame() is a static void subroutine that runs the game.
* The subroutine performs the following steps: 1.reads in the input
* 2.displays appropriate output 3.decrements the remaining guess.
* It repeats the steps if there are numbers of guesses remain or the correct answer has not been entered.
*
* Author: Phanuwat Phoowichai
* ID: 623040140-8
* Sec: 2
* Date: January 4, 2020
* 
**/

package phoowichai.phanuwat.lab3;

import java.util.Scanner;

public class NumberGuessingMethodGame {
    static int random_nmber;
    static Scanner number = new Scanner(System.in);

    public static void main(String[] args) { // main of code
        genAnswer();
        playgame();
    }

    public static void genAnswer() {
        random_nmber = (int) (Math.random() * ((10 - 1) + 1)) + 1; // random answer
    }

    public static void playgame() {
        int round = 0;
        int falsex = 1;
        System.out.println("Welcome to a number guessing game!"); // start game
        while (round != 5) {
            System.out.print("Enter an integer between 1 and 10:");
            int number_input = number.nextInt(); // answer
            if (number_input == random_nmber) { // if answer is correct
                round++; // increase the number of rounds
                System.out.println("Congratulations!");
                System.out.println("You have tried " + String.valueOf(round) + " times");
                falsex = 0;
                break; // end game
            } else if (number_input < random_nmber) { // if answer less than random number
                round++; // increase the number of rounds
                System.out.println("Try a higher number!");
            } else if (number_input > random_nmber) { // if answer more than random number
                round++; // increase the number of rounds
                System.out.println("Try a Lower number!");
            }
            if (round == 5 && falsex == 1) { // if round of the answer is full
                System.out.println("You have tried " + String.valueOf(round) + " times. You ran out of guesses");
                System.out.println("The answer is " + String.valueOf(random_nmber)); // end game
            }
        }
    }
}