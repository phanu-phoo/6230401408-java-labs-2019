package phoowichai.phanuwat.lab9;

import java.awt.*;

import phoowichai.phanuwat.lab7.*;

class CanvasDrawerV2 extends CanvasDrawerV1 {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    protected Ball ball;
    protected Keeper keeperLeft, KeeperRight;

    public CanvasDrawerV2() {
        super();

        // make the ball located at the middle of the game
        ball = new Ball((CANVAS_WIDTH / 2) - (Ball.BALL_DIAMETER / 2), (CANVAS_HEIGHT / 2) - (Ball.BALL_DIAMETER / 2),
                Ball.BALL_DIAMETER, Ball.BALL_DIAMETER);

        // make the keeperLeft located in the middle of the left of the frame
        keeperLeft = new Keeper(0, CANVAS_HEIGHT / 2 - Keeper.KEEPER_HEIGHT / 2);

        // make the keeperRigth located in the middle of the right of the frame
        KeeperRight = new Keeper(CANVAS_WIDTH - Keeper.KEEPER_WIDTH, CANVAS_HEIGHT / 2 - Keeper.KEEPER_HEIGHT / 2);
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D) g;

        // draw ball
        g2d.setColor(Color.ORANGE);
        g2d.fill(ball);

        // draw keeper
        g2d.setColor(Color.BLUE);
        g2d.fill(keeperLeft);

        g2d.setColor(Color.RED);
        g2d.fill(KeeperRight);
    }
}