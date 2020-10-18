/**
 * 
 * Name : Phanuwat Phoowichai
 * Student ID : 623040140-8
 * 
 */

package phoowichai.phanuwat.exam3;

import javax.swing.*;
import java.awt.*;

/**
 * Covid19StatsV0 is the class that extends from JFrame and create the window to
 * fill the information about the number of active cases and the number of
 * confirmed cases of each country.
 * 
 * It has three text fields that accept country name, active cases, and all
 * cases at the top. In addition, it has the text area at the middle and two
 * buttons (ok button and cancel button) at the bottom
 * 
 * It also has the menu "File" which has menu item "Open", "Save", and "Quit"
 * 
 * @author Kanda Saikaew
 * @version 1.0
 * @since March 27, 2020
 * 
 */
public class Covid19StatsV0 extends JFrame {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    protected JLabel cNameLabel, cActiveCasesLabel, cAllCasesLabel;
    protected JTextField cNameField, cActiveCasesField, cAllCasesField;
    protected JPanel nameCasesPanel;
    protected JPanel buttonsPanel, windowPanel;
    protected JButton okButton, cancelButton;
    protected JTextArea displayArea;
    protected JScrollPane displayPane;
    protected int NUM_AREA_ROWS = 10, NUM_AREA_COLS = 30;
    protected int NUM_GRID_ROWS = 3, NUM_GRID_COLS = 2;

    protected JMenuBar menuBar;
    protected JMenu fileMenu;
    protected JMenuItem openMenuItem, saveMenuItem, quitMenuItem;

    /**
     * Covid19StatsV0(String title)
     * 
     * A constructor which is inherited from the constructor of JFrame and call the
     * method initComponents() to create and place components in the window
     */
    public Covid19StatsV0(String title) {
        super(title);
        initComponents();
    }

    /**
     * initComponents()
     * 
     * This method creates and places components in the window
     */
    protected void initComponents() {
        cNameLabel = new JLabel("Name:");
        cActiveCasesLabel = new JLabel("Active Cases:");
        cNameField = new JTextField("Thailand");
        cActiveCasesField = new JTextField("860");
        cAllCasesLabel = new JLabel("All Cases:");
        cAllCasesField = new JTextField("934");
        nameCasesPanel = new JPanel(new GridLayout(NUM_GRID_ROWS, NUM_GRID_COLS));

        nameCasesPanel.add(cNameLabel);
        nameCasesPanel.add(cNameField);
        nameCasesPanel.add(cActiveCasesLabel);
        nameCasesPanel.add(cActiveCasesField);
        nameCasesPanel.add(cAllCasesLabel);
        nameCasesPanel.add(cAllCasesField);

        displayArea = new JTextArea(NUM_AREA_ROWS, NUM_AREA_COLS);
        displayPane = new JScrollPane(displayArea);
        displayArea.setLineWrap(true);
        displayArea.setWrapStyleWord(true);

        okButton = new JButton("OK");
        cancelButton = new JButton("Cancel");
        buttonsPanel = new JPanel();
        buttonsPanel.add(okButton);
        buttonsPanel.add(cancelButton);

        menuBar = new JMenuBar();
        fileMenu = new JMenu("File");
        openMenuItem = new JMenuItem("Open");
        saveMenuItem = new JMenuItem("Save");
        quitMenuItem = new JMenuItem("Quit");
        fileMenu.add(openMenuItem);
        fileMenu.add(saveMenuItem);
        fileMenu.add(quitMenuItem);
        menuBar.add(fileMenu);

        windowPanel = (JPanel) this.getContentPane();
        windowPanel.add(nameCasesPanel, BorderLayout.NORTH);
        windowPanel.add(displayPane, BorderLayout.CENTER);
        windowPanel.add(buttonsPanel, BorderLayout.SOUTH);

        this.setJMenuBar(menuBar);

    }

    /**
     * setFrameFeatures()
     * 
     * This method pack components, set the window location at the center, set the
     * program to exit on closing window, and set the window to be visible
     */
    protected void setFrameFeatures() {
        this.pack();
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }

    /**
     * createAndShowGUI()
     * 
     * This method creates the object of class Covid19StatsV0 and set the window
     * title as "Covid-19 Stats Version 0" and set the window setttings
     */
    public static void createAndShowGUI() {
        Covid19StatsV0 window = new Covid19StatsV0("Covid-19 Stats Version 0");
        window.setFrameFeatures();
    }

    /**
     * main(String[] args)
     * 
     * This method create the object of the class that implements interface Runnable
     * and override method run()
     */
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                createAndShowGUI();
            }
        });
    }
}