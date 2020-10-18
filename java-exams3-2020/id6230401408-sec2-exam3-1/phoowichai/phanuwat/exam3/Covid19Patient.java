/**
 * 
 * Name : Phanuwat Phoowichai
 * Student ID : 623040140-8
 * 
 */

package phoowichai.phanuwat.exam3;

import java.util.List;

public class Covid19Patient {

    protected String name, gender, temperature;
    protected int age;
    protected List<String> countries;

    Covid19Patient (String name, Integer age, String gender, String temperature, List<String> countries){
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.temperature = temperature;
        this.countries = countries;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getTemperature() {
        return temperature;
    }

    public void setTemperature(String temperature) {
        this.temperature = temperature;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public List<String> getCountries() {
        return countries;
    }

    public void setCountries(List<String> countries) {
        this.countries = countries;
    }

    @Override
    public String toString() {
        String msg = "Name : " + getName() + "\nGender : " + getGender() + "\nAge : "
                    + getAge() + "\nTemperature : " + getTemperature() + "\nCountries : "
                    + getCountries() + "\n";
        return msg;
    }
}