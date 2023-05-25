package com.example.javacore.staticDemo;

public class Pet {
    public Cat cat = new Cat();
    Pet(){

        System.out.println("pet 初始化");
    }
    public static Dog dog = new Dog();
}
