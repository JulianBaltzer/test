package com.example.test;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class HelloController {
    @FXML
    private Label welcomeText;
    public player player;
    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText(player.getName());
        player = new player("test");

    }

    @FXML
    protected void onHelloButtonMove() {
        welcomeText.setText("Welcome to JavaerggerFX Application!");
    }




}