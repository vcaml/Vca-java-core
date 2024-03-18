package com.example.designpattern.adapter;

import com.example.javacore.inheritance.Bird;
import com.example.javacore.inheritance.SkyDream;

/**
 * 适配器设计模式  一般用于解决不同接口之间的矛盾
 * 一个接口A 需要B类的方法去实现 但是由于特殊原因 B不方便直接实现接口A 那么这时候需要一个适配器类C 先实现接口A 在C的内部具体实现接口A方法的时候 调用B 这样A和B 就被联系起来了
 * */
public class Adapter implements SkyDream {

    private Bird bird;

    public Adapter(Bird bird){
        this.bird=bird;
    }
    @Override
    public void fly() {
        bird.flyToSky();
    }
}
