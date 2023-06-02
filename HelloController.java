package com.example.projetoacai;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class HelloController {

    @FXML
    private Label welcomeText;

    @FXML
    void onSelecionarItemUm(ActionEvent event1) {
        welcomeText.setText("Welcome to JavaFX Application!");
    }

    @FXML
    void onSelecionarItemDois(ActionEvent event2) {
        welcomeText.setText("Welcome to JavaFX Application!");
    }

    @FXML
    void onSelecionarItemTres(ActionEvent event3) {
        welcomeText.setText("Welcome to JavaFX Application!");
    }

    @FXML
    void onSelecionarItemQuatro(ActionEvent event4) {
        welcomeText.setText("Welcome to JavaFX Application!");
    }

    @FXML
    void onSelecionarItemCinco(ActionEvent event5) {
        welcomeText.setText("Welcome to JavaFX Application!");
    }

    @FXML
    void onSelecionarItemSeis(ActionEvent event6) {
        welcomeText.setText("Welcome to JavaFX Application!");
    }
}