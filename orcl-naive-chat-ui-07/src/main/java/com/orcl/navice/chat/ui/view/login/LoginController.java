package com.orcl.navice.chat.ui.view.login;

/**
 * @description:
 * @author: orcl
 * @since: 2022/4/18-19:12
 * @history: 2022/4/18 created by orcl
 */
public class LoginController extends LoginInit implements ILoginMethod {

    private LoginView loginView;

    private LoginEventDefine loginEventDefine;

    public LoginController(ILoginEvent loginEvent) {
        super(loginEvent);
    }

    @Override
    public void doShow() {
        super.show();
    }

    @Override
    public void doLoginError() {
        System.out.println("登陆失败，执行提示操作");
    }

    @Override
    public void doLoginSuccess() {
        System.out.println("登陆成功，执行跳转操作");
        close();
    }

    @Override
    public void initView() {
        loginView = new LoginView(this, loginEvent);
    }

    @Override
    public void initEventDefine() {
        loginEventDefine = new LoginEventDefine(this, loginEvent, this);
    }
}
