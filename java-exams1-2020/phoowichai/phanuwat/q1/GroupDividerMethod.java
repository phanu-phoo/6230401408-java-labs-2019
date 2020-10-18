package phoowichai.phanuwat.q1;

/**
 * 
 * Problem 2
 * 
 * Name : Phanuwat Phoowichai
 * St. ID : 623040140-8
 * 
 **/

public class GroupDividerMethod {
    static int m;
    static int n;

    public static void getNumber(String[] args) {
        if (args.length == 2) { // check the number of program arguments is 2
            m = Integer.parseInt(args[0]); // input the number from arguments
            n = Integer.parseInt(args[1]);
        } else { // set default
            m = Integer.parseInt("0");
            n = Integer.parseInt("0");
            System.out.println("Usage:java Group Divider <m> <n>");
        }
    }

    public static void divideNumber() {
        if (m != 0 && n != 0) { // check the number
            if (m < n) { // if the divident is smaller than the divider
                System.out.println("Cannot divide a number by a larger number");
            } else {
                for (int i = m / n; i > 0; i--) {
                    System.out.println((i) * n); // descending order
                }
            }
        } else {
        }
    }

    public static void main(String[] args) {
        getNumber(args);
        divideNumber();
    }
}