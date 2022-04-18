package com.orcl.navice.chat.ui.view.login;

/**
 * @description: 页面展示元素和事件定义
 * @author: orcl
 * @since: 2022/4/18-19:12
 * @history: 2022/4/18 created by orcl
 */
public class LoginView {

    private LoginInit loginInit;

    private ILoginEvent loginEvent;

    public LoginView(LoginInit loginInit, ILoginEvent loginEvent) {
        this.loginInit = loginInit;
        this.loginEvent = loginEvent;
    }
}
