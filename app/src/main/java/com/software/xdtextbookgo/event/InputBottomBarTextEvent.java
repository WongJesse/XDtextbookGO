package com.software.xdtextbookgo.event;

/**
 * Created by huang on 2016/6/5.
 * InputBottomBar 发送文本事件
 */
public class InputBottomBarTextEvent extends InputBottomBarEvent {

    /**
     * 发送的文本内容
     */
    public String sendContent;

    public InputBottomBarTextEvent(int action, String content, Object tag) {
        super(action, tag);
        sendContent = content;
    }
}