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

import phoowichai.phanuwat.lab4.PersonV2;

public class TestPersonV2 {
    public static void main(String[] args) {
        PersonV2 doraemon = new PersonV2("Doraemon", 100, 100, "2017-05-26");
        PersonV2 nobita = new PersonV2("Nobita", 120, 25, "2012-01-06");
        System.out.println(doraemon);
        System.out.println(nobita);
        doraemon.howOld();
        nobita.howOld();
        doraemon.compareAge(nobita);
        nobita.compareAge(doraemon);
        doraemon.isBirthday();
        nobita.isBirthday();
        System.out.println(Person.getNumberOfPerson() + " persons have been created.");
    }
}