package com.orcl.navice.chat.ui.view.chat.element.group_bar_friend;

import javafx.collections.ObservableList;
import javafx.scene.Node;
import javafx.scene.control.ListView;
import javafx.scene.layout.Pane;

/**
 * @description: 组件；群组
 * @author: orcl
 * @since: 2022/4/19-21:09
 * @history: 2022/4/19 created by orcl
 */
public class ElementFriendGroupList {

    private Pane pane;

    /**
     * 群组列表
     */
    private ListView<Pane> groupListView;

    public ElementFriendGroupList() {
        pane = new Pane();
        pane.setId("friendGroupList");
        pane.setPrefWidth(314);

        // 自动计算；groupListView.setPrefHeight(70 * items.size() + 10);
        pane.setPrefHeight(0);
        pane.setLayoutX(-10);
        pane.getStyleClass().add("elementFriendGroupList");
        ObservableList<Node> children = pane.getChildren();

        groupListView = new ListView<>();
        groupListView.setId("groupListView");
        groupListView.setPrefWidth(314);

        // 自动计算；groupListView.setPrefHeight(70 * items.size() + 10);
        groupListView.setPrefHeight(0);
        groupListView.setLayoutX(-10);
        groupListView.getStyleClass().add("elementFriendGroupList_listView");
        children.add(groupListView);
    }

    public Pane pane() {
        return pane;
    }

}
