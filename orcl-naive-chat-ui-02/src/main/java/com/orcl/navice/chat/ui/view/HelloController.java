package com.orcl.navice.chat.ui.view;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

/**
 * @description:
 * @author: orcl
 * @since: 2022/4/18-21:36
 * @history: 2022/4/18 created by orcl
 */
public class HelloController {

    @FXML
    private Label welcomeText;

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }

}
