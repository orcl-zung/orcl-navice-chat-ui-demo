package com.orcl.navice.chat.ui.view.login;

import com.orcl.navice.chat.ui.view.UIObject;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.paint.Color;
import javafx.stage.StageStyle;

import java.io.IOException;

/**
 * @description:
 * @author: orcl
 * @since: 2022/4/18-19:12
 * @history: 2022/4/18 created by orcl
 */
public abstract class LoginInit extends UIObject {

    private static final String RESOURCE_NAME = "/fxml/login/login.fxml";

    protected ILoginEvent loginEvent;

    public Button loginMin;

    public Button loginClose;

    public Button loginButton;

    public TextField userId;

    public PasswordField userPassword;

    LoginInit(ILoginEvent loginEvent) {
        this.loginEvent = loginEvent;
        try {
            root = FXMLLoader.load(getClass().getResource(RESOURCE_NAME));
        } catch (IOException e) {
            e.printStackTrace();
        }

        Scene scene = new Scene(root);
//        scene.setFill(Color.TRANSPARENT);
        setTitle("憨憨 · 语约");
        setScene(scene);
//        initStyle(StageStyle.TRANSPARENT);
        setResizable(false);
        this.getIcons().add(new Image("/fxml/login/img/logo.png"));
        obtain();
        initView();
        initEventDefine();
    }

    private void obtain() {
        loginMin = $("login_min", Button.class);
        loginClose = $("login_close", Button.class);
        loginButton = $("login_button", Button.class);
        userId = $("userId", TextField.class);
        userPassword = $("userPassword", PasswordField.class);
    }

}
