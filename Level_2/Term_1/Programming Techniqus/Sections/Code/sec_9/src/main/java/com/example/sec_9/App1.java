package com.example.sec_9;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class App1 extends Application {
    @Override
    public void start(Stage stage) throws Exception {
        // Create a button
        Button btn =  new Button("Click Me");
        // Create the scene and place the button in the scene
        Scene scene = new Scene(btn, 300, 250);
        //  Add the scene to the stage
        stage.setScene(scene);

        // Set the stage title
        stage.setTitle("Just a button");
        // Show the stage
        stage.show();
    }
}
