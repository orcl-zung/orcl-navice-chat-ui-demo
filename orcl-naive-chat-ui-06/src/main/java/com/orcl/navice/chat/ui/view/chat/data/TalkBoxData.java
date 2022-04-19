package com.orcl.navice.chat.ui.view.chat.data;

/**
 * @description:
 * @author: orcl
 * @since: 2022/4/19-14:30
 * @history: 2022/4/19 created by orcl
 */
public class TalkBoxData {

    /**
     * 对话ID
     */
    private String talkId;

    /**
     * 对话类型
     */
    private Integer talkType;

    /**
     * 对话名称
     */
    private String talkName;

    /**
     * 对话头像
     */
    private String talkHead;

    public TalkBoxData() {
    }

    public TalkBoxData(String talkId, Integer talkType, String talkName, String talkHead) {
        this.talkId = talkId;
        this.talkType = talkType;
        this.talkName = talkName;
        this.talkHead = talkHead;
    }

    public String getTalkId() {
        return talkId;
    }

    public void setTalkId(String talkId) {
        this.talkId = talkId;
    }

    public Integer getTalkType() {
        return talkType;
    }

    public void setTalkType(Integer talkType) {
        this.talkType = talkType;
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
