/**
 * 
 * Create the program MySimpleWindow to be a superclass for
 * all other classes with these requirements.
 * This program MySimpleWindow extends from class JFrame.
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

public class MySimpleWindow extends JFrame {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    protected JButton okButton;

	protected JButton cancelButton;
    protected JPanel buttonPanel, screenPanel;;
    JFrame window;

    public MySimpleWindow(String message) {
        // set name of window
        super(message);
    }

    protected void addComponents() {
        // set button
        okButton = new JButton("OK");
        cancelButton = new JButton("Cancel");

        // set button panel and add button to button panel
        buttonPanel = new JPanel();
        buttonPanel.add(cancelButton);
        buttonPanel.add(okButton);

        // set panel and add button panel to this panel
        screenPanel = new JPanel(new BorderLayout());
        screenPanel.add(buttonPanel, BorderLayout.SOUTH);

        // add panel to screen
        this.add(screenPanel);
    }

    public void setFrameFeatures() {
        // set screen
        this.pack();
        this.setLocationRelativeTo(null);
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void createAndShowGUI() {
        MySimpleWindow msw = new MySimpleWindow("My Simple Window");
        msw.addComponents();
        msw.setFrameFeatures();
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                createAndShowGUI();
            }
        });
    }
}
