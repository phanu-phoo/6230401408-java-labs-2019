/**
 * 
 * Class Shape is an abstract class. An abstract class is a class that is
 * declared abstract. Abstract classes cannot be instantiated, but they can be
 * subclassed.
 * 
 * Author: Phanuwat Phoowichai
 * ID: 623040140-8
 * Sec: 2
 * Date: January 13, 2020
 * 
 **/

package phoowichai.phanuwat.lab5;

public abstract class Shape { // Shape is abstract class
    protected String color;
    protected boolean filled;

    public Shape() { // set color and fill to default
        this.color = "White";
        this.filled = false;
    }

    public Shape(String color, boolean filled) { // color and fill to input arguments
        this.color = color;
        this.filled = filled;
    }

    public String getColor() { // getters for color
        return this.color;
    }

    public void setColor(String color) { // setters for color
        this.color = color;
    }

    public boolean isFilled() { // getters for filled
        return this.filled;
    }

    public void setFilled(boolean filled) { // setters for filled
        this.filled = filled;
    }

    abstract double getArea();

    abstract double getPerimeter();

    @Override // indicate and check that the method is overriding that class method
    public String toString() {
        return String.format("Color:" + color + ", Filled:" + filled);
    }
}