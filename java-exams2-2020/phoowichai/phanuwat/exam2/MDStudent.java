/**
 * 
 * Author: Phanuwat Phoowichai
 * ID: 623040140-8
 * Sec: 2
 * 
 **/

package phoowichai.phanuwat.exam2;

public class MDStudent extends Student implements Exercise {
    public MDStudent(String name) {
        this.name = name;
    }

    public void jogging() {
        String msg = this.name + " like jogging";
        System.out.println(msg);
    }

    public void swimming() {
        String msg = this.name + " like swimming";
        System.out.println(msg);
    }

    public void study() {
        String msg = this.name + " studies in the Faculty of Medicine";
        System.out.println(msg);
    }
}