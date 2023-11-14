package com.example.javacore.util.date;

import java.util.Calendar;
import java.util.Date;

public class DateTestDemo {
    public static void main(String[] args) {
        Date date = new Date();
        System.out.println(date);

        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        // 计算半年前的日期
        calendar.add(Calendar.MONTH, -6);
        Date sixMonthsAgo = calendar.getTime();

        System.out.println(sixMonthsAgo);
    }
}
