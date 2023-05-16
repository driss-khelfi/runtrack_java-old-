package com.example.job06;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javafx.fxml.FXMLLoader;



import java.io.IOException;

public class HelloApplication extends Application {
    Stage window;
    Scene scene;
    Button button;
    @Override
   public void start(Stage primaryStage) throws Exception
    {
        window = primaryStage;
        window.setTitle("ChoiceBox");
        button = new Button("Click");

        ChoiceBox<String> choiceBox = new ChoiceBox<>();

        choiceBox.getItems().add("Student");
        choiceBox.getItems().add("Teacher");
        choiceBox.getItems().add("Employee");
        choiceBox.getItems().add("Director");
        choiceBox.getItems().addAll("Janitor", "Secretary", "IT support");

        choiceBox.setValue("Student");
        button.setOnAction(e -> getChoice(choiceBox));


        VBox layout = new VBox(10);
        layout.setPadding(new Insets(20, 20, 20, 20));
        layout.getChildren().addAll(choiceBox, button);


        scene = new Scene(layout, 300, 250);
        window.setScene(scene);
        window.show();
    }
    private void getChoice(ChoiceBox<String> choiceBox)
    {
        String status = choiceBox.getValue();
        System.out.println(status);
    }

    public static void main(String[] args) {
        launch(args);
    }
}