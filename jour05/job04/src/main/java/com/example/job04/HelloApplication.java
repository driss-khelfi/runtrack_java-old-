package com.example.job04;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.FlowPane;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Interface Utilisateur");

        FlowPane root = new FlowPane();
        root.setPadding(new Insets(10));
        root.setHgap(10);
        root.setStyle("-fx-background-color: #737a84;");

        Label label = new Label("Nom :");
        label.setFont(Font.font("Arial", 14));
        label.setTextFill(Color.web("#cff7f2"));
        root.getChildren().add(label);

        TextField textField = new TextField();
        textField.setPrefWidth(200);
        root.getChildren().add(textField);

        Button button = new Button("Envoyer");
        button.setStyle("-fx-background-color: #00abd6; -fx-text-fill: white;");
        button.setOnAction(event -> {
            String name = textField.getText();
            System.out.println("Nom : " + name);
        });
        root.getChildren().add(button);

        Scene scene = new Scene(root, 300, 100);
        scene.getStylesheets().add("style.css"); // Ajout du fichier de style CSS
        primaryStage.setScene(scene);
        primaryStage.show();

    }

    public static void main(String[] args) {
        launch();
    }
}