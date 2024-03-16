package com.example.javacore.inheritance;

import com.example.eneity.*;

/**
 * 继承 封装 和多态
 * */

public class InheritanceDemo {
    public static void main(String[] args) {

        Animal a1 = new Dog();
        System.out.println(a1.getName());
        show(a1);

        Animal a2 = new Cat();
        System.out.println(a2.getName());
        show(a2);


    }

    public static void show(Animal animal){
        animal.show();
    }
}
