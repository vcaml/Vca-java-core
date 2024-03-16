package com.example.eneity;

import lombok.Getter;
import lombok.Setter;

public class Dog extends Animal{

    //狗的品种
    @Setter
    @Getter
    private String typeDog;

    @Override
    public void show() {
        System.out.println("这是一只狗 汪汪汪");
    }
}
