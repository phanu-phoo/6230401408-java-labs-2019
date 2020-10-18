package phoowichai.phanuwat.q1;

/**
 * 
 * Problem 1
 * 
 * Name : Phanuwat Phoowichai
 * St. ID : 623040140-8
 * 
 **/

public class GroupDivider {
    public static void main(String[] args) {
        if (args.length == 2) { // check the number of program arguments is 2
            int m = Integer.parseInt(args[0]); // input the number from arguments
            int n = Integer.parseInt(args[1]);
            if (m < n) { // if the divident is smaller than the divider
                System.out.println("Cannot divide a number by a larger number");
            } else {
                for (int i = m / n; i > 0; i--) { // descending order
                    System.out.println((i) * n);
                }
            }
        } else {
            System.out.println("Usage:java Group Divider <m> <n>");
        }
    }
}