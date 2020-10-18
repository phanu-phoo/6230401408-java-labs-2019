/**
 * 
 * Create the program called PersonFormV10 which inherited from PersonFormV9.
 * PersonFormV10 should have all the properties and capability as PersonFormV9.
 * 
 * Author: Phanuwat Phoowichai
 * ID: 623040140-8
 * Sec: 2
 * Date: February 17, 2020
 * 
 **/

package phoowichai.phanuwat.lab8;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class PersonFormV10 extends PersonFormV9 {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    public PersonFormV10(String msg) {
        super(msg);
    }

    @Override
    public void actionPerformed(ActionEvent event) {
        super.actionPerformed(event);
        Object srcObj = event.getSource();

        if (srcObj == redColor) {
            changeTextColor(Color.RED);
        } else if (srcObj == greenColor) {
            changeTextColor(Color.GREEN);
        } else if (srcObj == blueColor) {
            changeTextColor(Color.BLUE);
        } else if (srcObj == sixteenSize) {
            changeTextSize(16);
        } else if (srcObj == twentySize) {
            changeTextSize(20);
        } else if (srcObj == twentyfourSize) {
            changeTextSize(24);
        }
    }

    public void changeTextColor(Color textColor) {
        Color TEXTCOLOR = textColor;
        tfName.setForeground(TEXTCOLOR);
        tfHeight.setForeground(TEXTCOLOR);
        tfWeight.setForeground(TEXTCOLOR);
        tfDoB.setForeground(TEXTCOLOR);
        noteArea.setForeground(TEXTCOLOR);
    }

    public void changeTextSize(int textSize) {
        Font TEXTSIZE = new Font("Serif", Font.BOLD, textSize);
        tfName.setFont(TEXTSIZE);
        tfHeight.setFont(TEXTSIZE);
        tfWeight.setFont(TEXTSIZE);
        tfDoB.setFont(TEXTSIZE);
        noteArea.setFont(TEXTSIZE);
    }

    public void addListeners() {
        super.addListeners();

        // add action listener to object
        redColor.addActionListener(this);
        greenColor.addActionListener(this);
        blueColor.addActionListener(this);

        sixteenSize.addActionListener(this);
        twentySize.addActionListener(this);
        twentyfourSize.addActionListener(this);
    }

    protected void addKeys() {
        // add accelerator keys to menu items
        redColor.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_R, ActionEvent.CTRL_MASK));
        greenColor.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_G, ActionEvent.CTRL_MASK));
        blueColor.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_B, ActionEvent.CTRL_MASK));
        
        sixteenSize.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_1, ActionEvent.CTRL_MASK));
        twentySize.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_0, ActionEvent.CTRL_MASK));
        twentyfourSize.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_4, ActionEvent.CTRL_MASK));

        // add mnemonic keys to menu items
        configMenu.setMnemonic('C');
        colorMenu.setMnemonic('L');
        sizeMenu.setMnemonic('Z');

        redColor.setMnemonic('R');
        greenColor.setMnemonic('G');
        blueColor.setMnemonic('B');

        sixteenSize.setMnemonic('1');
        twentySize.setMnemonic('0');
        twentyfourSize.setMnemonic('4');

    }

    public static void createAndShowGUI() {
        PersonFormV10 personFormV10 = new PersonFormV10("Person Form V10");
        personFormV10.addComponents();
        personFormV10.initComponents();
        personFormV10.addMenus();
        personFormV10.addListeners();
        personFormV10.addKeys();
        personFormV10.setFrameFeatures();
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                createAndShowGUI();
            }
        });
    }
}