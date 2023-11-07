package com.example.designpattern.singleton;

/**
 * 饿汉式 单例模式
 * */
public class Singleton1 {

    //构造方法设为私有
    private Singleton1(){}

    //创建一个本类的对象
    private static Singleton1 singletonInstance = new Singleton1();

    //提供一个外界可以访问的方式
    public static Singleton1 getInstance(){
        return singletonInstance;
    }

}
