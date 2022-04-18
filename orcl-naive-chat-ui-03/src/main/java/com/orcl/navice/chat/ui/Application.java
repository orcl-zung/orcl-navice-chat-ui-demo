package com.orcl.navice.chat.ui;

import com.orcl.navice.chat.ui.view.Login;
import javafx.stage.Stage;

/**
 * @description:
 * @author: orcl
 * @since: 2022/4/18-18:44
 * @history: 2022/4/18 created by orcl
 */
public class Application extends javafx.application.Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        Login login = new Login();
        login.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
