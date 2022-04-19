package com.orcl.navice.chat.ui.view.login;

/**
 * @description: 窗口事件接口
 * @author: orcl
 * @since: 2022/4/18-19:11
 * @history: 2022/4/18 created by orcl
 */
@FunctionalInterface
public interface ILoginEvent {

    /**
     * 登陆验证
     *
     * @param userId       用户名
     * @param userPassword 用户密码
     */
    void doLoginCheck(String userId, String userPassword);

}
