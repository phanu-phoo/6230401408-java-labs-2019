package phoowichai.phanuwat.lab9;

import java.util.*;

class CanvasDrawerV3 extends CanvasDrawerV2 implements Runnable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    protected Thread running;
    protected Random randomX, randomY;
    protected int max = 2, min = -2;

    public CanvasDrawerV3() {
        super();
        running = new Thread(this);

        randomX = new Random();
        randomY = new Random();

        int xv = randomX.nextInt(max - min + 1) + min;
        int yv = randomY.nextInt(max - min + 1) + min;

        if (xv == 0 ) {
            xv += 1;
        } else if (yv == 0) {
            yv += 1;
        }

        this.ball.setXVelocity(xv);
        this.ball.setYVelocity(yv);

        running.start();
    }

    @Override
    public void run() {
        while (true) {
            // Check if the ball hits the vertical wall.
            if (isHitVerticalWall()) {
                // Check if the ball doesn't hit the goal.
                if (isNotHitGoal()) {
                    changeXVelocity();
                }
            }
            // Check if the ball hits the horizintal wall.
            else if (isHitHorizontalWall()) {
                changeYVelocity();
            }

            ball.move();

            repaint();

            try {
                Thread.sleep(10);
            } catch (InterruptedException ex) {

            }
        }
    }

    // --------------------------------Conditions.---------------------------------
    protected boolean isHitVerticalWall() {
        return ball.getX() <= 0 || ball.getX() + Ball.BALL_DIAMETER >= CANVAS_WIDTH;
    }

    protected boolean isHitHorizontalWall() {
        return ball.getY() <= 0 || ball.getY() + Ball.BALL_DIAMETER >= CANVAS_HEIGHT;
    }

    protected boolean isNotHitGoal() {
        return ball.getY() + Ball.BALL_DIAMETER <= 150 || ball.getY() + Ball.BALL_DIAMETER >= 350;
    }

    // ----------------------------------Actions.-----------------------------------

    // Change x velocity.
    protected void changeXVelocity() {
        int xVelocity = this.ball.getXVelocity();
        this.ball.setXVelocity(xVelocity * -1);
    }

    // Change y velocity.
    protected void changeYVelocity() {
        int yVelocity = this.ball.getYVelocity();
        this.ball.setYVelocity(yVelocity * -1);
    }

    // ---------------------------------------------------------------------------------
}