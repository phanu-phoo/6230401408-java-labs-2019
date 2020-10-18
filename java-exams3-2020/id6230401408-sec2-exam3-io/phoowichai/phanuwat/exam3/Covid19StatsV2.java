/**
 * 
 * Name : Phanuwat Phoowichai
 * Student ID : 623040140-8
 * 
 */

package phoowichai.phanuwat.exam3;

import javax.swing.*;
import java.awt.event.*;
import java.io.*;

public class Covid19StatsV2 extends Covid19StatsV1 {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    JFileChooser fileChooser;
    JFileChooser openFileChooser, saveFileChooser;
    Integer returnVal;
    JMenuItem sortMenuItem;
    File file;

    public Covid19StatsV2(String title) {
        super(title);
        initComponents();
        addListeners();
    }

    public static void createAndShowGUI() {
        Covid19StatsV2 window = new Covid19StatsV2("Covid-19 Stats Version 2");
        window.setFrameFeatures();
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                createAndShowGUI();
            }
        });
    }

    protected void initComponents() {
        super.initComponents();
        fileChooser = new JFileChooser();
        openFileChooser = new JFileChooser();
        saveFileChooser = new JFileChooser();
        sortMenuItem = new JMenuItem("Sort");
        fileMenu.remove(quitMenuItem);
        fileMenu.add(sortMenuItem);
        fileMenu.add(quitMenuItem);
    }

    protected void addListeners() {
        super.addListeners();
        // add listener to menuItem
        saveMenuItem.addActionListener(this);
        openMenuItem.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent event) {
        super.actionPerformed(event);
        Object src = event.getSource();
        // add action event
        if (src == saveMenuItem) {
            handlesaveMenuItem();
        } else if (src == openMenuItem) {
            handleOpenMenuItem();
        } else if (src == quitMenuItem) {
            System.exit(0);
        }
    }

    @Override
    public void handleOkButton() {
        super.handleOkButton();
        if (!cNameField.getText().equals("") && Integer.parseInt(cActiveCasesField.getText()) > 0
                && Integer.parseInt(cAllCasesField.getText()) != 0) {
            double activeCasesInput = Double.parseDouble(cActiveCasesField.getText());
            double allCasesInput = Double.parseDouble(cAllCasesField.getText());
            double rate = (activeCasesInput / allCasesInput) * 100;
            double activeRate = Math.round(rate);
            msg = cNameField.getText() + " has active cases as " + cActiveCasesField.getText() + " all caese as "
                    + cAllCasesField.getText() + " and active rate as " + activeRate + "%";
            String info = cNameField.getText() + " " + cActiveCasesField.getText() + " " + cAllCasesField.getText()
                    + " " + activeRate;
            JOptionPane.showMessageDialog(this, msg, "Message", JOptionPane.INFORMATION_MESSAGE);
            displayArea.append(info + "\n");
        }
    }

    public void handlesaveMenuItem() {
        try {
            returnVal = saveFileChooser.showSaveDialog(this);
            if (returnVal == JFileChooser.APPROVE_OPTION) { // click "Save"
                file = saveFileChooser.getSelectedFile();
                JOptionPane.showMessageDialog(null, "Saving file " + file.getName(), "Message",
                        JOptionPane.INFORMATION_MESSAGE);
            } else { // click "Cancel"
                JOptionPane.showMessageDialog(null, "Save command cancelled by user.", "Message",
                        JOptionPane.INFORMATION_MESSAGE);
            }
            FileOutputStream fos = new FileOutputStream(file.getAbsolutePath()); // new output file
            ObjectOutputStream oos = new ObjectOutputStream(fos); // new object writer
            oos.writeObject(displayArea.getText()); // write object
            oos.close(); // close writer
            fos.close(); // close file
        } catch (FileNotFoundException e) {
        } catch (IOException e) {
        } catch (NullPointerException e) {
        }
    }

    public void handleOpenMenuItem() {
        try {
            returnVal = openFileChooser.showSaveDialog(this);
            if (returnVal == JFileChooser.APPROVE_OPTION) { // click "Save"
                file = openFileChooser.getSelectedFile();
                JOptionPane.showMessageDialog(null, "Opening file " + file.getName(), "Message",
                        JOptionPane.INFORMATION_MESSAGE);
            } else { // click "Cancel"
                JOptionPane.showMessageDialog(null, "Open command cancelled by user.", "Message",
                        JOptionPane.INFORMATION_MESSAGE);
            }
            FileInputStream fis = new FileInputStream(file.getAbsolutePath()); // new input file
            ObjectInputStream ois = new ObjectInputStream(fis); // new object reader
            String utf = ois.readUTF();
            System.out.println(utf);
        } catch (FileNotFoundException e) {
        } catch (IOException e) {
        }
    }
}