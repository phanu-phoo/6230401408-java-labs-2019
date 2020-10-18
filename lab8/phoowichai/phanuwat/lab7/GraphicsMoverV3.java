/**
 * 
 * Develop the program GraphicsMoverV3 that extends from GraphicsMoverV2
 * and then add the menu bar as shown in Figure 5.
 * 
 * Author: Phanuwat Phoowichai
 * ID: 623040140-8
 * Sec: 2
 * Date: February 10, 2020
 * 
 **/

package phoowichai.phanuwat.lab7;

import javax.swing.*;

public class GraphicsMoverV3 extends GraphicsMoverV2 {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    JMenuBar menuBar;
    JMenu fileMenu;
    JMenuItem openMI, saveMI, quitMI;

    public GraphicsMoverV3(String title) {
        super(title);
    }

    protected void addMenus() {
        // set menu bar, menu and menu item
        menuBar = new JMenuBar();
        fileMenu = new JMenu("File");
        openMI = new JMenuItem("Open", new ImageIcon("images/open.jpg")); // set with image icon
        saveMI = new JMenuItem("Save");
        quitMI = new JMenuItem("Quit");

        // add menu to menu bar
        menuBar.add(fileMenu);

        // add menu item to menu
        fileMenu.add(openMI);
        fileMenu.add(saveMI);
        fileMenu.add(quitMI);

        // add menu bar to window
        this.setJMenuBar(menuBar);
    }

    public static void createAndShowGUI() {
        GraphicsMoverV3 window = new GraphicsMoverV3("Graphics Mover Version 3");
        window.drawPanel();
        window.addComponents();
        window.addMenus();
        window.setFrameFeatures();
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                createAndShowGUI();
            }
        });
    }
}