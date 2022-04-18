package com.orcl.test;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 * @description:
 * @author: orcl
 * @since: 2022/4/18-15:11
 * @history: 2022/4/18 created by orcl
 */
public class Application extends javafx.application.Application {
    @Override
    public void start(Stage primaryStage) throws Exception {
        Parent load = FXMLLoader.load(getClass().getResource("/fxml/demo/demo.fxml"));
        primaryStage.setTitle("Hello World");
        primaryStage.setScene(new Scene(load, 300, 275));
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
