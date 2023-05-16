package com.example.job03;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

public class HelloApplication extends Application {
    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Interface Utilisateur");

        FlowPane root = new FlowPane();
        root.setPadding(new Insets(10));
        root.setHgap(10);

        Label label = new Label("Nom :");
        root.getChildren().add(label);

        TextField textField = new TextField();
        root.getChildren().add(textField);

        Button button = new Button("Envoyer");
        button.setOnAction(event -> {
            String name = textField.getText();
            System.out.println("Nom : " + name);
        });
        root.getChildren().add(button);

        Scene scene = new Scene(root, 300, 100);
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}