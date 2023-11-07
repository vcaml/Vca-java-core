package com.example.designpattern.singleton;

/**
 * 懒汉式 线程不安全 单例模式
 * */
public class Singleton2 {

    //构造方法设为私有
    private Singleton2(){}

    //创建一个本类的对象
    private static Singleton2 singletonInstance;
    //提供一个外界可以访问的方式
    public static Singleton2 getInstance(){
        if (singletonInstance==null) {
            singletonInstance = new Singleton2();
       }
        return singletonInstance;
    }

}
