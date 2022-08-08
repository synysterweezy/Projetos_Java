package com.example.recyclerviewtitan.model;

public class ChildItem {

    private String ChildItemTitle;
    private int ChildItemRate;

    public int getChildItemRate(){
        return ChildItemRate;
    }

    public void setChildItemRate(int childItemRate) {
        ChildItemRate = childItemRate;
    }

    public ChildItem(String childItemTitle, int ChildItemRate){
        setChildItemTitle(childItemTitle);
        this.setChildItemRate(ChildItemRate);
    }
    public String getChildItemTitle(){
        return ChildItemTitle;
    }
    public void setChildItemTitle(String childItemTitle){
        ChildItemTitle = childItemTitle;
    }
}