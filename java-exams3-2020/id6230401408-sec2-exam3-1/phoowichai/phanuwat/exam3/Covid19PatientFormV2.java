/**
 * 
 * Name : Phanuwat Phoowichai
 * Student ID : 623040140-8
 * 
 */

package phoowichai.phanuwat.exam3;

import javax.swing.*;
import java.awt.event.*;
import java.util.*;

/**
 * Covid19PatientForm
 */
public class Covid19PatientFormV2 extends Covid19PatientForm implements ActionListener {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    protected ArrayList<Covid19Patient> patient;
    protected Covid19Patient covidPatient;

    public Covid19PatientFormV2(String title) {
        super(title);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                createAndShowGUI();
            }
        });
    }

    public static void createAndShowGUI() {
        Covid19PatientFormV2 msw = new Covid19PatientFormV2("Covid-19 Patient Form");
        msw.addComponents();
        msw.addListeners();
        msw.setFrameFeature();
    }

    protected void addComponents() {
        super.addComponents();
        patient = new ArrayList<Covid19Patient>();
    }

    protected void addListeners() {
        // add listener to menuItem
        resetButton.addActionListener(this);
        submitButton.addActionListener(this);
        listButton.addActionListener(this);
        searchButton.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent event) {
        Object src = event.getSource();
        // add action event
        if (src == resetButton) {
            handleResetButton();
        } else if (src == submitButton) {
            handleSubmitButton();
        } else if (src == listButton) {
            handleListButton();
        } else if (src == searchButton) {
            handleSearchButton();
        }
    }

    public void handleResetButton() {
        nameTextField.setText("");
        ageSlider.setValue(50);
        radioButtonGroup.clearSelection();
        temperatureCB.setSelectedIndex(0);
        countryList.clearSelection();
    }

    public void handleSubmitButton() {
        createPerson();
        patient.add(covidPatient);
        JOptionPane.showMessageDialog(this, covidPatient, "Message", JOptionPane.INFORMATION_MESSAGE);
    }

    protected void createPerson() { // create person with input data
        String name = nameTextField.getText();
        String gender = "";
        if (maleRB.isSelected()) {
            gender = "Male";
        } else if (femaleRB.isSelected()) {
            gender = "Female";
        }
        Integer age = ageSlider.getValue();
        String temperature = (String) temperatureCB.getSelectedItem();
        List<String> countries = countryList.getSelectedValuesList();

        covidPatient = new Covid19Patient(name, age, gender, temperature, countries); // create person
    }

    public void handleListButton() {
        String list = "";
        Integer nLoop = 0;
        for (Covid19Patient covidPatient : patient) { // loop in list of covidPatient
            if (nLoop > 0) {
                list += ", " + covidPatient + "\n";
                nLoop++;
            // } else {
            //     list += "[";
            //     list += covidPatient + "\n";
            //     nLoop++;
            }
            // if (patient.size() == nLoop) {
            //     list += "]";
            // }
        }
        JOptionPane.showMessageDialog(this, list, "Message", JOptionPane.INFORMATION_MESSAGE);
    }

    public void handleSearchButton() {
        String name = "";
        Covid19Patient covidPatient = searchName(name);
        if (covidPatient != null) { // found name in list
            JOptionPane.showMessageDialog(this, covidPatient, "Message", JOptionPane.INFORMATION_MESSAGE);
        } else { // not found name in list
            JOptionPane.showMessageDialog(this, "", "Message", JOptionPane.INFORMATION_MESSAGE);
        }
    }

    protected Covid19Patient searchName(String name) { // search name in list
        for (Covid19Patient covidPatient : patient) {
            if (covidPatient.getName().equals(name)) {
                return covidPatient;
            }
        }
        return null;
    }
}
