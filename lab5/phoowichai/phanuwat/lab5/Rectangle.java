/**
 * 
 * Class Rectangle inherited from Shape
 * 
 * Author: Phanuwat Phoowichai
 * ID: 623040140-8
 * Sec: 2
 * Date: January 17, 2020
 * 
 **/

package phoowichai.phanuwat.lab5;

import java.math.BigDecimal;
import java.math.RoundingMode;

class Rectangle extends Shape { // class Rectangle is a class that extends Shape
    protected double width;
    protected double length;

    public Rectangle() {
        super();
        this.width = 1.0;
        this.length = 2.0;
    }

    public Rectangle(double width, double length) {
        super();
        this.width = width;
        this.length = length;
    }

    public Rectangle(double width, double length, String color, boolean filled) {
        super(color, filled);
        this.width = width;
        this.length = length;
    }

    // getter and setter method of Width and Length
    public double getWidth() {
        return this.width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return this.length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getArea() { // calculates the area of the rectangle with respect to width and length
        BigDecimal arex = BigDecimal.valueOf(this.width * this.length);
        arex = arex.setScale(2, RoundingMode.HALF_UP);
        return arex.doubleValue();
    }

    public double getPerimeter() { // calculates the perimeter of the rectangle with respect to width and length
        BigDecimal perx = BigDecimal.valueOf((2 * this.width) + (2 * this.length));
        perx = perx.setScale(2, RoundingMode.HALF_UP);
        return perx.doubleValue();
    }

    @Override // indicate and check that the method is overriding that class method
    public String toString() {
        return String.format(super.toString() + ", width:" + this.width + ", length:" + this.length);
    }

}