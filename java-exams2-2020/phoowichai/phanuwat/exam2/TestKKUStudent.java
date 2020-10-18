/**
 * 
 * Author: Phanuwat Phoowichai
 * ID: 623040140-8
 * Sec: 2
 * 
 **/

package phoowichai.phanuwat.exam2;

public class TestKKUStudent {

    // compareGpa of s1 and s2
    public static void compareGpa(KKUStudent s1, KKUStudent s2) {
        if (s1.gpa > s2.gpa) {
            String msg = s1.name + " has GPA greater than " + s2.name;
            System.out.println(msg);
        } else if (s2.gpa > s1.gpa) {
            String msg = s2.name + " has GPA greater than " + s1.name;
            System.out.println(msg);
        } else if (s1.gpa == s2.gpa) {
            String msg = s1.name + " has GPA equal to " + s2.name;
            System.out.println(msg);
        }
    }

    public static void main(String[] args) {
        KKUStudent manee = new KKUStudent("Manee", 3.2);
        KKUStudent chujai = new KKUStudent("Chujai");
        System.out.println(manee);
        System.out.println(chujai);
        System.out.println("They study at " + KKUStudent.getUniversity());
        compareGpa(manee, chujai);
        chujai.setGpa(3.4);
        System.out.println("Chujai has studied hard and her GPA becomes " + chujai.getGpa());
        compareGpa(manee, chujai);
    }
}