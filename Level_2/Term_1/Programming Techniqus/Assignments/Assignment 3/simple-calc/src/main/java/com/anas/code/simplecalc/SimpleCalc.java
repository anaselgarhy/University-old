package com.anas.code.simplecalc;

import com.anas.code.simplecalc.enums.OP;
import javafx.application.Application;
import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

/**
 * @author <a href="https://github.com/Anas-Elgarhy">Anas-Elgarhy</a>
 * at 2022-01-06
 */

public class SimpleCalc extends Application  {
    private final CalcNode[] calcNodes = new CalcNode[4];
    @Override
    public void start(Stage stage) {
        // Create layout
        GridPane grid = new GridPane();

        // Set up the grid layout
        grid.setHgap(20); // Horizontal gap between columns
        grid.setVgap(15); // Vertical gap between rows
        grid.setMinSize(525, 300); // Set the size of the grid
        grid.setPadding(new Insets(10, 10, 10, 10)); // Set the padding of the grid

        // Create scene and place it in the stage
        Scene scene = new Scene(grid); // Create a scene
        stage.setScene(scene); // Place the scene in the stage

        // Add the nodes to the grid
        addNodes(grid);

        // Add actions handlers to the calculator nodes
        Helpers.addActionsHandlers(calcNodes);

        // Set ub the main stage
        stage.setResizable(false); // Set the stage to be non-resizable
        stage.setTitle("Simple Calculator"); // Set the stage title
        stage.show(); // Display the stage
    }

    private void addNodes(GridPane grid) {
        // Add the information nodes
        addMyInfo(grid);

        // Add the calculator nodes
        addCalculator(grid);
    }

    private void addMyInfo(GridPane grid) {
        Label myName = new Label("Anas Elgarhy"); // Create a label for my name
        Label myID = new Label("20-00864"); // Create a label for my ID

        // Add myName and myID to the grid
        grid.add(myName, 0, 0); // Add myName to the first column and first row
        grid.add(myID, 0, 1); // Add myID to the first column and second row

        // Set alignment of myName and myID to the center
        GridPane.setHalignment(myName, HPos.CENTER);
        GridPane.setHalignment(myID, HPos.CENTER);
    }

    private void addCalculator(GridPane grid) {
        OP[] operators = OP.values(); // Create an array of 4 operators (+, -, *, /)

        // Create the calculator nodes and add them to the grid
        for (int i = 0; i < operators.length; i++) {
            // Create the instances of the CalcNodes
            calcNodes[i] = new CalcNode(operators[i], grid.getHgap());

            // Add the CalcNodes to the grid
            grid.add(calcNodes[i], 0, i + 2);
        }
    }
}
