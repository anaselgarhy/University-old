package com.example.sec_9;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class App2 extends Application {
    @Override
    public void start(Stage stage1) {
        StackPane root = new StackPane();
        // Stage1
        Scene scene1 = new Scene(root, 300, 250);
        // Add the button to the root node.
        root.getChildren().add(new Button("Button"));

        stage1.setTitle("Stage 1");
        stage1.setScene(scene1);
        stage1.show();

        // Stage2
        Stage stage2 = new Stage();
        stage2.setTitle("Stage 2");
        // Create a scene with a button.
        StackPane root2 = new StackPane();
        root2.getChildren().add(new Button("Button"));
        Scene scene2 = new Scene(root2, 300, 250);
        stage2.setScene(scene2);
        stage2.show();

    }
}
