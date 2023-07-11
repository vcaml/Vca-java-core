package com.example.javacore.reflection.demo1;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Test {
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException, ClassNotFoundException {

        Class reflectClass = Class.forName("com.example.javacore.reflection.demo1.Cat");

        String name = reflectClass.getName();


        System.out.println("获取到类名："+name);

        //动态创建类的对象

        Object object = reflectClass.getConstructor().newInstance();

        //调用方法

        Method method = reflectClass.getDeclaredMethod("play1");
        //注意这里是一个私有方法 所以设置其可访问性
        method.setAccessible(true);

        //invoke（aaa）意味着在aaa对象上调用play1方法，如果play1有返回值 那么invoke会返回方法的结果
        method.invoke(object);


    }
}
