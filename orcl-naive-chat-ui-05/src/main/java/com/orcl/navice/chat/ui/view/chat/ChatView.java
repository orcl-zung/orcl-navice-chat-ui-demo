package com.orcl.navice.chat.ui.view.chat;

/**
 * @description:
 * @author: orcl
 * @since: 2022/4/19-10:32
 * @history: 2022/4/19 created by orcl
 */
public class ChatView {

    private ChatInit chatInit;

    private IChatEvent chatEvent;

    public ChatView(ChatInit chatInit, IChatEvent chatEvent) {
        this.chatInit = chatInit;
        this.chatEvent = chatEvent;
    }
}
