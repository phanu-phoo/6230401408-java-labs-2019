/**
 * 
 * Name : Phanuwat Phoowichai
 * Student ID : 623040140-8
 * 
 */

package phoowichai.phanuwat.exam3;

import javax.swing.*;
import java.awt.event.*;

public class Covid19StatsV1 extends Covid19StatsV0 implements ActionListener {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    String msg;

    public Covid19StatsV1(String title) {
        super(title);
        initComponents();
        addListeners();
    }

    public static void createAndShowGUI() {
        Covid19StatsV1 window = new Covid19StatsV1("Covid-19 Stats Version 1");
        window.setFrameFeatures();
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                createAndShowGUI();
            }
        });
    }

    protected void addListeners() {
        // add listener to menuItem
        okButton.addActionListener(this);
        cancelButton.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent event) {
        Object src = event.getSource();
        // add action event
        if (src == okButton) {
            handleOkButton();
        } else if (src == cancelButton) {
            handleCancelButton();
        }
    }

    public void handleOkButton() {
        if (cNameField.getText().equals("")) { // ckeck name text field
            msg = "Please enter a valid country name.";
            JOptionPane.showMessageDialog(this, msg, "Message", JOptionPane.INFORMATION_MESSAGE);
        }
        if (!cActiveCasesField.getText().equals("")) {
            try {
                if (Integer.parseInt(cActiveCasesField.getText()) < 0) {
                    msg = "Please enter non-negative number for active case";
                    JOptionPane.showMessageDialog(this, msg, "Message", JOptionPane.INFORMATION_MESSAGE);
                }
            } catch (NumberFormatException e) {
                msg = "Please enter only a number.";
                JOptionPane.showMessageDialog(this, msg, "Message", JOptionPane.INFORMATION_MESSAGE);
            }
        }
        if (!cAllCasesField.getText().equals("")) {
            try {
                if (Integer.parseInt(cAllCasesField.getText()) < 0) {
                    msg = "Please enter non-negative number for active case";
                    JOptionPane.showMessageDialog(this, msg, "Message", JOptionPane.INFORMATION_MESSAGE);
                }
                if (Integer.parseInt(cAllCasesField.getText()) == 0) {
                    msg = "cannot divide by zero";
                    JOptionPane.showMessageDialog(this, msg, "Message", JOptionPane.INFORMATION_MESSAGE);
                }
            } catch (NumberFormatException e) {
                msg = "Please enter only a number.";
                JOptionPane.showMessageDialog(this, msg, "Message", JOptionPane.INFORMATION_MESSAGE);
            }
        }
    }

    public void handleCancelButton() {
        cNameField.setText("");
        cActiveCasesField.setText("");
        cAllCasesField.setText("");
    }
}