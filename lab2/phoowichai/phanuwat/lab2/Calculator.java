/**
*
* Author: Phanuwat Phoowichai
* ID: 623040140-8
* Sec: 2
* Date: December 16, 2019
*
**/

package phoowichai.phanuwat.lab2;

public class Calculator {
    public static void main(String[] args) {
        Double resutl = 0.0;
        String operation = args[0]; // take argument to operation
        if (args.length == 3) {
            Double operand1 = Double.parseDouble(args[1]); // take argument to operand 1 and convert string to double
            Double operand2 = Double.parseDouble(args[2]); // take argument to operand 2 and convert string to double
            if (operation.equals("/") && args[2].equals("0")) {
                System.out.println("The second operand connot be zero");
            }
            else {
                if (operation.equals("+")) {
                    resutl = operand1 + operand2; // operand1 add operand2
                }
                else if (operation.equals("-")) {
                    resutl = operand1 - operand2; // operand1 subtract operand2
                }
                else if (operation.equals("x")) {
                    resutl = operand1 * operand2; // operand1 multiply operand2
                }
                else if (operation.equals("/")) {
                    resutl = operand1 / operand2; // operand1 divide operand2
                }
                System.out.println(operand1 + " " + operation + " " + operand2 + " = " + String.format("%.2f", resutl)); // print result
            }
        }
        else {
            if (operation.equals("q") || operation.equals("Q")) {
                System.out.println("Quitting the program"); // if user want to exit program
            }
        }
    }
}