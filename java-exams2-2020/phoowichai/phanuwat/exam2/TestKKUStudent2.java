/**
 * 
 * Author: Phanuwat Phoowichai
 * ID: 623040140-8
 * Sec: 2
 * 
 **/

package phoowichai.phanuwat.exam2;

public class TestKKUStudent2 {
    public static void main(String[] args) {
        Student[] students = new Student[2];
        ENStudent manee = new ENStudent("Manee");
        MDStudent mana = new MDStudent("Mana");
        students[0] = manee;
        students[1] = mana;
        for (int i = 0; i < students.length; i++) {
            students[i].study();
        }
        manee.swimming();
        mana.jogging();
    }
}