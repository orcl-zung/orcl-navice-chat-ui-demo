package com.orcl.navice.chat.ui.view.chat;

import javafx.scene.control.Button;
import javafx.scene.layout.Pane;


/**
 * @description:
 * @author: orcl
 * @since: 2022/4/19-10:32
 * @history: 2022/4/19 created by orcl
 */
public class ChatEventDefine {

    private ChatInit chatInit;

    public ChatEventDefine(ChatInit chatInit) {
        this.chatInit = chatInit;

        chatInit.move();
        this.barChat();
        this.barFriend();
    }

    private void barChat() {
        Button bar_chat = chatInit.$("bar_chat", Button.class);
        Pane group_bar_chat = chatInit.$("group_bar_chat", Pane.class);
        bar_chat.setOnAction(event -> {
            switchBarChat(bar_chat, group_bar_chat, true);
            switchBarFriend(chatInit.$("bar_friend", Button.class), chatInit.$("group_bar_chat", Pane.class), false);
        });
        bar_chat.setOnMouseEntered(event -> {
            boolean visible = group_bar_chat.isVisible();
            if (visible) return;
            bar_chat.setStyle("-fx-background-image: url('/fxml/chat/img/system/chat_1.png')");
        });
        bar_chat.setOnMouseExited(event -> {
            boolean visible = group_bar_chat.isVisible();
            if (visible) return;
            bar_chat.setStyle("-fx-background-image: url('/fxml/chat/img/system/chat_0.png')");
        });
    }

    private void barFriend() {
        Button bar_friend = chatInit.$("bar_friend", Button.class);
        Pane group_bar_friend = chatInit.$("group_bar_friend", Pane.class);
        bar_friend.setOnAction(event -> {
            switchBarChat(chatInit.$("bar_chat", Button.class), chatInit.$("group_bar_chat", Pane.class), false);
            switchBarFriend(bar_friend, group_bar_friend, true);
        });
        bar_friend.setOnMouseEntered(event -> {
            boolean visible = group_bar_friend.isVisible();
            if (visible) return;
            bar_friend.setStyle("-fx-background-image: url('/fxml/chat/img/system/friend_1.png')");
        });
        bar_friend.setOnMouseExited(event -> {
            boolean visible = group_bar_friend.isVisible();
            if (visible) return;
            bar_friend.setStyle("-fx-background-image: url('/fxml/chat/img/system/friend_0.png')");
        });
    }

    private void switchBarChat(Button button, Pane pane, boolean toggle) {
        if (toggle) {
            button.setStyle("-fx-background-image: url(/fxml/chat/img/system/chat_2.png)");
            pane.setVisible(true);
        } else {
            button.setStyle("-fx-background-image: url(/fxml/chat/img/system/chat_0.png)");
            pane.setVisible(false);
        }
    }

    private void switchBarFriend(Button button, Pane pane, boolean toggle) {
        if (toggle) {
            button.setStyle("-fx-background-image: url(/fxml/chat/img/system/friend_2.png)");
            pane.setVisible(true);
        } else {
            button.setStyle("-fx-background-image: url(/fxml/chat/img/system/friend_0.png)");
            pane.setVisible(false);
        }
    }

}
