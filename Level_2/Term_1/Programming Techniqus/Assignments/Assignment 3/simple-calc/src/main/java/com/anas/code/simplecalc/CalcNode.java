package com.anas.code.simplecalc;

import javafx.geometry.HPos;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;

/**
 * @author <a href="https://github.com/Anas-Elgarhy">Anas-Elgarhy</a>
 * at 2022-01-06
 */
public class CalcNode extends GridPane {
    private final TextField textField1, textField2;
    private final Label opLabel, resultLabel;
    private final Button equalsButton;

    // Constructor
    public CalcNode(char op, double hgap) {
        textField1 = new TextField();
        textField2 = new TextField();
        opLabel = new Label(String.valueOf(op));
        resultLabel = new Label();
        equalsButton = new Button("=");

        // Set up the grid pane
        setUp(hgap);
    }

    private void setUp(double hgap) {
        // Set the horizontal gap between columns
        super.setHgap(hgap);

        super.add(textField1, 0, 0); // Add the textField1 to the grid in row 0, column 0
        super.add(opLabel, 1, 0); // Add the opLabel to the grid in row 0, column 1
        super.add(textField2, 2, 0); // Add the textField2 to the grid in row 0, column 2
        super.add(equalsButton, 3, 0); // Add the equalsButton to the grid in row 0, column 3
        super.add(resultLabel, 4, 0); // Add the resultLabel to the grid in row 0, column 4

        // Set h alignment of all nodes in the grid pane to center
        GridPane.setHalignment(textField1, HPos.CENTER);
        GridPane.setHalignment(opLabel, HPos.CENTER);
        GridPane.setHalignment(textField2, HPos.CENTER);
        GridPane.setHalignment(equalsButton, HPos.CENTER);
        GridPane.setHalignment(resultLabel, HPos.CENTER);
    }

    public double getNum1() throws NumberFormatException { // throws NumberFormatException if the textField1 is empty or contains non-numeric characters
        return Double.parseDouble(textField1.getText()); // parse the textField1 to a double and return it
    }

    public double getNum2() throws NumberFormatException { // throws NumberFormatException if the textField2 is empty or contains non-numeric characters
        return Double.parseDouble(textField2.getText()); // parse the textField2 to a double and return it
    }

    public TextField getTextField1() {
        return textField1;
    }

    public TextField getTextField2() {
        return textField2;
    }

    public Label getOpLabel() {
        return opLabel;
    }

    public Label getResultLabel() {
        return resultLabel;
    }

    public Button getEqualsButton() {
        return equalsButton;
    }
}
