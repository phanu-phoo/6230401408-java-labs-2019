package phoowichai.phanuwat.lab9;

import java.awt.geom.*;

class Ball extends Ellipse2D.Double {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    final static int BALL_DIAMETER = 30;
    private int xVelocity, yVelocity;

    // first constructor accepts two values
    Ball(int x, int y) {
        super(x, y, BALL_DIAMETER, BALL_DIAMETER);

        xVelocity = 0;
        yVelocity = 0;
    }

    // second constructor accepts four values
    Ball(int x, int y, int xVelocity, int yVelocity) {
        super(x, y, BALL_DIAMETER, BALL_DIAMETER);

        this.xVelocity = 0;
        this.yVelocity = 0;
    }

    // getters and setters for xVelocity and yVelocity
    public int getXVelocity() {
        return xVelocity;
    }

    public void setXVelocity(int xVelocity) {
        this.xVelocity = xVelocity;
    }

    public int getYVelocity() {
        return yVelocity;
    }

    public void setYVelocity(int yVelocity) {
        this.yVelocity = yVelocity;
    }

    public void move() {
        x += xVelocity;
        y += yVelocity;
    }
}