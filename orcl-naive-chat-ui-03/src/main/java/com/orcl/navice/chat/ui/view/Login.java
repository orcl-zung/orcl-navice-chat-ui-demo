package com.orcl.navice.chat.ui.view;

import javafx.fxml.FXMLLoader;
import javafx.scene.Cursor;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

import java.io.IOException;

/**
 * @description:
 * @author: orcl
 * @since: 2022/4/18-18:44
 * @history: 2022/4/18 created by orcl
 */
public class Login extends Stage {
    private static final String RESOURCE_NAME = "/fxml/login/login.fxml";

    private static final String PNG_RESOURCE = "/fxml/login/img/logo.png";

    private Parent root;

    private double xOffset;

    private double yOffset;

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
        setScene(scene);
        initStyle(StageStyle.TRANSPARENT);
        setResizable(false);
        this.getIcons().add(new Image(PNG_RESOURCE));

        initEvent();
    }

    public <T> T $(String id, Class<T> clazz) {
        return (T) root.lookup("#" + id);
    }

    public void doLoginError() {
        System.out.println("登陆失败，执行提示操作");
    }

    public void doLoginSuccess() {
        System.out.println("登陆成功，执行跳转操作");
    }

    private void initEvent() {
        this.move();
        this.min();
        this.quit();
        this.login();
    }

    private void login() {
        TextField userId = $("userId", TextField.class);
        PasswordField userPassword = $("userPassword", PasswordField.class);

        $("login_button", Button.class).setOnAction(event -> {
            System.out.println("登陆操作");
            System.out.println("用户ID：" + userId.getText());
            System.out.println("用户密码：" + userPassword.getText());
        });
    }

    private void quit() {
        Button loginClose = $("login_close", Button.class);
        loginClose.setOnAction(event -> {
            System.out.println("退出窗体");
            close();
            System.exit(0);
        });
    }

    private void min() {
        Button loginMin = $("login_min", Button.class);
        loginMin.setOnAction(event -> {
            System.out.println("最小化窗体");
            setIconified(true);
        });
    }

    private void move() {
        root.setOnMousePressed(event -> {
            xOffset = getX() - event.getScreenX();
            yOffset = getY() - event.getScreenY();
        });

        root.setOnMouseDragged(event -> {
            setX(event.getScreenX() + xOffset);
            setY(event.getScreenY() + yOffset);
        });

        root.setOnMouseReleased(event -> root.setCursor(Cursor.DEFAULT));
    }
}
