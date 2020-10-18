/**
 * 
 * Class Circle is a class that extends Shape.
 * 
 * Author: Phanuwat Phoowichai
 * ID: 623040140-8
 * Sec: 2
 * Date: January 13, 2020 
 * 
 **/

package phoowichai.phanuwat.lab5;

import java.lang.Math;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class Circle extends Shape { // class Circle is a class that extends Shape
    protected double radius;

    public Circle() {
        super(); // superclass constructor
        this.radius = 1.0; // initializes radius with 1.0
    }

    public Circle(double radius) {
        super(); // superclass constructor
        this.radius = radius;
    }

    public Circle(double radius, String color, boolean filled) {
        // It used the first double variable to initializes radius.
        // The second and third will be used to call superclass’s constructor.
        super(); // superclass constructor
        this.radius = radius;
        this.color = color;
        this.filled = filled;
    }

    public double getRadius() { // get radius
        return this.radius;
    }

    public void setRadius(double radius) { // set radius
        this.radius = radius;
    }

    public double getArea() { // calculates the area of the circle with respect to radius
        BigDecimal arex = BigDecimal.valueOf(Math.PI * this.radius * this.radius);
        arex = arex.setScale(2, RoundingMode.HALF_UP);
        return arex.doubleValue();
    }

    public double getPerimeter() { // calculates the perimeter of the circle with respect to radius
        BigDecimal perx = BigDecimal.valueOf(2 * Math.PI * this.radius);
        perx = perx.setScale(2, RoundingMode.HALF_UP);
        return perx.doubleValue();
    }

    @Override // indicate and check that the method is overriding that class method
    public String toString() {
        return String.format(super.toString() + ", Radius:" + this.radius);
    }
}