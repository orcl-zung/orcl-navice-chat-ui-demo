package com.orcl.navice.chat.ui.view;

import javafx.scene.Cursor;
import javafx.scene.Parent;
import javafx.scene.control.ListView;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

/**
 * @description:
 * @author: orcl
 * @since: 2022/4/18-19:11
 * @history: 2022/4/18 created by orcl
 */
public abstract class UIObject extends Stage {

    protected Parent root;

    private double xOffset;

    private double yOffset;

    public <T> T $(String id, Class<T> clazz) {
        return (T) root.lookup("#" + id);
    }

    @SafeVarargs
    public final void clearViewListSelectedAll(ListView<Pane>... listViews) {
        for (ListView<Pane> listView : listViews) {
            listView.getSelectionModel().clearSelection();
        }
    }

    public void move() {
        root.setOnMousePressed(event -> {
            xOffset = getX() - event.getScreenX();
            yOffset = getY() - event.getScreenY();
            root.setCursor(Cursor.CLOSED_HAND);
        });
        root.setOnMouseDragged(event -> {
            System.out.println("移动窗体");
            setX(event.getScreenX() + xOffset);
            setY(event.getScreenY() + yOffset);
        });
        root.setOnMouseReleased(event -> root.setCursor(Cursor.DEFAULT));
    }

    /**
     * 初始化页面
     */
    public abstract void initView();

    /**
     * 初始化事件定义
     */
    public abstract void initEventDefine();

}
