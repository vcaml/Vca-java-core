package com.example.eneity;

public class Box {
    private String str;

    public <T> Boxs<T> getBoxsData(T data) {
        Boxs<T>boxOfStr = new Boxs<>();
        boxOfStr.setData(data);
        return boxOfStr;
    }
    public String getStr() {
        return str;
    }

    public void setStr(String str) {
        this.str = str;
    }
}
