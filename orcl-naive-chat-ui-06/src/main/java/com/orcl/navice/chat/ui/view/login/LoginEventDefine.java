package com.orcl.navice.chat.ui.view.login;

/**
 * @description:
 * @author: orcl
 * @since: 2022/4/18-19:12
 * @history: 2022/4/18 created by orcl
 */
public class LoginEventDefine {

    private LoginInit loginInit;

    private ILoginEvent loginEvent;

    private ILoginMethod loginMethod;

    public LoginEventDefine(LoginInit loginInit, ILoginEvent loginEvent, ILoginMethod loginMethod) {
        this.loginInit = loginInit;
        this.loginEvent = loginEvent;
        this.loginMethod = loginMethod;

        loginInit.move();
//        min();
//        quit();
        doEventLogin();
    }

    /**
     * 最小化事件
     */
    private void min() {
        loginInit.loginMin.setOnAction(event -> {
            System.out.println("最小化");
            loginInit.setIconified(true);
        });
    }

    /**
     * 退出事件
     */
    private void quit() {
        loginInit.loginClose.setOnAction(event -> {
            System.out.println("退出");
            loginInit.close();
            System.exit(0);
        });
    }

    /**
     * 登陆事件
     */
    private void doEventLogin() {
        loginInit.loginButton.setOnAction(event -> loginEvent.doLoginCheck(loginInit.userId.getText(), loginInit.userPassword.getText()));
    }
}
