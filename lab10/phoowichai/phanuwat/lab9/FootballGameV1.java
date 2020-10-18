/**
 * 
 * Create the program called FootballGameV1 which is a subclass of GraphicsMoverV4
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

public class FootballGameV1 extends GraphicsMoverV4 {
    /**
     *
     */
    private static final long serialVersionUID = 1L;
    CanvasDrawerV3 canvasDrawerV3;

    public FootballGameV1(String title) {
        super(title);
    }

    @Override
    public void drawPanel() { // method creat and add drawed Panel
        canvasDrawerV3 = new CanvasDrawerV3();
        overAllPanel = new JPanel(new BorderLayout());
        overAllPanel.add(canvasDrawerV3, BorderLayout.CENTER);
    }

    public static void createAndShowGUI() {
        FootballGameV1 window = new FootballGameV1("Football Game V1");
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