package com.example.job09;

import javafx.application.Application;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;
import javafx.scene.control.TextInputDialog;
import javafx.stage.Stage;

import java.util.Optional;

public class HelloApplication extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) {
        stage.setTitle("Boîtes de dialogue");

        // Boîte de dialogue de confirmation avant de quitter
        stage.setOnCloseRequest(event -> {
            event.consume(); // Empêche la fermeture de la fenêtre par défaut

            Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
            alert.setTitle("Confirmation");
            alert.setHeaderText("Êtes-vous sûr de vouloir quitter ?");
            alert.setContentText("Toutes les modifications non sauvegardées seront perdues.");

            Optional<ButtonType> result = alert.showAndWait();
            if (result.isPresent() && result.get() == ButtonType.OK) {
                stage.close(); // Ferme l'application si l'utilisateur confirme
            }
        });

        // Boîte de dialogue pour afficher un message d'erreur
        ButtonType okButton = new ButtonType("OK");
        Alert errorAlert = new Alert(Alert.AlertType.ERROR, "Données invalides.", okButton);
        errorAlert.setTitle("Erreur");
        errorAlert.setHeaderText("Erreur de saisie");

        // Exemple d'utilisation de la boîte de dialogue d'erreur
        TextInputDialog dialog = new TextInputDialog();
        dialog.setTitle("Saisie de l'âge");
        dialog.setHeaderText("Veuillez saisir votre âge :");
        dialog.setContentText("Âge:");

        Optional<String> result = dialog.showAndWait();
        result.ifPresent(age -> {
            try {
                int ageValue = Integer.parseInt(age);
                if (ageValue < 0) {
                    errorAlert.showAndWait();
                } else {
                    System.out.println("Âge saisi : " + ageValue);
                }
            } catch (NumberFormatException e) {
                errorAlert.showAndWait();
            }
        });

        stage.show();
    }
}
