/**
*
* Author: Phanuwat Phoowichai
* ID: 623040140-8
* Sec: 2
* Date: December 16, 2019
*
**/

package phoowichai.phanuwat.lab2;

public class VowelsCounter {
    public static void main(String[] args) {
        String word = args[0];
        int count = 0;
        for (int i = 0; i < word.length(); i++){
            String alphabet = String.valueOf(word.charAt(i));
            if (alphabet.equals("a") || alphabet.equals("e") || alphabet.equals("i") || alphabet.equals("o") || alphabet.equals("u")) {
                count++;
            }
            else if (alphabet.equals("A") || alphabet.equals("E") || alphabet.equals("I") || alphabet.equals("O") || alphabet.equals("U")) {
                count++;
            }
        }
        System.out.println("Total number of vowels is " + count);
    }
}