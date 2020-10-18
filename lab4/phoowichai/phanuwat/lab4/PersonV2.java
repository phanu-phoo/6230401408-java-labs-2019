/**
 * 
 * Write a java class called PersonV2 which has properties as shown in Figure 5.
 * PersonV2 inherited from Person.
 * 
 * Author: Phanuwat Phoowichai
 * ID: 623040140-8
 * Sec: 2
 * Date: January 6, 2020 
 * 
**/

package phoowichai.phanuwat.lab4;

import java.time.*;

public class PersonV2 extends Person {
    private LocalDate dob;

    public PersonV2(String name, double height, double weight, String dob) {
        super(name, height, weight); // to call variables from Person class
        this.dob = LocalDate.parse(dob);
    }

    public LocalDate getDOB() {
        return dob;
    }

    public void setDOB(LocalDate dob) {
        this.dob = dob;
    }

    public void isBirthday() {
        boolean todayBD = MonthDay.from(dob).equals(MonthDay.from(LocalDate.now()));
        if (todayBD == true) {
            System.out.println("Today is " + getName() + "' s Birthday.");
        } else {
            System.out.println("Today is NOT " + getName() + "'s Birthday.");
        }
    }

    public void howOld() {
        LocalDate today = LocalDate.now();
        Period p = Period.between(dob, today); // find person's age
        System.out.println(getName() + " is " + p.getYears() + " years " + p.getMonths() + " months and " + p.getDays()
                + " days old.");
    }

    public void compareAge(PersonV2 name) {
        LocalDate nameBD = name.getDOB();
        Period p;
        if (dob.compareTo(nameBD) > 0) {
            p = Period.between(nameBD, dob); // find difference between 2 ages
            System.out.println(name.getName() + " is " + p.getYears() + " years " + p.getMonths() + " months and "
                    + p.getDays() + " days older than " + getName());
        } else if (dob.compareTo(nameBD) < 0) {
            p = Period.between(dob, nameBD); // find difference between 2 ages
            System.out.println(getName() + " is " + p.getYears() + " years " + p.getMonths() + " months and "
                    + p.getDays() + " days older than " + name.getName());
        }
    }

    @Override // indicate and check that the method is overriding that class method
    public String toString() {
        return "name=" + getName() + ", height=" + getHeight() + " cm. weight=" + getWeight() + " kg., Birthday="
                + getDOB();
    }

}