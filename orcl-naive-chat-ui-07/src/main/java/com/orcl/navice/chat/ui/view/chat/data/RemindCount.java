package com.orcl.navice.chat.ui.view.chat.data;

/**
 * @description: 消息提醒
 * @author: orcl
 * @since: 2022/4/19-14:30
 * @history: 2022/4/19 created by orcl
 */
public class RemindCount {

    /**
     * 消息提醒条数
     */
    private int count = 0;

    public RemindCount() {
    }

    public RemindCount(int count) {
        this.count = count;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }
}
