package phoowichai.phanuwat.lab9;

public class CanvasDrawerV4 extends CanvasDrawerV3 {
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

            ball.move();

            repaint();

            try {
                Thread.sleep(10);
            } catch (InterruptedException ex) {

            }
        }
    }

    // ------------------------Conditions.------------------------------- //
    protected boolean isHitKeeperRight() {
        return ball.getX() + Ball.BALL_DIAMETER >= KeeperRight.getX()
                && ball.getY() + Ball.BALL_DIAMETER >= KeeperRight.getY()
                && ball.getY() + Ball.BALL_DIAMETER <= KeeperRight.getY() + Keeper.KEEPER_HEIGHT;
    }

    protected boolean isHitKeeperLeft() {
        return ball.getX() <= keeperLeft.getX() + Keeper.KEEPER_WIDTH
                && ball.getY() + Ball.BALL_DIAMETER >= keeperLeft.getY()
                && ball.getY() + Ball.BALL_DIAMETER <= keeperLeft.getY() + Keeper.KEEPER_HEIGHT;
    }
}