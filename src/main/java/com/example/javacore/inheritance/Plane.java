package com.example.javacore.inheritance;

public class Plane implements SkyDream{
    @Override
    public void fly() {
        System.out.println("飞机实现了飞天的梦想");
    }
}
