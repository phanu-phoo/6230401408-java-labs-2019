/**
 * 
 * Author: Phanuwat Phoowichai
 * ID: 623040140-8
 * Sec: 2
 * Date: March 10, 2020
 * 
 **/

package phoowichai.phanuwat.lab10;

import java.awt.event.*;
import java.time.*;
import java.time.format.*;
import java.util.*;
import javax.swing.*;

public class PersonFormV12 extends PersonFormV11 {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    protected JMenu dataMenu;
    protected JMenuItem displayMI, sortMI, searchMI, removeMI;
    protected ArrayList<Person> personList;
    protected Person person;

    public PersonFormV12(String msg) {
        super(msg);
    }

    public void actionPerformed(ActionEvent event) {
        super.actionPerformed(event);
        Object src = event.getSource();
        // add action event
        if (src == displayMI) { // user click "Display"
            handleDisplayMI();
        } else if (src == sortMI) { // user click "Sort"
            handleSortMI();
        } else if (src == searchMI) { // user click "Search"
            handleSearchMI();
        } else if (src == removeMI) { // user click "Remove"
            handleRemoveMI();
        }
    }

    protected void handleDisplayMI() { // click "Display"
        String list = "";
        Integer nLoop = 0;
        for (Person person : personList) { // loop in list of person
            if (nLoop > 0) {
                list += ", " + person + "\n";
                nLoop++;
            } else {
                list += "[";
                list += person + "\n";
                nLoop++;
            }
            if (personList.size() == nLoop) {
                list += "]";
            }
        }
        JOptionPane.showMessageDialog(this, list, "Person List", JOptionPane.INFORMATION_MESSAGE, javaIcon);
    }

    protected void handleSortMI() { // click "Sort"
        Collections.sort(personList);
        handleDisplayMI();
    }

    protected void handleSearchMI() { // click "Search"
        String name = JOptionPane.showInputDialog("Please enter a person name to search : ");
        Person person = searchName(name);
        if (person != null) { // found name in list
            JOptionPane.showMessageDialog(this, person + " is found.", "Message", JOptionPane.INFORMATION_MESSAGE,
                    javaIcon);
        } else { // not found name in list
            JOptionPane.showMessageDialog(this, name + " is not found.", "Message", JOptionPane.INFORMATION_MESSAGE,
                    javaIcon);
        }
    }

    protected void handleRemoveMI() { // click "Remove"
        String name = JOptionPane.showInputDialog("Please enter a person name to remove : ");
        Person person = searchName(name);
        if (person != null) { // found name in list
            personList.remove(person); // remove name in list
            JOptionPane.showMessageDialog(this, person + " is remove.", "Message", JOptionPane.INFORMATION_MESSAGE,
                    javaIcon);
        } else { // not found name in list
            JOptionPane.showMessageDialog(this, name + " is not found.", "Message", JOptionPane.INFORMATION_MESSAGE,
                    javaIcon);
        }
    }

    protected Person searchName(String name) { // search name in list
        for (Person person : personList) {
            if (person.getName().equals(name)) {
                return person;
            }
        }
        return null;
    }

    protected void handleOkButton() { // click "OK"
        createPerson();
        personList.add(person); // add person to list
        String msg = getOkButtonInfo();
        msg += "\n\nAdding this person into the list : " + person;
        JOptionPane.showMessageDialog(this, msg, "Person Information", JOptionPane.INFORMATION_MESSAGE, javaIcon);
    }

    protected void createPerson() { // create person with input data
        String name = tfName.getText();
        double height = Double.parseDouble(tfHeight.getText());
        double weight = Double.parseDouble(tfWeight.getText());
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        LocalDate dob = LocalDate.parse(tfDoB.getText(), formatter);
        person = new Person(name, weight, height, dob); // create person
    }

    public void addListeners() {
        super.addListeners();
        // add listener to menuItem
        displayMI.addActionListener(this);
        sortMI.addActionListener(this);
        searchMI.addActionListener(this);
        removeMI.addActionListener(this);
    }

    public void addComponents() {
        super.addComponents();
        personList = new ArrayList<Person>();
    }

    public void addMenus() {
        super.addMenus();
        dataMenu = new JMenu("Data"); // set new JMenu
        displayMI = new JMenuItem("Display"); // set new JMenuItem
        sortMI = new JMenuItem("Sort");
        searchMI = new JMenuItem("Search");
        removeMI = new JMenuItem("Remove");
        dataMenu.add(displayMI); // add MenuItem to Menu
        dataMenu.add(sortMI);
        dataMenu.add(searchMI);
        dataMenu.add(removeMI);
        menuBar.add(dataMenu); // add Menu to MenuBar
    }

    public static void createAndShowGUI() {
        PersonFormV12 personFormV12 = new PersonFormV12("Person Form V12");
        personFormV12.addComponents();
        personFormV12.initComponents();
        personFormV12.addMenus();
        personFormV12.addListeners();
        personFormV12.addKeys();
        personFormV12.setFrameFeatures();
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                createAndShowGUI();
            }
        });
    }

}