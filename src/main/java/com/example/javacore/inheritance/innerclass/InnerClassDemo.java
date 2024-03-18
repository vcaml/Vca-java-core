package com.example.javacore.inheritance.innerclass;

import com.example.javacore.inheritance.Plane;
import com.example.javacore.inheritance.SkyDream;

public class InnerClassDemo {

    public static void sky(SkyDream skyDream){
        skyDream.fly();
    }

    public static void main(String[] args) {

     // 正常调用接口方法 先创建一个plane类去实现接口
        SkyDream skyDream = new Plane();

        sky(skyDream);

     //匿名内部类 根本不需要单独创建类 直接实现接口方法

        sky(new SkyDream() {
                @Override
                public void fly() {
                    System.out.println("匿名直接实现了飞天的梦想");
                }
            }
        );

        new SkyDream(){
            @Override
            public void fly() {
                System.out.println("第二种方式匿名直接实现了飞天的梦想");
            }
        }.fly();

    }
}
