/**
 * 
 * Author: Phanuwat Phoowichai
 * ID: 623040140-8
 * Sec: 2
 * 
 **/

package phoowichai.phanuwat.exam2;

import javax.swing.*;
import java.awt.*;

public class AreaCalculatorV1 extends JFrame {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    protected JLabel lengthLabel, widthLabel, areaLabel;
    protected JTextField lengthTextField, widthTextField, areaTextField;
    protected JButton calculateButton, resetButton;
    protected ButtonGroup buttonGroup;
    protected JPanel mainPanel, optionPanel, buttonPanel, lengthPanel, widthPanel, areaPanel;

    public AreaCalculatorV1(String msg) {
        super(msg);
    }

    public void createComponents() {
        lengthLabel = new JLabel("Length:");
        widthLabel = new JLabel("Width:");
        areaLabel = new JLabel("Area:");

        lengthTextField = new JTextField();
        widthTextField = new JTextField();
        areaTextField = new JTextField();

        calculateButton = new JButton("Calculate");
        resetButton = new JButton("Reset");

        buttonGroup = new ButtonGroup();

        mainPanel = new JPanel(new BorderLayout());
        optionPanel = new JPanel(new GridLayout(3, 1));
        buttonPanel = new JPanel();
        lengthPanel = new JPanel(new GridLayout(1, 2));
        widthPanel = new JPanel(new GridLayout(1, 2));
        areaPanel = new JPanel(new GridLayout(1, 2));

        lengthTextField.setText("2.0");
        lengthTextField.setHorizontalAlignment(SwingConstants.RIGHT);
        widthTextField.setText("3.0");
        widthTextField.setHorizontalAlignment(SwingConstants.RIGHT);
        areaTextField.setText("6.0");
        areaTextField.setHorizontalAlignment(SwingConstants.RIGHT);
        areaTextField.setBackground(Color.GRAY);
        areaTextField.setEnabled(false);

        lengthPanel.add(lengthLabel);
        lengthPanel.add(lengthTextField);
        widthPanel.add(widthLabel);
        widthPanel.add(widthTextField);
        areaPanel.add(areaLabel);
        areaPanel.add(areaTextField);

        optionPanel.add(lengthPanel);
        optionPanel.add(widthPanel);
        optionPanel.add(areaPanel);

        buttonPanel.add(calculateButton);
        buttonPanel.add(resetButton);

        mainPanel.add(optionPanel, BorderLayout.NORTH);
        mainPanel.add(buttonPanel, BorderLayout.SOUTH);

        this.add(mainPanel);
    }

    public void setFrameFeatures() {
        this.pack();
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }

    public void createAndShowGUI() {
        createComponents();
        setFrameFeatures();
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                AreaCalculatorV1 rac = new AreaCalculatorV1("Area Calculator V1");
                rac.createAndShowGUI();
            }
        });
    }

}