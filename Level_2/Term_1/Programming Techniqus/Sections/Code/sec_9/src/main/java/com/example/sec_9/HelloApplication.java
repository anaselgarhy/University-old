package com.example.sec_9;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;


public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) {
        // root node
        StackPane root = new StackPane();
        // Scene
        Scene scene = new Scene(root, 200, 200);

        // Create a button
        Button button = new Button("Click me!");

        // Add the button to the scene graph
        root.getChildren().add(button);

        // Add the scene to the stage
        stage.setScene(scene);

        // Set the title of the stage
        stage.setTitle("Button");
        // Show the stage
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}