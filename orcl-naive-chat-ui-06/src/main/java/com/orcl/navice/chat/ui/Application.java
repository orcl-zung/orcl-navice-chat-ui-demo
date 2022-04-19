package com.orcl.navice.chat.ui;

import com.orcl.navice.chat.ui.view.chat.ChatController;
import com.orcl.navice.chat.ui.view.chat.IChatMethod;
import com.orcl.navice.chat.ui.view.login.LoginController;
import javafx.stage.Stage;

import java.util.Date;

/**
 * @description:
 * @author: orcl
 * @since: 2022/4/18-19:11
 * @history: 2022/4/18 created by orcl
 */
public class Application extends javafx.application.Application {
    @Override
    public void start(Stage primaryStage) throws Exception {
        IChatMethod chat = new ChatController();
        chat.doShow();
        // 模拟测试
        chat.addTalkBox(-1, 0, "1000001", "小傅哥", "01_50", "我不是一个简单的男人", new Date(), true);
        chat.addTalkBox(-1, 0, "1000002", "铁锤", "02_50", "有本事现时里扎一下", new Date(), false);
        chat.addTalkBox(-1, 0, "1000003", "团团", "03_50", "秋风扫过树叶落，哪有棋盘哪有我", new Date(), false);
        chat.addTalkBox(-1, 0, "1000004", "哈尼克兔", "04_50", "你把爱放在我的心里", new Date(), false);
        chat.addTalkBox(0, 1, "5307397", "虫洞 · 技术栈(1区)", "group_1", "小傅哥：吉祥健康、如意安康", new Date(), false);


        //        LoginController login = new LoginController(((userId, userPassword) -> System.out.println("登陆 userId：" + userId + "，userPassword：" + userPassword)));
//        login.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
