package com.example.eneity;

import lombok.Data;

@Data
public class Student {
    //学号
    private Long id;

    //姓名
    private String name;

    //年级排名
    private int ranking;

    //性别
    private Boolean sex;

    public Student( Long id,String name,int ranking,Boolean sex){
        this.id=id;
        this.name=name;
        this.ranking=ranking;
        this.sex=sex;
    }
}
