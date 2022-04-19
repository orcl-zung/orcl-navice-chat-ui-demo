package com.orcl.navice.chat.ui.view.chat.data;

/**
 * @description: 对话框用户数据
 * @author: orcl
 * @since: 2022/4/19-14:30
 * @history: 2022/4/19 created by orcl
 */
public class TalkData {

    private String talkName;

    private String talkHead;

    public TalkData() {
    }

    public TalkData(String talkName, String talkHead) {
        this.talkName = talkName;
        this.talkHead = talkHead;
    }

    public String getTalkName() {
        return talkName;
    }

    public void setTalkName(String talkName) {
        this.talkName = talkName;
    }

    public String getTalkHead() {
        return talkHead;
    }

    public void setTalkHead(String talkHead) {
        this.talkHead = talkHead;
    }
}
