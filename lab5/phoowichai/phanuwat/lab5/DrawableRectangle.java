/**
 * 
 * Class DrawableRectangle inherited from Rectangle
 * and implements Drawable and Moveable.
 * 
 * Author: Phanuwat Phoowichai
 * ID: 623040140-8
 * Sec: 2
 * Date: January 17, 2020
 *
 **/

package phoowichai.phanuwat.lab5;

public class DrawableRectangle extends Rectangle implements Drawable, Moveable {
    private double x;
    private double y;

    public DrawableRectangle() { // calls superclass constructor and set x and y to default
        super();
        this.x = 0.0;
        this.y = 0.0;
    }

    public DrawableRectangle(double x, double y) { // calls superclass constructor and set x and y to inout arguments
        super();
        this.x = x;
        this.y = y;
    }

    public DrawableRectangle(double x, double y, double width, double lenght, String color, boolean filled) {
        super(width, lenght, color, filled);
        this.x = x;
        this.y = y;
    }

    public double getX() { // get X position
        return x;
    }

    public void setX(double x) { // set X position
        this.x = x;
    }

    public double getY() { // get Y position
        return y;
    }

    public void setY(double y) { // set Y position
        this.y = y;
    }

    @Override // indicate and check that the method is overriding that class method
    public String toString() {
        return String.format(
                "Color:" + getColor() + ", Filled:" + isFilled() + ", width:" + getWidth() + ", length:" + getLength());
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
        return String.format("draw a rectangle with top left corner at (" + getX() + "," + getY() + ") with width="
                + getWidth() + " length=" + getLength());
    }
}