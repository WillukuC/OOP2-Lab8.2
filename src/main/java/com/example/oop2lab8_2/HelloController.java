package com.example.oop2lab8_2;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class HelloController {
    @FXML
    private Label welcomeText;

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }

    public void onWilliamButtonClick(ActionEvent actionEvent) {
        welcomeText.setText("This button was developed by William Clark.");
    }
}