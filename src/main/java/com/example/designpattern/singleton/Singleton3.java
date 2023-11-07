package com.example.designpattern.singleton;

/**
 * 懒汉式 线程安全 单例模式
 * */
public class Singleton3 {

    //构造方法设为私有
    private Singleton3(){}

    //创建一个本类的对象
    private static volatile Singleton3 singletonInstance;

    //提供一个外界可以访问的方式
    public static Singleton3 getInstance(){
        //如果为null 可能出现线程安全问题
        if (singletonInstance==null) {
            synchronized (Singleton3.class) {
                if (singletonInstance==null) {
                    singletonInstance = new Singleton3();
                }
            }
       }

        //如果不为null 不需要考虑线程安全问题
        return singletonInstance;
    }

}
