/**
 * 
 * Create a program called PersonFormV8 which is inherited from PersonFormV7.
 * PersonFormV8 should have all the properties and capability as PersonFormV7.
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

public class PersonFormV8 extends PersonFormV7 {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    public PersonFormV8(String msg) {
        super(msg);
    }

    @Override
    public void actionPerformed(ActionEvent event) {
        super.actionPerformed(event);
        Object srcObj = event.getSource();
        if (srcObj == sportBox) {
            // show message dialog, if event is sportbox (combo box)
            JOptionPane.showMessageDialog(this, "Your sport is now changed to " + sportBox.getSelectedItem(),
                    "Person Information", JOptionPane.INFORMATION_MESSAGE, javaIcon);
        }
    }

    public void addListeners() {
        super.addListeners();

        // add action listener to object
        sportBox.addActionListener(this);
    }

    public static void createAndShowGUI() {
        PersonFormV8 personFormV8 = new PersonFormV8("Person Form V8");
        personFormV8.addComponents();
        personFormV8.initComponents();
        personFormV8.addMenus();
        personFormV8.addListeners();
        personFormV8.setFrameFeatures();
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                createAndShowGUI();
            }
        });
    }
}