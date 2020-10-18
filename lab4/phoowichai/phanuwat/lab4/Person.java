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

public class Person {
    private String name = "unknown";
    private double height = 0.0;
    private double weight = 0.0;
    private static int numberOfPerson = 0;

    public Person() { // make person without data
        numberOfPerson++; // increase tthe number of person
    }

    public Person(String name) { // make person with name
        numberOfPerson++;
        this.name = name;
    }

    public Person(String name, double height, double weight) { // make person with name, height. and weight
        numberOfPerson++;
        this.name = name;
        this.height = height;
        this.weight = weight;
    }

    public String getName() {
        return name; // return name
    }

    public void setName(String newName) {
        name = newName; // set new name
    }

    public double getHeight() {
        return height; // return height
    }

    public void setHeight(double newHeight) {
        height = newHeight; // set height
    }

    public double getWeight() {
        return height; // return weight
    }

    public void setWeight(double newWeight) {
        weight = newWeight; // set weight
    }

    @Override // indicate and check that the method is overriding that class method
    public String toString() {
        return String.format("name=" + this.name + ", height=" + this.height + " cm. weight=" + this.weight + " kg.");
    }

    public static int getNumberOfPerson() {
        return numberOfPerson; // return number of person
    }

    public String getBMI() {
        double BMI = weight / (Math.pow((height / 100), 2)); // calculate BMI as double
        return String.format("%.2f", BMI); // return BMI as string
    }
}