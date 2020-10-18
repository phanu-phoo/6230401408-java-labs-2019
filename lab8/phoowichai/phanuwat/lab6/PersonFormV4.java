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
    protected JMenuItem redColor, greenColor, blueColor, sixteenSize, twentySize, twentyfourSize;
    protected JMenu colorMenu, sizeMenu;

    public PersonFormV4(String msg) {
        super(msg);
    }

    public void addMenus() {
        super.addMenus();
        updateMenuIcon();
        addSubMenus();
    }

    public void addSubMenus() {
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
        sixteenSize = new JMenuItem("16");
        twentySize = new JMenuItem("20");
        twentyfourSize = new JMenuItem("24");

        // add menu item to menu
        colorMenu.add(redColor);
        colorMenu.add(greenColor);
        colorMenu.add(blueColor);
        sizeMenu.add(sixteenSize);
        sizeMenu.add(twentySize);
        sizeMenu.add(twentyfourSize);

        // add menu
        configMenu.add(colorMenu);
        configMenu.add(sizeMenu);
    }

    public void updateMenuIcon() {
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