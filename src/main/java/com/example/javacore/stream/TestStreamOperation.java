package com.example.javacore.stream;

import com.example.eneity.ScPlayer;
import com.example.eneity.Student;

import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TestStreamOperation{
    public static void simpleTraverse(List<Student>studentList,String commit){
        System.out.println(commit+"_输出结果：");
        for( Student student:studentList){
            System.out.println(student.getName());
        }
    }

    public static void main(String[] args) {
        List<Student>studentList = new LinkedList<>();
        studentList.add(new Student(1L,"maru",1,true));
        studentList.add(new Student(2L,"serral",13,true));
        studentList.add(new Student(3L,"dark",25,false));
        studentList.add(new Student(4L,"zest",40,true));
        studentList.add(new Student(5L,null,42,false));
        studentList.add(new Student(6L,"clem",50,true));
        studentList.add(new Student(7L,"solar",65,true));

        String collect = studentList.stream().map(Student::getName).collect(Collectors.joining(","));
        System.out.println(collect);

        // filter
//        List<Student> studentsOfFilter = studentList.stream().filter(student -> student.getRanking() < 30).collect(Collectors.toList());
//        simpleTraverse(studentsOfFilter,"按ranking过滤");

//        List<Student> studentsOfFilter2 = studentList.stream().filter(student ->student.getSex().equals(true)).collect(Collectors.toList());
//        simpleTraverse(studentsOfFilter2,"按性别过滤");

        //map
//        List<Integer> addRlist = studentList.stream().map(s -> s.getRanking() + 10).collect(Collectors.toList());
//        addRlist.forEach(System.out::println);

//        List<ScPlayer> scPlayers = studentList.stream().map(s -> {
//            ScPlayer scPlayer = new ScPlayer();
//            scPlayer.setName(s.getName());
//            if (s.getRanking() < 10) {
//                scPlayer.setGrade(1);
//            } else if (s.getRanking() >= 11 && s.getRanking() < 20) {
//                scPlayer.setGrade(2);
//            } else {
//                scPlayer.setGrade(3);
//            }
//            scPlayer.setRace("Terran");
//            return scPlayer;
//        }).collect(Collectors.toList());
//
//        scPlayers.forEach(System.out::println);

         //anymatch
//        boolean anyMatch40 = studentList.stream().anyMatch(s -> s.getRanking() == 40);
//        System.out.println("anyMatch40: "+anyMatch40);
//
//        //allmatch
//        boolean allMatch40 = studentList.stream().allMatch(s -> s.getRanking() == 40);
//        System.out.println("allMatch40: "+allMatch40);


          //示例
//        String []deptNames = {"点猫科技", "深圳市点猫科技有限公司啊", "深空业务中心", "教学部", "教学管理组", "深圳团","深圳团2队","教学1团2队3组"};
//        String deptName = Stream.of(deptNames)
//                .skip(4)
//                .limit(20)
//                .collect(Collectors.joining("-"));
//        System.out.println(deptName);



    }
}

