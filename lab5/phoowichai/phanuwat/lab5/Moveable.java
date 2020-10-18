/**
 * 
 * Interface Moveable It has four void methods namely moveUp(int),
 * moveDown(int), moveRight(int) and moveLeft(int).
 * 
 * Author: Phanuwat Phoowichai
 * ID: 623040140-8
 * Sec: 2
 * Date: January 17, 2020
 *
 **/

package phoowichai.phanuwat.lab5;

interface Moveable { // Moveable is an interface
    public void moveUp(int y); // not method body

    public void moveDown(int y);

    public void moveRight(int x);

    public void moveLeft(int x);
}