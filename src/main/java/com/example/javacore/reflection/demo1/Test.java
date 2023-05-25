package com.example.javacore.reflection.demo1;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Test {
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException, ClassNotFoundException {

        Class reflect = Class.forName("com.example.javacore.reflection.demo1.Cat");

        String name = reflect.getName();


        System.out.println("获取到类名："+name);

        //动态创建类的对象

        Object object = reflect.getConstructor().newInstance();

        //调用方法

        Method method = reflect.getDeclaredMethod("play1");
        //注意这里是一个私有方法 所以设置其可访问性
        method.setAccessible(true);
        method.invoke(object);


    }
}
