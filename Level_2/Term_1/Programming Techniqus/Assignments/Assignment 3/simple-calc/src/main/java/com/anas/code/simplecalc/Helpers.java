package com.anas.code.simplecalc;

import javafx.scene.control.Alert;

/**
 * @author <a href="https://github.com/Anas-Elgarhy">Anas-Elgarhy</a>
 * at 2022-01-06
 */
public class Helpers {
    /**
     * Add the actions' listener to the buttons in the grid nodes
     * @param nodes grid nodes
     */
    public static void addActionsHandlers(CalcNode[] nodes) {
        // Add actions handlers to all nodes
        for (CalcNode node : nodes) {
            switch (node.getOpLabel().getText()) {
                case "+" -> node.getEqualsButton().setOnAction((event) -> { // Addition button
                    try {
                        node.getResultLabel().setText(String.valueOf(node.getNum1() + node.getNum2()));
                    } catch (NumberFormatException e) {
                        // Show error message
                        showErrorMessage("Invalid number, please enter a valid number");
                    }
                });
                case "-" -> node.getEqualsButton().setOnAction((event) -> { // Subtraction button
                    try {
                        node.getResultLabel().setText(String.valueOf(node.getNum1() - node.getNum2()));
                    } catch (NumberFormatException e) {
                        // Show error message
                        showErrorMessage("Invalid number, please enter a valid number");
                    }
                });
                case "*" -> node.getEqualsButton().setOnAction((event) -> { // Multiplication button
                    try {
                        node.getResultLabel().setText(String.valueOf(node.getNum1() * node.getNum2()));
                    } catch (NumberFormatException e) {
                        // Show error message
                        showErrorMessage("Invalid number, please enter a valid number");
                    }
                });
                case "/" -> node.getEqualsButton().setOnAction((event) -> { // Division button
                    try {
                        node.getResultLabel().setText(String.valueOf(node.getNum1() / node.getNum2()));

                        // Check for division by zero
                        if (node.getNum2() == 0) {
                            throw new ArithmeticException("Division by zero");
                        }
                    } catch (NumberFormatException e) {
                        // Show error message
                        showErrorMessage("Invalid number, please enter a valid number");
                    } catch (ArithmeticException e) {
                        // Show error message
                        showErrorMessage("Can't division by zero, please enter a valid number");
                    }
                });
            }
        }
    }

    /**
     *  Show error message
     * @param message error message to show
     */
    public static void showErrorMessage(String message) {
        Alert alert = new Alert(Alert.AlertType.ERROR); // Create alert and set type as error
        alert.setTitle("Error"); // Set title
        alert.setHeaderText(message); // Set header text
        alert.showAndWait(); // Show alert and wait for user to close it
    }
}
