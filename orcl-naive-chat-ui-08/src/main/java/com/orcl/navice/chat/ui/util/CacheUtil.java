package com.orcl.navice.chat.ui.util;

import com.orcl.navice.chat.ui.view.chat.element.group_bar_chat.ElementTalk;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @description:
 * @author: orcl
 * @since: 2022/4/19-14:40
 * @history: 2022/4/19 created by orcl
 */
public class CacheUtil {

    /**
     * 对话框组
     */
    public static Map<String, ElementTalk> talkMap = new ConcurrentHashMap<>(16);

}
