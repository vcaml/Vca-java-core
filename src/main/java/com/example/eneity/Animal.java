package com.example.eneity;

import lombok.Getter;
import lombok.Setter;

public abstract class Animal {

    @Setter
    @Getter
    private String name = "动物";

    @Setter
    @Getter
    private int age;

    @Setter
    @Getter
    private String color;


    public void show(){
        System.out.println("这是一个动物");
    }

   public abstract void eat();
}
