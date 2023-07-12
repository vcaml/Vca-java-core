package com.example.javacore.generic;

import com.example.eneity.Box;
import com.example.eneity.Boxs;
import com.example.eneity.ScPlayer;

import java.util.LinkedList;
import java.util.List;

public class Test {
    public static void main(String[] args) {

        /**
         * 定义了一个Boxs<T>泛型类对象
         * */
        Boxs<Integer>boxOfInt = new Boxs<>();
        boxOfInt.setData(1);
        System.out.println(boxOfInt.getData());

        Boxs<String>boxOfStr = new Boxs<>();
        boxOfStr.setData("apple");
        boxOfStr.setCode("007");
        System.out.println(boxOfStr.getData());

        /**
         * 泛型方法
         * */
        ScPlayer scPlayer = new ScPlayer();
        scPlayer.setName("张三");
        Box box = new Box();
        Boxs<ScPlayer> boxsData = box.getBoxsData(scPlayer);

        List<ScPlayer> scPlayerList = new LinkedList<>();
        scPlayerList.add(scPlayer);

        Boxs<List<ScPlayer>> listBoxs = Boxs.create(scPlayerList, "007", "001231");


    }
}
