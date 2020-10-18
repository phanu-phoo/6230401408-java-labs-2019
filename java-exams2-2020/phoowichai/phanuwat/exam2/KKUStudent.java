/**
 * 
 * Author: Phanuwat Phoowichai
 * ID: 623040140-8
 * Sec: 2
 * 
 **/

package phoowichai.phanuwat.exam2;

public class KKUStudent {
    protected String name = "";
    protected Double gpa = 2.0;
    final static String UNIVERSITY = "Khon Kaen University";

    public KKUStudent(String name) {
        this.name = name;
        this.gpa = 2.0;
    }

    public KKUStudent(String name, Double gpa) {
        this.name = name;
        this.gpa = gpa;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getGpa() {
        return this.gpa;
    }

    public void setGpa(Double gpa) {
        this.gpa = gpa;
    }

    public static String getUniversity() {
        return UNIVERSITY;
    }

    @Override
    public String toString() {
        String msg = "My name is " + this.name + " and my current GPA is " + this.gpa;
        return msg;
    }
}