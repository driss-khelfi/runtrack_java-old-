package com.example.job08;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class HelloApplication extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) {
        stage.setTitle("Panneaux et Onglets");

        // Création des panneaux
        VBox panel1 = createPanel("Panel 1", Color.LIGHTBLUE);
        VBox panel2 = createPanel("Panel 2", Color.LIGHTGREEN);
        VBox panel3 = createPanel("Panel 3", Color.LIGHTYELLOW);

        // Création des onglets
        Tab tab1 = new Tab("Onglet 1");
        tab1.setContent(panel1);
        Tab tab2 = new Tab("Onglet 2");
        tab2.setContent(panel2);
        Tab tab3 = new Tab("Onglet 3");
        tab3.setContent(panel3);

        // Création de la zone d'onglets
        TabPane tabPane = new TabPane();
        tabPane.getTabs().addAll(tab1, tab2, tab3);

        // Création de la scène
        Scene scene = new Scene(tabPane, 400, 300);
        stage.setScene(scene);
        stage.show();
    }

    // Méthode utilitaire pour créer un panneau avec un titre et une couleur de fond
    private VBox createPanel(String title, Color color) {
        VBox panel = new VBox();
        panel.setPadding(new Insets(10));
        panel.setBackground(new Background(new BackgroundFill(color, CornerRadii.EMPTY, Insets.EMPTY)));

        Label titleLabel = new Label(title);
        panel.getChildren().add(titleLabel);

        return panel;
    }
}

