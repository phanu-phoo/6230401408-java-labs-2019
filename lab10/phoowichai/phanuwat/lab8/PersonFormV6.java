/**
 * 
 * Create the program called PersonFormV6 which is a subclass of PersonFormV5 from Lab6.
 * You should start PersonFormV6 by extending PersonFormV5 until
 * you can run the program similar to PersonFormV5.
 * The main() and createAndShowGUI() should be as shown in Figure 1.
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

import phoowichai.phanuwat.lab6.*;

public class PersonFormV6 extends PersonFormV5 implements ActionListener {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    protected ImageIcon javaIcon = new ImageIcon("images/java.jpg");
    protected String hobby = "";
    protected String strMsg ="";

    String resultString;

    public PersonFormV6(String msg) {
        super(msg);
    }

    @Override
    public void actionPerformed(ActionEvent event) {
        Object srcObj = event.getSource();
        if (srcObj == okButton) { // check radio button
            handleOkButton();
        } else if (srcObj == cancelButton) {
            // set all text field and teat area to empty
            tfName.setText("");
            tfHeight.setText("");
            tfWeight.setText("");
            tfDoB.setText("");
            noteArea.setText("");
        }
    }

    protected void handleOkButton() {
        String info = getOkButtonInfo();
        JOptionPane.showMessageDialog(this, info, "Person Information", JOptionPane.INFORMATION_MESSAGE, javaIcon);
    }

    protected String getOkButtonInfo() {
        // text from radio button
        String resultOfRadioBt = "";
        if (radioStd.isSelected()) {
            resultOfRadioBt = "Student";
        } else if (radioTch.isSelected()) {
            resultOfRadioBt = "Teacher";
        }

        // text formMessage dialog
        resultString = "Name : " + tfName.getText() +
            "\nHeight (cm) : " + tfHeight.getText() +
            "\nWeight (kg) : " + tfWeight.getText() +
            "\nDate of Birth : " + tfDoB.getText() +
            "\nType : " + resultOfRadioBt +
            "\nSport : " + sportBox.getSelectedItem() +
            "\nHobbies : " + String.join(" ", hobbiesList.getSelectedValuesList()) + "\nNote : " + noteArea.getText();

        return resultString;  // message for ok button.
    }

    public void addListeners() {
        // add action listener to object
        okButton.addActionListener(this);
        cancelButton.addActionListener(this);
    }

    public static void createAndShowGUI() {
        PersonFormV6 personFormV6 = new PersonFormV6("Person Form V6");
        personFormV6.addComponents();
        personFormV6.initComponents();
        personFormV6.addMenus();
        personFormV6.addListeners();
        personFormV6.setFrameFeatures();
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                createAndShowGUI();
            }
        });
    }
}