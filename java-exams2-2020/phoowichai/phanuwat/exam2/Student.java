/**
 * 
 * Author: Phanuwat Phoowichai
 * ID: 623040140-8
 * Sec: 2
 * 
 **/

package phoowichai.phanuwat.exam2;

abstract public class Student {
    protected String name;

    abstract public void study();

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }
}