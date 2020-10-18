package phoowichai.phanuwat.lab9;

public class CanvasDrawerV5 extends CanvasDrawerV4 {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

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

            // Check if the ball hits the right goalkeeper.
            else if (isHitKeeperRight()) {
                changeXVelocity();
            }

            // Check if the ball hits the left goalkeeper.
            else if (isHitKeeperLeft()) {
                changeXVelocity();
            }

            // Check if the ball passes the goal.
            if (isBallDissaper()) {
                resetBall();
                setBallVelocity();
            }

            ball.move();

            repaint();

            try {
                Thread.sleep(10);
            } catch (InterruptedException ex) {

            }
        }
    }

    // --------------------------Condition.------------------------------
    protected boolean isBallDissaper() {
        return ball.getX() > CANVAS_WIDTH || ball.getX() + Ball.BALL_DIAMETER < 0;
    }

    // ---------------------------Actions.--------------------------------
    protected void setBallVelocity() {
        int xv = randomX.nextInt(max - min + 1) + min;
        int yv = randomY.nextInt(max - min + 1) + min;

        // Make sure that's velocity isn't = 0.
        if (xv == 0)
            xv++;
        else if (yv == 0)
            yv++;

        this.ball.setXVelocity(xv);
        this.ball.setYVelocity(yv);
    }

    protected void resetBall() {
        ball.x = (CANVAS_WIDTH / 2) - (Ball.BALL_DIAMETER / 2);
        ball.y = (CANVAS_HEIGHT / 2) - (Ball.BALL_DIAMETER / 2);
        setBallVelocity();
    }

    // ---------------------------------------------------------------------
}