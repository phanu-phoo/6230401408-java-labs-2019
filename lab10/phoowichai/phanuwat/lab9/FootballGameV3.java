/**
 * 
 * 
 * 
 * Author: Phanuwat Phoowichai
 * ID: 623040140-8
 * Sec: 2
 * Date: February 24, 2020
 * 
 **/

package phoowichai.phanuwat.lab9;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class FootballGameV3 extends FootballGameV2 {
    /**
     *
     */
    private static final long serialVersionUID = 1L;
    CanvasDrawerV5 canvasDrawerV5;

    public FootballGameV3(String title) {
        super(title);
    }

    @Override
    public void drawPanel() { // method creat and add drawed Panel
        canvasDrawerV5 = new CanvasDrawerV5();
        overAllPanel = new JPanel(new BorderLayout());
        overAllPanel.add(canvasDrawerV5, BorderLayout.CENTER);
    }

    //--------------Actionlistener section.--------------
    @Override
    public void addListeners() {
        super.addListeners();
        reSet.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        super.actionPerformed(e);
        Object object = e.getSource();

        if (object == reSet) {
            resetScore();
            canvasDrawerV5.resetBall(); // This medthod is in CanvasDrawerV5.
        } else if (object == mvUp) {
            canvasDrawerV5.keeperLeft.moveUp();
        } else if (object == mvDown) {
            canvasDrawerV5.keeperLeft.moveDown();
        } else if (object == mvLeft) {
            canvasDrawerV5.KeeperRight.moveUp();
        } else if (object == mvRight) {
            canvasDrawerV5.KeeperRight.moveDown();
        }
    }

    @Override
	public void keyPressed(KeyEvent e) {
        int key = e.getKeyCode();
        
        if (key == KeyEvent.VK_UP) {
            canvasDrawerV5.KeeperRight.moveUp();
        } else if (key == KeyEvent.VK_DOWN) {
            canvasDrawerV5.KeeperRight.moveDown();
        } else if (key == KeyEvent.VK_W) {
            canvasDrawerV5.keeperLeft.moveUp();
        } else if (key == KeyEvent.VK_S) {
            canvasDrawerV5.keeperLeft.moveDown();
        }
    }
    //-----------------------------------------------------
    
    public void resetScore() {
        firstTF.setText("0");
        secondTF.setText("0");
    }

    public static void createAndShowGUI() {
        FootballGameV3 window = new FootballGameV3("Football Game V3");
        window.drawPanel();
        window.addComponents();
        window.addListeners();
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