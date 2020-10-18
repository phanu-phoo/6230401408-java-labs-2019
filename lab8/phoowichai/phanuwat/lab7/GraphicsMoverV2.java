/**
 * 
 * Develop the program GraphicsMoverV2 that extends from GraphicsMoverV1
 * and then add the score panel at the top of the green canvas as shown in Figure 4. 
 * 
 * Author: Phanuwat Phoowichai
 * ID: 623040140-8
 * Sec: 2
 * Date: February 10, 2020
 * 
 **/

package phoowichai.phanuwat.lab7;

import java.awt.*;
import javax.swing.*;

public class GraphicsMoverV2 extends GraphicsMoverV1 {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    JPanel scorePanel;
    JLabel firstLabel, secondLabel;
    JTextField firstTF, secondTF;

    public GraphicsMoverV2(String title) {
        super(title);
    }

    protected void addComponents() {
        super.addComponents();

        // set new components
        scorePanel = new JPanel(new FlowLayout(FlowLayout.RIGHT));
        firstLabel = new JLabel("Khonkaen");
        secondLabel = new JLabel("Udon Thani");
        firstTF = new JTextField("3");
        secondTF = new JTextField("1");

        // set foreground and font
        firstLabel.setForeground(Color.BLUE);
        secondLabel.setForeground(Color.RED);
        firstTF.setFont(new Font("Serif", Font.BOLD, 20));
        secondTF.setFont(new Font("Serif", Font.BOLD, 20));

        // add components to panel
        scorePanel.add(firstLabel);
        scorePanel.add(firstTF);
        scorePanel.add(secondLabel);
        scorePanel.add(secondTF);

        // add scorePanel to overAllPanel
        overAllPanel.add(scorePanel, BorderLayout.NORTH);
    }

    public static void createAndShowGUI() {
        GraphicsMoverV2 window = new GraphicsMoverV2("Graphics Mover Version 2");
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