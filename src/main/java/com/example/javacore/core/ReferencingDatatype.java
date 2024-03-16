package com.example.javacore.core;

import com.example.eneity.Student;

public class ReferencingDatatype {
    public static void main(String[] args) {
        int a =10;
        addMethod(a);
        System.out.println(a);


        Student student = new Student();
        student.setRanking(10);
        addMethod3(student);
        System.out.println(student.getRanking());
    }

    private static void addMethod3(Student student) {
        student.setRanking(20);
    }

    private static void addMethod(int a) {
        a=20;
    }
}
