/**
 * 
 * Author: Phanuwat Phoowichai
 * ID: 623040140-8
 * Sec: 2
 * Date: March 14, 2020
 * 
 **/

package phoowichai.phanuwat.lab10;

import java.io.*;
import javax.swing.*;

public class PersonFormV14 extends PersonFormV13 {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    public PersonFormV14(String message) {
        super(message);
    }

    protected void handleSaveMI() { // click "Save"
        super.handleSaveMI();
        try {
            FileOutputStream fos = new FileOutputStream(file.getAbsolutePath()); // new output file
            ObjectOutputStream oos = new ObjectOutputStream(fos); // new object writer
            for (Person person : personList) {
                oos.writeObject(person); // write object
            }
            oos.close(); // close writer
            fos.close(); // close file
        } catch (FileNotFoundException e) {
        } catch (IOException e) {
        } catch (NullPointerException e) {
        }
    }

    protected void handleOpenMI() { // click "Open"
        super.handleOpenMI();
        String list = "";
        try {
            FileInputStream fis = new FileInputStream(file.getAbsolutePath()); // new input file
            ObjectInputStream ois = new ObjectInputStream(fis); // new object reader
            while (true) {
                Person prsn = (Person) ois.readObject(); // read object
                list += (prsn.toString()) + "\n"; // add to string
            }
        } catch (FileNotFoundException e) {
        } catch (IOException e) {
        } catch (ClassNotFoundException e) {
        }
        if (list != "") {
            JOptionPane.showMessageDialog(this, list, "Message", JOptionPane.INFORMATION_MESSAGE, javaIcon);
        }
    }

    public static void createAndShowGUI() {
        PersonFormV14 personFormV14 = new PersonFormV14("Person Form V14");
        personFormV14.addComponents();
        personFormV14.initComponents();
        personFormV14.addMenus();
        personFormV14.addListeners();
        personFormV14.addKeys();
        personFormV14.setFrameFeatures();
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                createAndShowGUI();
            }
        });
    }
}
