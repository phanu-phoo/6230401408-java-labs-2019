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

    protected JButton mvUp, mvDown, mvLeft, mvRight, reSet;
    JPanel canvasPanel;

	protected JPanel overAllPanel;
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