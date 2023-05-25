package com.example.javacore.reflection.demo1;

public class Cat {
    private static String name;

    public Cat(){
        name="雷猫咪";
    }

    private void play1(){
        System.out.println("私有方法：和猫咪快乐的玩耍");
    }

    public void play2(){
        System.out.println("公有方法：带着猫咪出去逛街");
    }
}
