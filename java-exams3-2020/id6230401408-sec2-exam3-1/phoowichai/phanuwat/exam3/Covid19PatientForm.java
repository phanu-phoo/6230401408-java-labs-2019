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
 * Covid19PatientForm
 */
public class Covid19PatientForm extends JFrame{
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    protected JPanel mainPanel, topPanel, midPanel, bottomPanel, radioButtonPanel, countryPanel, buttonPanel;
    protected JLabel nameLabel, genderLabel, ageLabel, temperatureLabel, countryLabel;
    protected JTextField nameTextField;
    protected JRadioButton maleRB, femaleRB;
    protected ButtonGroup radioButtonGroup;
    protected JSlider ageSlider;
    protected JComboBox<String> temperatureCB;
    protected String[] countries = {"China", "Italy", "USA", "Spain", "Germany"};
    protected JList<String> countryList;
    protected JButton resetButton, submitButton, listButton, searchButton;

    public Covid19PatientForm(String title) {
        super(title);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable(){
                public void run(){
                    createAndShowGUI();
            }
        });
    }

    public static void createAndShowGUI() {
        Covid19PatientForm msw = new Covid19PatientForm("Covid-19 Patient Form");
        msw.addComponents();
        msw.setFrameFeature();
    }

    protected void setFrameFeature() {   
        pack();
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
    }

    protected void addComponents() {
        nameLabel = new JLabel("Name : ");
        nameTextField = new JTextField();
        genderLabel = new JLabel("Gender : ");
        maleRB = new JRadioButton("Male");
        femaleRB = new JRadioButton("Female");
        radioButtonGroup = new ButtonGroup();
        radioButtonGroup.add(maleRB);
        radioButtonGroup.add(femaleRB);
        radioButtonPanel = new JPanel();
        radioButtonPanel.add(maleRB);
        radioButtonPanel.add(femaleRB);
        topPanel = new JPanel(new GridLayout(0,2));
        topPanel.add(nameLabel);
        topPanel.add(nameTextField);
        topPanel.add(genderLabel);
        topPanel.add(radioButtonPanel);

        countryLabel = new JLabel("Country : ");
        countryList = new JList<String>(countries);
        countryPanel = new JPanel(new GridLayout(0,2));
        countryPanel.add(countryLabel);
        countryPanel.add(countryList);
        resetButton = new JButton("Reset");
        submitButton = new JButton("Submit");
        searchButton = new JButton("Search");
        listButton = new JButton("List");
        buttonPanel = new JPanel();
        buttonPanel.add(resetButton);
        buttonPanel.add(submitButton);
        buttonPanel.add(listButton);
        buttonPanel.add(searchButton);
        bottomPanel = new JPanel(new BorderLayout());
        bottomPanel.add(countryPanel, BorderLayout.NORTH);
        bottomPanel.add(buttonPanel, BorderLayout.CENTER);

        mainPanel = new JPanel(new BorderLayout());
        mainPanel.add(topPanel, BorderLayout.NORTH);
        mainPanel.add(bottomPanel, BorderLayout.SOUTH);

        setContentPane(mainPanel);

        // ---------------------------------------------

        ageLabel = new JLabel("Age : ");
        ageSlider = new JSlider(JSlider.HORIZONTAL,0, 100, 50);
        ageSlider.setMajorTickSpacing(10);
        ageSlider.setMajorTickSpacing(25);
        ageSlider.setMinorTickSpacing(5);
        ageSlider.setPaintTicks(true);
        ageSlider.setPaintLabels(true);
        temperatureLabel = new JLabel("Temperature : ");
        temperatureCB = new JComboBox<String>();
        temperatureCB.addItem("<37");
        temperatureCB.addItem("37-39");
        temperatureCB.addItem(">39");

        midPanel = new JPanel(new GridLayout(0,2));
        midPanel.add(ageLabel);
        midPanel.add(ageSlider);
        midPanel.add(temperatureLabel);
        midPanel.add(temperatureCB);

        mainPanel.add(midPanel, BorderLayout.CENTER);
    }
}
