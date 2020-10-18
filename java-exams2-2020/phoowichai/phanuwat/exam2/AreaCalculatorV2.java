/**
 * 
 * Author: Phanuwat Phoowichai
 * ID: 623040140-8
 * Sec: 2
 * 
 **/

package phoowichai.phanuwat.exam2;

import javax.swing.*;
import java.awt.event.*;

public class AreaCalculatorV2 extends AreaCalculatorV1 implements ActionListener {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    protected JMenuBar menuBar;
    protected JMenu fileMenu;
    protected JMenuItem quitMI;
    protected JRadioButtonMenuItem rectangleRBMI, triangleRBMI;
    protected ButtonGroup buttonGroup;

    public AreaCalculatorV2(String msg) {
        super(msg);
    }

    public void addListeners() {
        resetButton.addActionListener(this);
        calculateButton.addActionListener(this);
        lengthTextField.addActionListener(this);
        widthTextField.addActionListener(this);
        quitMI.addActionListener(this);
        rectangleRBMI.addActionListener(this);
        triangleRBMI.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent event) {
        Object srcObj = event.getSource();
        if (srcObj == resetButton) {
            handleReset();
        } else if (srcObj == calculateButton) {
            handleCalculate();
        } else if (srcObj == quitMI) {
            handleQuit();
        } else if (srcObj == rectangleRBMI) {
            handleCalculate();
        } else if (srcObj == triangleRBMI) {
            handleCalculate();
        }
        handleCalculate();
    }

    public void handleReset() {
        lengthTextField.setText("");
        widthTextField.setText("");
        areaTextField.setText("");
    }

    public void handleCalculate() {
        Double length = Double.parseDouble(lengthTextField.getText());
        Double width = Double.parseDouble(widthTextField.getText());

        if (rectangleRBMI.isSelected()) {
            Double area_rectangle = length * width;
            areaTextField.setText(String.valueOf(area_rectangle));
        } else if (triangleRBMI.isSelected()) {
            Double area_triangle = (length * width) / 2;
            areaTextField.setText(String.valueOf(area_triangle));
        }
    }

    public void handleQuit() {
        System.exit(0);
    }

    public void createComponents() {
        super.createComponents();

        menuBar = new JMenuBar();

        fileMenu = new JMenu("File");

        quitMI = new JMenuItem("Quit");

        rectangleRBMI = new JRadioButtonMenuItem("Rectangle");
        triangleRBMI = new JRadioButtonMenuItem("Triangle");

        buttonGroup = new ButtonGroup();

        rectangleRBMI.setSelected(true);

        buttonGroup.add(rectangleRBMI);
        buttonGroup.add(triangleRBMI);

        fileMenu.add(rectangleRBMI);
        fileMenu.add(triangleRBMI);
        fileMenu.add(quitMI);

        menuBar.add(fileMenu);

        this.setJMenuBar(menuBar);
    }

    public void createAndShowGUI() {
        createComponents();
        addListeners();
        setFrameFeatures();
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                AreaCalculatorV2 rac = new AreaCalculatorV2("Area Calculator V2");
                rac.createAndShowGUI();
            }
        });
    }
}