package com.orcl.navice.chat.ui.view.chat;

/**
 * @description:
 * @author: orcl
 * @since: 2022/4/19-10:32
 * @history: 2022/4/19 created by orcl
 */
public class ChatController extends ChatInit implements IChatMethod {

    private ChatEventDefine chatEventDefine;

    @Override
    public void doShow() {
        super.show();
    }

    @Override
    public void initView() {

    }

    @Override
    public void initEventDefine() {
        chatEventDefine = new ChatEventDefine(this);
    }
}
