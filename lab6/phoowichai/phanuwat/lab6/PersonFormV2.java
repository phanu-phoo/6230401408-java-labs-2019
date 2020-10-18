/**
 * 
 * Implement the program called PersonFormV2 which extends from PersonFormV1
 * and whose interface look like the program shown in Figure 5.
 * 
 * Author: Phanuwat Phoowichai
 * ID: 623040140-8
 * Sec: 2
 * Date: February 2, 2020
 * 
 **/

package phoowichai.phanuwat.lab6;

import java.awt.*;
import javax.swing.*;

public class PersonFormV2 extends PersonFormV1 {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    JLabel labelSport, labelNote;
    JComboBox<String> sportBox;
    JPanel sportPanel, notePanel, sportnotePanel;
    JTextArea noteArea;
    JScrollPane scrollPane;
    final int NUM_ROWS = 3;
    final int NUM_COLS = 35;

    public PersonFormV2(String msg) {
        super(msg);
    }

    protected void addComponents() {
        super.addComponents();

        // set component
        labelSport = new JLabel("Sport:"); // set label
        labelNote = new JLabel("Note:");
        sportBox = new JComboBox<>(); // set combo box

        // add item to combo box
        sportBox.addItem("Running");
        sportBox.addItem("Swimming");
        sportBox.addItem("Tennis");

        // allow the user to edit this combo box
        sportBox.setEditable(true);

        // set text area for note and set text
        noteArea = new JTextArea(NUM_ROWS, NUM_COLS);
        noteArea.setText(
                "21st Century skills include Critical thinking, Creativity, Collaboration, Communication, etc.");
        noteArea.setLineWrap(true);
        noteArea.setWrapStyleWord(true);
        noteArea.setRows(2);

        // set scroll panel and add text area to scroll panel
        scrollPane = new JScrollPane(noteArea);

        // set sport panel and add labelSport and sport combo box to panel
        sportPanel = new JPanel(new GridLayout(1, 2));
        sportPanel.add(labelSport);
        sportPanel.add(sportBox);

        // set note panel and add labelNote and scroll panel to panel
        notePanel = new JPanel(new BorderLayout());
        notePanel.add(labelNote, BorderLayout.NORTH);
        notePanel.add(scrollPane, BorderLayout.SOUTH);

        // set panel for sport and note and add sportPanel and notePanel to panel
        sportnotePanel = new JPanel(new BorderLayout());
        sportnotePanel.add(sportPanel, BorderLayout.NORTH);
        sportnotePanel.add(notePanel, BorderLayout.SOUTH);

        // add panel of PersonForm to window
        overAllPanel.add(sportnotePanel, BorderLayout.CENTER);
    }

    public static void createAndShowGUI() {
        PersonFormV2 personFormV2 = new PersonFormV2("Person Form V2");
        personFormV2.addComponents();
        personFormV2.setFrameFeatures();
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                createAndShowGUI();
            }
        });
    }
}