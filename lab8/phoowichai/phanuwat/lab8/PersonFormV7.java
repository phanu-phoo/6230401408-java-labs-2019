/**
 * 
 * Create a program called PersonFormV7 which is inherited from PersonFormV6.
 * PersonFormV7 inherited from PersonFormV6 which should have all the properties
 * and capability that PersonFormV6 has.
 * The main() and createAndShowGUI() should be as shown in Figure 5.
 * 
 * Author: Phanuwat Phoowichai
 * ID: 623040140-8
 * Sec: 2
 * Date: February 17, 2020
 * 
 **/

package phoowichai.phanuwat.lab8;

import java.awt.event.*;
import javax.swing.*;

public class PersonFormV7 extends PersonFormV6 {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    public PersonFormV7(String msg) {
        super(msg);
    }

    @Override
    public void actionPerformed(ActionEvent event) {
        super.actionPerformed(event);
        Object srcObj = event.getSource();
        if (srcObj == radioStd) {
            // show message dialog, if event is student (radio button)
            JOptionPane.showMessageDialog(this, "Type : student has been selected", "Person Information",
                JOptionPane.INFORMATION_MESSAGE, new ImageIcon("images/java.jpg"));
        } else if (srcObj == radioTch) {
            // show message dialog, if event is student (radio button)
            JOptionPane.showMessageDialog(this, "Type : teacher has been selected", "Person Information",
                JOptionPane.INFORMATION_MESSAGE, new ImageIcon("images/java.jpg"));
        }
    }

    public void addListeners() {
        super.addListeners();

        // add action listener to object
        radioStd.addActionListener(this);
        radioTch.addActionListener(this);
    }

    public static void createAndShowGUI() {
        PersonFormV7 personFormV7 = new PersonFormV7("Person Form V7");
        personFormV7.addComponents();
        personFormV7.initComponents();
        personFormV7.addMenus();
        personFormV7.addListeners();
        personFormV7.setFrameFeatures();
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                createAndShowGUI();
            }
        });
    }
}