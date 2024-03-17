package com.example.eneity;

import lombok.Getter;
import lombok.Setter;

public class Cat extends Animal{
    //猫的品种
    @Setter
    @Getter
    private String typeCat;

    @Override
    public void show() {
        System.out.println("这是一只猫 喵喵喵");
    }

    @Override
    public void eat() {
        System.out.println("吃猫粮");
    }
}
