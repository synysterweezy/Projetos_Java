package com.example.recyclerviewtitan.model;

import com.example.recyclerviewtitan.model.ChildItem;

import java.util.List;

public class ParentItem {

    private String ParentItemTitle;
    private List<ChildItem> ChildItemList;

    public ParentItem(String ParentItemTitle, List<ChildItem> ChildItemList) {
        this.ParentItemTitle = ParentItemTitle;
        this.ChildItemList = ChildItemList;
    }

    public String getParentItemTitle(){
        return ParentItemTitle;
    }

    public void setParentItemTitle(String parentItemTitle){
        ParentItemTitle = parentItemTitle;
    }

    public List<ChildItem> getChildItemList() {
        return ChildItemList;
    }

    public void setChildItemList(List<ChildItem> childItemList) {
        ChildItemList = childItemList;
    }
}