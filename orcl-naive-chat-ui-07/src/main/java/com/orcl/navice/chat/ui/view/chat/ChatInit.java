package com.orcl.navice.chat.ui.view.chat;

import com.orcl.navice.chat.ui.view.UIObject;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.TextArea;
import javafx.scene.image.Image;

import java.io.IOException;
import java.util.Objects;

/**
 * @description:
 * @author: orcl
 * @since: 2022/4/19-10:32
 * @history: 2022/4/19 created by orcl
 */
public abstract class ChatInit extends UIObject {

    public static final String RESOURCE_NAME = "/fxml/chat/chat.fxml";

    /**
     * 用户ID
     */
    public String userId;

    /**
     * 用户昵称
     */
    public String userNickName;

    /**
     * 用户头像
     */
    public String userHead;

    public IChatEvent chatEvent;

    /**
     * 输入框
     */
    public TextArea txt_input;

    public ChatInit(IChatEvent chatEvent) {
        this.chatEvent = chatEvent;
        try {
            root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource(RESOURCE_NAME)));
        } catch (IOException e) {
            e.printStackTrace();
        }
        Scene scene = new Scene(root);
        setScene(scene);
        setResizable(false);
        getIcons().add(new Image("/fxml/chat/img/head/logo.png"));
        obtain();
        initView();
        initEventDefine();
    }

    private void obtain() {
        // 可以预加载
        txt_input = $("txt_input", TextArea.class);
    }
}
