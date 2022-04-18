package com.orcl.navice.chat.ui.view;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

import java.io.IOException;

/**
 * @description:
 * @author: orcl
 * @since: 2022/4/18-15:45
 * @history: 2022/4/18 created by orcl
 */
public class Login extends Stage {

    private static final String RESOURCE_NAME = "/fxml/login/login.fxml";

    private static final String PNG_RESOURCE = "/fxml/login/img/logo.png";

    private Parent root;

    public Login() {
        try {
            //            root = FXMLLoader.load(getClass().getResource(RESOURCE_NAME));
            FXMLLoader fxmlLoader = new FXMLLoader(Login.class.getResource(RESOURCE_NAME));
            root = fxmlLoader.load();
        } catch (IOException e) {
            e.printStackTrace();
        }

        Scene scene = new Scene(root);
        scene.setFill(Color.TRANSPARENT);
        setTitle("Hello!");
        setScene(scene);
//        initStyle(StageStyle.TRANSPARENT);
//        setResizable(false);
//        this.getIcons().add(new Image(PNG_RESOURCE));
    }

}
