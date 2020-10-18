/**
 * 
 * Implement the program called PersonFormV3  which extends from PersonFormV2
 * and whose interface look like the program shown in Figure 7-8.
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

public class PersonFormV3 extends PersonFormV2 {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    JLabel labelHobbies;
    JMenuBar menuBar;
    JMenu fileMenu, configMenu;
    JMenuItem newMI, openMI, saveMI, exitMI, colorMI, sizeMI;
    JPanel hobbiesPanel;
    JList<String> hobbiesList;
    String hobbyList[] = { "Reading", "Traveling", "Cooking", "Photography" };

    public PersonFormV3(String msg) {
        super(msg);
    }

    protected void addComponents() {
        super.addComponents();

        // set component
        labelHobbies = new JLabel("Hobbies:"); // set label
        hobbiesList = new JList<>(hobbyList); // set list

        // set panel of hobbies and add labelHobbies and hobbiesList to panel
        hobbiesPanel = new JPanel(new GridLayout(1, 2));
        hobbiesPanel.add(labelHobbies);
        hobbiesPanel.add(hobbiesList);

        // add panel of PersonForm to window
        sportnotePanel.add(hobbiesPanel, BorderLayout.CENTER);
    }

    protected void addMenus() {
        // set menu bar, menu and menu item
        menuBar = new JMenuBar();
        fileMenu = new JMenu("File");
        configMenu = new JMenu("Config");
        newMI = new JMenuItem("New");
        openMI = new JMenuItem("Open");
        saveMI = new JMenuItem("Save");
        exitMI = new JMenuItem("Exit");
        colorMI = new JMenuItem("Color");
        sizeMI = new JMenuItem("Size");

        // add menu to menu bar
        menuBar.add(fileMenu);
        menuBar.add(configMenu);

        // add menu item to menu
        fileMenu.add(newMI);
        fileMenu.add(openMI);
        fileMenu.add(saveMI);
        fileMenu.add(exitMI);
        configMenu.add(colorMI);
        configMenu.add(sizeMI);

        // add menu bar of PersonFormV3 to window
        this.setJMenuBar(menuBar);
    }

    public static void createAndShowGUI() {
        PersonFormV3 personFormV3 = new PersonFormV3("Person Form V3");
        personFormV3.addComponents();
        personFormV3.addMenus();
        personFormV3.setFrameFeatures();
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                createAndShowGUI();
            }
        });
    }
}