package phoowichai.phanuwat.lab9;

import java.awt.geom.*;

class Keeper extends Rectangle2D.Double {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    final static int KEEPER_WIDTH = 20;
    final static int KEEPER_HEIGHT = 50;
    final static int KEEPER_SPEED = 10;

    Keeper(int x, int y) {
        super(x, y, KEEPER_WIDTH, KEEPER_HEIGHT);
    }

    public void moveUp() {
        if (y - KEEPER_SPEED >= 150) {
            y = y - KEEPER_SPEED;
        }
    }

    public void moveDown() {
        if (y + KEEPER_HEIGHT + KEEPER_SPEED <= 350) {
            y = y + KEEPER_SPEED;
        }
    }
}