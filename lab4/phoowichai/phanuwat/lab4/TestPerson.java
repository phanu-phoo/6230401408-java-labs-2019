/**
 * Write a java class Person according to the UML diagram in Figure 1.
 * UML Class Diagrams is a type of static structure diagram that is used for
 * modeling a class a program for detailed modeling translating the models into programming code.
 * 
 * Author: Phanuwat Phoowichai
 * ID: 623040140-8
 * Sec: 2
 * Date: January 6, 2020 
 * 
**/

package phoowichai.phanuwat.lab4;

import phoowichai.phanuwat.lab4.Person;

public class TestPerson {
    public static void main(String[] args) {
        Person unknown = new Person(); // make person without data
        System.out.println(unknown); // print data of person
        System.out.println(Person.getNumberOfPerson() + " person has been created."); // print number of person
        Person sala = new Person("Sala"); // make person with name
        Person mane = new Person("Mane", 175, 65); // make person with name, height and weight
        System.out.println(sala);
        System.out.println(mane);
        Person henderson = new Person("Henderson", 180, 100);
        System.out.println(henderson);
        System.out.println(mane.getName() + "'s BMI is " + mane.getBMI()); // print BMI of person
        System.out.println(henderson.getName() + "'s BMI is " + henderson.getBMI());
        henderson.setWeight(80); // edit weight of person
        System.out.println(henderson.getName() + "'s BMI is " + henderson.getBMI());
        System.out.println(Person.getNumberOfPerson() + " person has been created.");
    }
}
