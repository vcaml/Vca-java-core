package com.example.javacore.stream;

import com.example.eneity.Student;

import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class TestStreamOperation2 {
    public static void simpleTraverse(List<Student>studentList,String commit){
        System.out.println(commit+"_输出结果：");
        for( Student student:studentList){
            System.out.println(student.getName());
        }
    }

    public static void main(String[] args) {
     List<Long> list = new LinkedList<>();
     list.add(123L);
     list.add(124L);
     list.add(125L);
     String rwList =list.stream().map(String::valueOf).collect(Collectors.joining(","));
        System.out.println(rwList);

    }
}

