package com.orcl.navice.chat.ui.view.login;

/**
 * @description: 窗口方法，给予外部调用
 * @author: orcl
 * @since: 2022/4/18-19:12
 * @history: 2022/4/18 created by orcl
 */
public interface ILoginMethod {

    /**
     * 打开登陆窗口
     */
    void doShow();

    /**
     * 登陆失败
     */
    void doLoginError();

    /**
     * 登陆成功
     */
    void doLoginSuccess();

}
