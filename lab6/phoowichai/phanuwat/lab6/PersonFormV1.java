/**
 * 
 * Create a program called PersonFormV1 which extends from MySimpleWindow and
 * whose interface looks like the program shown in Figure 3.
 * 
 * Author: Phanuwat Phoowichai
 * ID: 623040140-8
 * Sec: 2
 * Date: January 20, 2020
 * 
 **/

package phoowichai.phanuwat.lab6;

import java.awt.*;
import javax.swing.*;

public class PersonFormV1 extends MySimpleWindow {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    JLabel labelName, labelHeight, labelWeight, labelDoB, labelType;
    JTextField tfName, tfHeight, tfWeight, tfDoB;
    JRadioButton radioStd, radioTch;
    ButtonGroup groupType;
    JPanel infoPanel, overAllPanel, radioPanel;
    // final int TFLENGTH = 15;

    public PersonFormV1(String msg) {
        super(msg);
    }

    protected void addComponents() {
        super.addComponents();

        // set component
        labelName = new JLabel("Name:"); // set label
        labelHeight = new JLabel("Height (cm.):");
        labelWeight = new JLabel("Weight (kg.):");
        labelDoB = new JLabel("Date of birth (eg.,31-01-1990):");
        labelType = new JLabel("Type:");
        // tfName = new JTextField(TFLENGTH); // set text field
        // tfHeight = new JTextField(TFLENGTH);
        // tfWeight = new JTextField(TFLENGTH);
        // tfDoB = new JTextField(TFLENGTH);
        tfName = new JTextField(15); // set text field
        tfHeight = new JTextField(15);
        tfWeight = new JTextField(15);
        tfDoB = new JTextField(15);
        radioStd = new JRadioButton("Student"); // set radio buttom
        radioTch = new JRadioButton("Teacher");
        groupType = new ButtonGroup(); // set group for radio

        // add radio button to group
        // can select only one
        groupType.add(radioStd);
        groupType.add(radioTch);

        // set panel for radio button and add radio button to panel
        radioPanel = new JPanel();
        radioPanel.add(radioStd);
        radioPanel.add(radioTch);

        // set panel for PersonFormV2 and add component to panel
        infoPanel = new JPanel(new GridLayout(5, 2));
        infoPanel.add(labelName);
        infoPanel.add(tfName);
        infoPanel.add(labelHeight);
        infoPanel.add(tfHeight);
        infoPanel.add(labelWeight);
        infoPanel.add(tfWeight);
        infoPanel.add(labelDoB);
        infoPanel.add(tfDoB);
        infoPanel.add(labelType);
        infoPanel.add(radioPanel);

        // set panel for PersonForm and add panel of PersonFormV2 to panel
        overAllPanel = new JPanel(new BorderLayout());
        overAllPanel.add(infoPanel, BorderLayout.NORTH);

        // add panel of PersonForm to window
        screenPanel.add(overAllPanel, BorderLayout.NORTH);
    }

    public static void createAndShowGUI() {
        PersonFormV1 PersonFormV1 = new PersonFormV1("Person Form V1");
        PersonFormV1.addComponents();
        PersonFormV1.setFrameFeatures();
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                createAndShowGUI();
            }
        });
    }
}