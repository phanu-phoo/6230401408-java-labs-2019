/**
 * 
 * Author: Phanuwat Phoowichai
 * ID: 623040140-8
 * Sec: 2
 * Date: March 14, 2020
 * 
 **/

package phoowichai.phanuwat.lab10;

import javax.swing.*;
import java.time.*;

public class PersonFormV13 extends PersonFormV12 {
    private static final long serialVersionUID = 1L;

    // constant value
    private double MIN_HEIGHT = 100.00;
    private double MAX_HEIGHT = 250.00;
    private double MIN_WEIGHT = 40.00;
    private double MAX_WEIGHT = 150.00;
    private double MIN_DAY = 1.00;
    private double MAX_DAY = 31.00;
    private double MIN_MONTH = 1.00;
    private double MAX_MONTH = 12.00;
    private double MIN_YEAR = 1900.00;
    private double MAX_YEAR = 2010.00;
    private String strErr;

    public PersonFormV13(String message) {
        super(message);
    }

    protected void handleOkButton() { // click "OK"
        if (checkError()) { // check error -+- error = true
            JOptionPane.showMessageDialog(this, strErr, "Message", JOptionPane.INFORMATION_MESSAGE, javaIcon);
        } else { // error = flase
            createPerson();
            personList.add(person); // add person to list
            String info = getOkButtonInfo();
            info += "\n" + "\n" + "Adding this person into the list : " + person;
            JOptionPane.showMessageDialog(this, info, "Person Information", JOptionPane.INFORMATION_MESSAGE, javaIcon);
        }
    }

    protected boolean checkError() {
        strErr = "";
        if (tfName.getText().equals("")) { // ckeck name text field
            strErr += "Please enter name. \n";
        }
        try {
            int height = Integer.parseInt(tfHeight.getText()); // ckeck hight text field
            strErr += checkDecimalException(height, " height", MIN_HEIGHT, MAX_HEIGHT);
        } catch (NumberFormatException e) {
            strErr += "Please enter numeric input for height. \n";
        }
        try {
            int weight = Integer.parseInt(tfWeight.getText()); // ckeck weight text field
            strErr += checkDecimalException(weight, " weight", MIN_WEIGHT, MAX_WEIGHT);
        } catch (NumberFormatException e) {
            strErr += "Please enter numeric input for weight. \n";
        }
        String[] dobList = tfDoB.getText().split("-");
        try { // ckeck date of birth text field
            int year = Integer.parseInt(dobList[2]);
            int month = Integer.parseInt(dobList[1]);
            int day = Integer.parseInt(dobList[0]);
            strErr += checkDecimalException(day, " day", MIN_DAY, MAX_DAY);
            strErr += checkDecimalException(month, " month", MIN_MONTH, MAX_MONTH);
            strErr += checkDecimalException(year, " year", MIN_YEAR, MAX_YEAR);
        } catch (DateTimeException e) {
            strErr += "Please enter date. \n";
        }
        if (strErr.equals("")) {
            return false;
        } else {
            return true;
        }
    }

    protected String checkDecimalException(Integer IntegerInFeild, String textFor, double min, double max) {
        // check min and max of value
        if (IntegerInFeild >= min && IntegerInFeild <= max) {
            return "";
        }
        return String.format("Valid values for %s are [%.2f, %.2f]\n", textFor, min, max);
    }

    public static void createAndShowGUI() {
        PersonFormV13 personFormV13 = new PersonFormV13("Person Form V13");
        personFormV13.addComponents();
        personFormV13.initComponents();
        personFormV13.addMenus();
        personFormV13.addListeners();
        personFormV13.addKeys();
        personFormV13.setFrameFeatures();
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                createAndShowGUI();
            }
        });
    }
}
