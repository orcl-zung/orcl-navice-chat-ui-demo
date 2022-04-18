package com.orcl.navice.chat.ui;

import com.orcl.navice.chat.ui.view.login.LoginController;
import javafx.stage.Stage;

/**
 * @description:
 * @author: orcl
 * @since: 2022/4/18-19:11
 * @history: 2022/4/18 created by orcl
 */
public class Application extends javafx.application.Application {
    @Override
    public void start(Stage primaryStage) throws Exception {
        LoginController login = new LoginController(((userId, userPassword) -> System.out.println("登陆 userId：" + userId + "，userPassword：" + userPassword)));
        login.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
