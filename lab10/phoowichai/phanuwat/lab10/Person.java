package phoowichai.phanuwat.lab10;

import java.time.*;
import java.io.*;

class Person implements Comparable<Person>, Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;
    
    protected String name;
    protected double weight, height;
    protected LocalDate dob;

    // constructor
    Person(String name, double weight, double height, LocalDate dob) {
        this.name = name;
        this.weight = weight;
        this.height = height;
        this.dob = dob;
    }

	// --- Name --- //
    public String getName() {
        return this.name;
    }
    
    public void setName(String name) {
        this.name = name;
    }

    // --- Weight --- //
    public double getWeight() {
        return this.weight;
    }
    
    public void setWeight(double weight) {
        this.weight = weight;
    }

    // --- Height --- //
    public double getHeight() {
        return this.height;
    }
    
    public void setHeight(double height) {
        this.height = height;
    }

    // --- Date of Birth --- //
    public LocalDate getDoB() {
        return this.dob;
    }
    
    public void setDoB(LocalDate dob) {
        this.dob = dob;
    }

    @Override
    public String toString() {
        String name = getName();
        double weight = getWeight();
        double height = getHeight();
        LocalDate dob = getDoB();

        /**
        // // get age. (compare dob with today date)
        // int year_old = Math.abs(dob.getYear() - LocalDate.now().getYear());
        // int month_old = Math.abs(dob.getMonthValue() - LocalDate.now().getMonthValue());
        // int day_old = Math.abs(dob.getDayOfMonth() - LocalDate.now().getDayOfMonth());

        // // check day
        // if (dob.getMonthValue() > LocalDate.now().getMonthValue()) {
        //     year_old -= 1;
        // }

        // return name + " is " + year_old + " years " + month_old  + " months " 
        //         + day_old + " days, has weight as" + weight + " kg., and height as " 
        //         + height + " cm.";
         */

        LocalDate birthDay = LocalDate.of(dob.getYear(), dob.getMonthValue(), dob.getDayOfMonth());
        LocalDate nowDay = LocalDate.now();
        Period ageNow = Period.between(birthDay, nowDay);
        int year_old = ageNow.getYears();
        int month_old = ageNow.getMonths();
        int day_old = ageNow.getDays();
        String msg = name + " is " + year_old + " years " + month_old  + " months "
                    + day_old + " days, has weight as" + weight + " kg., and height as "
                    + height + " cm.";
        return msg;
    }

    @Override
    public int compareTo(Person other_person) {
        return this.getName().compareToIgnoreCase(other_person.getName());
    }
}
