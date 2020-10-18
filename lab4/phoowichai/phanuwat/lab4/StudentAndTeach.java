/**
 * 
 * This program is to create Student and Teacher class, 
 * it extended PersonV2 class by adding
 * Teacher class has salary and teaching subject 
 * Student class has GPA and their major
 * 
 * Author: Phanuwat Phoowichai
 * ID: 623040140-8
 * Sec: 2
 * Date: January 12, 2020
 * 
 */

package phoowichai.phanuwat.lab4;

public class StudentAndTeach {

    public static class Student extends PersonV2 {
        private String major;
        private double GPA;

        public Student(String name, double height, double weight, String dob, String major, double GPA) {
            super(name, height, weight, dob); // call variable from PersonV2 class
            this.major = major;
            this.GPA = GPA;
        }

        public String getMajor() {
            return major;
        }

        public void setMajor(String major) {
            this.major = major; // change major value
        }

        public double getGPA() {
            return GPA;
        }

        public void setGPA(double GPA) {
            this.GPA = GPA; // change GPA value
        }

        public String toString() {
            return "name=" + getName() + ", height=" + getHeight() + " cm. weight=" + getWeight() + " kg., Birthday="
                    + getDOB() + ", major=" + getMajor() + ", GPA=" + getGPA();
        }

    }

    public static class Teacher extends PersonV2 {
        private String teachingSubject;
        private int salary;

        public Teacher(String name, double height, double weight, String dob, String teachingSubject, int salary) {
            super(name, height, weight, dob); // call variable from PersonV2 class
            this.teachingSubject = teachingSubject;
            this.salary = salary;
        }

        public String getTeachingSubject() {
            return teachingSubject;
        }

        public void setTeachingSubject(String teachingSubject) {
            this.teachingSubject = teachingSubject; // change teachingSubject value
        }

        public int getSalary() {
            return salary;
        }

        public void setSalary(int salary) {
            this.salary = salary; // change salary value
        }

        public String toString() {
            return "name=" + getName() + ", height=" + getHeight() + " cm. weight=" + getWeight() + " kg., Birthday="
                    + getDOB() + ", teachingSubject=" + getTeachingSubject() + ", salary=" + getSalary();
        }
    }
}