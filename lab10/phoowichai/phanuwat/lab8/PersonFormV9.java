/**
 * 
 * Create the program called PersonFormV9 which inherited from PersonFormV8.
 * PersonFormV9 should have all the properties and capability as PersonFormV8.
 * 
 * Author: Phanuwat Phoowichai
 * ID: 623040140-8
 * Sec: 2
 * Date: February 17, 2020
 * 
 **/

package phoowichai.phanuwat.lab8;

import javax.swing.*;
import javax.swing.event.*;

public class PersonFormV9 extends PersonFormV8 implements ListSelectionListener {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    public PersonFormV9(String msg) {
        super(msg);
    }

    @Override
    public void valueChanged(ListSelectionEvent event) {
        Object srcObj = event.getSource();
        if (srcObj == hobbiesList) {
            // show message dialog, if event is hobbiesList (list<string>)
            JOptionPane.showMessageDialog(this,
                    "Selected Hobbies : " + String.join(" ", hobbiesList.getSelectedValuesList()), "Person Information",
                    JOptionPane.INFORMATION_MESSAGE, javaIcon);
        }
    }

    public void addListeners() {
        super.addListeners();

        // add action listener to object
        hobbiesList.addListSelectionListener(this);
    }

    public static void createAndShowGUI() {
        PersonFormV9 personFormV9 = new PersonFormV9("Person Form V9");
        personFormV9.addComponents();
        personFormV9.initComponents();
        personFormV9.addMenus();
        personFormV9.addListeners();
        personFormV9.setFrameFeatures();
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                createAndShowGUI();
            }
        });
    }
}