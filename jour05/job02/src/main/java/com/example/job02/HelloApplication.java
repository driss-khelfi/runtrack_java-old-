package com.example.job02;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class HelloApplication extends Application {



        @Override
        public void start(Stage stage) {

            Button btn = new Button();
            btn.setText("Quit");
            btn.setOnAction((ActionEvent event) -> {
                Platform.exit();
            });

            HBox root = new HBox();
            root.setPadding(new Insets(25));
            root.getChildren().add(btn);
            Scene scene = new Scene(root, 300, 220);

            stage.setTitle("Quit button");
            stage.setScene(scene);
            stage.show();
        }

        public static void main(String[] args) {
            launch(args);
        }
    }
