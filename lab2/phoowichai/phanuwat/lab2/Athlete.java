/**
 * This Athlete program is to accept three arguments: athlete name, the sport name 
*  that that athlete plays, and the nationality of that athlete.  Its output format is "My 
*  favorite athlete is <athlete_name> who plays <sport_name> and has 
* nationality as <athlete_nationality>"
*
* Author: Phanuwat Phoowichai
* ID: 623040140-8
* Sec: 2
* Date: December 16, 2019
*
**/

package phoowichai.phanuwat.lab2;

public class Athlete {
    public static void main(String[] args) {
        if (args.length == 3) { // check the number of program input arguments
            String athlete_name = args[0]; // take argument to athlete name
            String sport_name = args[1]; // take argument to sport name
            String athlete_nationality = args[2]; // take argument to athlete nationality
            System.out.println("My favorite athlete is " + athlete_name + " who plays " + sport_name
                    + " and has nationality as " + athlete_nationality);
        } else {
            System.out.println("Athlete <athlete name> <sport name> <nationality>");
        }
    }
}