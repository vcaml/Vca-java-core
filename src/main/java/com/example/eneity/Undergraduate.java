package com.example.eneity;

//大学生类继承于学生类，在学生的基础上
public class Undergraduate extends Student{

    private String dormitoryName;

    public String getDormitoryName() {
        return dormitoryName;
    }

    public void setDormitoryName(String dormitoryName) {
        this.dormitoryName = dormitoryName;
    }

    @Override
    public void show() {
        System.out.println("这个学生已经成为了一个大学生了");
    }
}
