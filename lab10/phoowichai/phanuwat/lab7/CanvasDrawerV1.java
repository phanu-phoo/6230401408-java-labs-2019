package phoowichai.phanuwat.lab7;

import javax.swing.*;
import java.awt.*;

public class CanvasDrawerV1 extends JPanel {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    // constants
    protected final int CANVAS_WIDTH = 800;
    protected final int CANVAS_HEIGHT = 500;
    final Color CANVAS_BACKGROUND = Color.GREEN;
    final int DOT_CIRCLE_RADIUS = 5;
    final int CIRCLE_RADIUS = 50;

    // constructor
    public CanvasDrawerV1() {
        super();

        // set canva size
        setPreferredSize(new Dimension(CANVAS_WIDTH, CANVAS_HEIGHT));

        // set canva backgroud color
        setBackground(CANVAS_BACKGROUND);
    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D) g;

        // set line
        BasicStroke LINE_WIDTH = new BasicStroke(4);
        g2d.setStroke(LINE_WIDTH);

        // C
        g2d.drawLine(CANVAS_WIDTH / 2, 0, CANVAS_WIDTH / 2, CANVAS_HEIGHT);

        // D
        g2d.drawRect(0, 150, 60, CANVAS_HEIGHT-(2*150));

        // E
        g2d.drawRect(0, 80, 150, CANVAS_HEIGHT-(2*80));

        // F
        g2d.fillOval(105 - DOT_CIRCLE_RADIUS, 250 - DOT_CIRCLE_RADIUS, DOT_CIRCLE_RADIUS * 2, DOT_CIRCLE_RADIUS * 2);

        // G
        g2d.drawRect(CANVAS_WIDTH-60, 150, 60, CANVAS_HEIGHT-(2*150));

        // H
        g2d.drawRect(CANVAS_WIDTH-150, 80, 150, CANVAS_HEIGHT-(2*80));

        // I
        g2d.fillOval(CANVAS_WIDTH - 105 - DOT_CIRCLE_RADIUS, CANVAS_HEIGHT - 250 - DOT_CIRCLE_RADIUS,
                DOT_CIRCLE_RADIUS * 2, DOT_CIRCLE_RADIUS * 2);

        // J
        g2d.setColor(Color.WHITE); // set color
        g2d.drawOval(CANVAS_WIDTH / 2 - CIRCLE_RADIUS, CANVAS_HEIGHT / 2 - CIRCLE_RADIUS, CIRCLE_RADIUS * 2,
                CIRCLE_RADIUS * 2);
    }
}