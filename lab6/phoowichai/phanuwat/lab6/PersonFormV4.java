/**
 * 
 * Implement the program called PersonFormV4  which extends from
 * PersonFormV3 In this program, you will add icon for
 * menu New as shown in Figure 10. 
 * 
 * Author: Phanuwat Phoowichai
 * ID: 623040140-8
 * Sec: 2
 * Date: February 3, 2020
 * 
 **/

package phoowichai.phanuwat.lab6;

import javax.swing.*;

public class PersonFormV4 extends PersonFormV3 {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    ImageIcon newImg;
    JMenuItem redColor, greenColor, blueColor, sixteenMI, twentyMI, twentyfourMI;
    JMenu colorMenu, sizeMenu;

    public PersonFormV4(String msg) {
        super(msg);
    }

    protected void addMenus() {
        super.addMenus();
        updateMenuIcon();
        addSubMenus();
    }

    private void addSubMenus() {
        // remive colormenu item and sixe menu item
        configMenu.remove(colorMI);
        configMenu.remove(sizeMI);

        // set color and size as JMenu
        colorMenu = new JMenu("Color");
        sizeMenu = new JMenu("Size");

        // set new JMenuItem
        redColor = new JMenuItem("Red");
        greenColor = new JMenuItem("Green");
        blueColor = new JMenuItem("Blue");
        sixteenMI = new JMenuItem("16");
        twentyMI = new JMenuItem("20");
        twentyfourMI = new JMenuItem("24");

        // add menu item to menu
        colorMenu.add(redColor);
        colorMenu.add(greenColor);
        colorMenu.add(blueColor);
        sizeMenu.add(sixteenMI);
        sizeMenu.add(twentyMI);
        sizeMenu.add(twentyfourMI);

        // add menu
        configMenu.add(colorMenu);
        configMenu.add(sizeMenu);
    }

    private void updateMenuIcon() {
        // set icon
        newMI.setIcon(new ImageIcon("images/new.jpg"));
    }

    public static void createAndShowGUI() {
        PersonFormV4 personFormV4 = new PersonFormV4("Person Form V4");
        personFormV4.addComponents();
        personFormV4.addMenus();
        personFormV4.setFrameFeatures();
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                createAndShowGUI();
            }
        });
    }
}