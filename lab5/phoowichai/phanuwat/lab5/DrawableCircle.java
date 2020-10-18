/**
 * 
 * Class DrawableCircle inherited from Circle
 * and implements Drawable and Movable
 * 
 * Author: Phanuwat Phoowichai
 * ID: 623040140-8
 * Sec: 2
 * Date: January 17, 2020
 *
 **/

package phoowichai.phanuwat.lab5;

public class DrawableCircle extends Circle implements Drawable, Moveable {
    private double x;
    private double y;

    public DrawableCircle() { // calls superclass constructor and set x and y to default
        super();
        this.x = 0.0;
        this.y = 0.0;
    }

    public DrawableCircle(double x, double y) { // calls superclass constructor and set x and y to inout arguments
        super();
        this.x = x;
        this.y = y;
    }

    public DrawableCircle(double x, double y, double radius, String color, boolean filled) { // calls superclass
                                                                                             // constructor and set x
                                                                                             // and y to input arguments
        super(radius, color, filled);
        this.x = x;
        this.y = y;
    }

    public double getX() { // get X position
        return this.x;
    }

    public void setX(double x) { // set X position
        this.x = x;
    }

    public double getY() { // get Y position
        return this.y;
    }

    public void setY(double y) { // set y position
        this.y = y;
    }

    @Override // indicate and check that the method is overriding that class method
    public String toString() {
        return String.format("Color:" + getColor() + ", Filled:" + isFilled() + ", radius:" + getRadius());
    }

    // write method from interface
    public void moveUp(int y) { // Moveable interface
        this.y += y;
    }

    public void moveDown(int y) {
        this.y -= y;
    }

    public void moveRight(int x) {
        this.x += x;
    }

    public void moveLeft(int x) {
        this.x -= x;
    }

    public String draw() { // Drawable interface
        return String
                .format("draw a circle with the center at (" + getX() + "," + getY() + ") with radius=" + getRadius());
    }
}