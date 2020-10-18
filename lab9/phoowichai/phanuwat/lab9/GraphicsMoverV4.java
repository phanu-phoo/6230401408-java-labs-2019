/**
 * 
 * Create the program called GraphicsMoverV4 which is a subclass of GraphicsMoverV3 from Lab7
 * 
 * Author: Phanuwat Phoowichai
 * ID: 623040140-8
 * Sec: 2
 * Date: February 24, 2020
 * 
 **/

package phoowichai.phanuwat.lab9;

import java.awt.*;
import javax.swing.*;

import phoowichai.phanuwat.lab7.*;

public class GraphicsMoverV4 extends GraphicsMoverV3 {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    CanvasDrawerV2 canvasDrawerV2;

    public GraphicsMoverV4(String title) {
        super(title);
    }

    @Override
    public void drawPanel() {
        canvasDrawerV2 = new CanvasDrawerV2();
        overAllPanel = new JPanel(new BorderLayout());
        overAllPanel.add(canvasDrawerV2, BorderLayout.CENTER);
    }

    protected void addComponents() {
        super.addComponents();

        // set new text of button
        mvUp.setText("Move Left Up");
        mvDown.setText("Move Left Down");
        mvLeft.setText("Move Right Up");
        mvRight.setText("Move RIght Down");
    }

    public static void createAndShowGUI() {
        GraphicsMoverV4 window = new GraphicsMoverV4("Graphics Mover Version 4");
        window.drawPanel();
        window.addComponents();
        window.addMenus();
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