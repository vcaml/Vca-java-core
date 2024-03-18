package com.example.designpattern.adapter;

import com.example.javacore.inheritance.Bird;
import com.example.javacore.inheritance.SkyDream;

public class AdapterDemo {
    public static void main(String[] args) {
        Bird bird = new Bird();
        SkyDream skyDream = new Adapter(bird);
        skyDream.fly();
    }
}
