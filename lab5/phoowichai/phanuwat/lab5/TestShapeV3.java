/**
 * 
 * Write java classes named DrawableCircle and DrawableRectangle and
 * Interface named Moveable and Drawable according to UML class diagram shown in Figure 7.
 * DrawableCircle and DrawableRectangle inherited from Circle and Rectangle respectively.
 * 
 * Author: Phanuwat Phoowichai
 * ID: 623040140-8
 * Sec: 2
 * Date: January 17, 2020
 * 
 **/

package phoowichai.phanuwat.lab5;

public class TestShapeV3 {
    public static void main(String[] args) {
        DrawableRectangle r1 = new DrawableRectangle();
        System.out.println("First drawable rectangle " + r1);
        System.out.println(r1.draw());
        r1.moveUp(3);
        r1.moveRight(2);
        System.out.println("After move 3 up and 2 to the right " + r1.draw());

        DrawableCircle c1 = new DrawableCircle(2, 3, 5, "Red", true);
        System.out.println("First drawable circle " + c1);
        System.out.println(c1.draw());
        c1.moveDown(3);
        c1.moveLeft(2);
        System.out.println("After move 3 down and 2 to the left" + c1.draw());
    }
}