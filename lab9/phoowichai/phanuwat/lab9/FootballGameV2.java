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

public class FootballGameV2 extends FootballGameV1 implements ActionListener, KeyListener {
    /**
     *
     */
    private static final long serialVersionUID = 1L;
    CanvasDrawerV4 canvasDrawerV4;

    public FootballGameV2(String title) {
        super(title);
        setFocusable(true);
        requestFocus();
    }

    @Override
    public void drawPanel() { // method creat and add drawed Panel
        canvasDrawerV4 = new CanvasDrawerV4();
        overAllPanel = new JPanel(new BorderLayout());
        overAllPanel.add(canvasDrawerV4, BorderLayout.CENTER);
    }

    public static void createAndShowGUI() {
        FootballGameV2 window = new FootballGameV2("Football Game V2");
        window.drawPanel();
        window.addComponents();
        window.addListeners();
        window.addMenus();
        window.setFrameFeatures();
    }

    
    //------------Actionlistener section.---------------
    public void addListeners() {
        mvUp.addActionListener(this);
        mvDown.addActionListener(this);
        mvLeft.addActionListener(this);
        mvRight.addActionListener(this);

        this.addKeyListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object object = e.getSource();

        if (object == mvUp) {
            canvasDrawerV4.keeperLeft.moveUp();
        } else if (object == mvDown) {
            canvasDrawerV4.keeperLeft.moveDown();
        } else if (object == mvLeft) {
            canvasDrawerV4.KeeperRight.moveUp();
        } else if (object == mvRight) {
            canvasDrawerV4.KeeperRight.moveDown();
        }

        requestFocus();
    }

    //----------------Keylistener section.---------------
    @Override
	public void keyPressed(KeyEvent e) {
        int key = e.getKeyCode();
        
        if (key == KeyEvent.VK_UP) {
            canvasDrawerV4.KeeperRight.moveUp();
        } else if (key == KeyEvent.VK_DOWN) {
            canvasDrawerV4.KeeperRight.moveDown();
        } else if (key == KeyEvent.VK_W) {
            canvasDrawerV4.keeperLeft.moveUp();
        } else if (key == KeyEvent.VK_S) {
            canvasDrawerV4.keeperLeft.moveDown();
        }
    }

    @Override
    public void keyTyped(KeyEvent e) {
    }

    @Override
    public void keyReleased(KeyEvent e) {
    }

    //-----------------------------------------------------

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                createAndShowGUI();
            }
        });
    }

}