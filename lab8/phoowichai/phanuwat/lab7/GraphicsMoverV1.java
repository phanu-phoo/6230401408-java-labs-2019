/**
 * 
 * Implement the program called GraphicsMoverV1 which extends from MyWindow
 * which is imported from package <your_lastname>.<your_firstname>.lab6
 * without any modification as shown in Figure 1.
 * You can run the program GraphicsMoverV1 using command line as shown in Figure 2.
 * 
 * Author: Phanuwat Phoowichai
 * ID: 623040140-8
 * Sec: 2
 * Date: February 9, 2020
 * 
 **/

package phoowichai.phanuwat.lab7;

import javax.swing.*;
import java.awt.*;

// import MySimpleWindow from lab6
import phoowichai.phanuwat.lab6.*;

public class GraphicsMoverV1 extends MySimpleWindow {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    JButton mvUp, mvDown, mvLeft, mvRight, reSet;
    JPanel canvasPanel, overAllPanel;
    CanvasDrawerV1 canvasDrawerV1;

    public GraphicsMoverV1(String title) {
        super(title);
    }

    public void drawPanel() {
        canvasDrawerV1 = new CanvasDrawerV1();
        
        // panel for all panel
        overAllPanel = new JPanel(new BorderLayout());

        // add canvas panel to overAllPanel
        overAllPanel.add(canvasDrawerV1, BorderLayout.CENTER);
    }

    protected void addComponents() {
        super.addComponents();

        // new button
        mvUp = new JButton("Move up");
        mvDown = new JButton("Move down");
        mvLeft = new JButton("Move left");
        mvRight = new JButton("Move right");
        reSet = new JButton("Reset");

        // remove button in buttonPanel
        buttonPanel.removeAll();

        // add new button to buttonPanel
        buttonPanel.add(mvUp);
        buttonPanel.add(mvDown);
        buttonPanel.add(mvLeft);
        buttonPanel.add(mvRight);
        buttonPanel.add(reSet);

        // add buttonPanel to overAllPanel
        overAllPanel.add(buttonPanel, BorderLayout.SOUTH);

        // set overAllPanel to window
        this.add(overAllPanel);
    }

    public static void createAndShowGUI() {
        GraphicsMoverV1 window = new GraphicsMoverV1("Graphics Mover Version 1");
        window.drawPanel();
        window.addComponents();
        window.setFrameFeatures();
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                createAndShowGUI();
            }
        });
    }
}

class CanvasDrawerV1 extends JPanel {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    // constants
    final int CANVAS_WIDTH = 800;
    final int CANVAS_HEIGHT = 500;
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