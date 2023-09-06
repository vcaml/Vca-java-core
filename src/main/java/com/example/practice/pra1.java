package com.example.practice;

import java.text.SimpleDateFormat;
import java.util.*;

public class pra1 {
    public static void main(String[] args) {
        long timestamp = 1693826750000L;

        // 创建 SimpleDateFormat 对象并设置时区为中国标准时间
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        sdf.setTimeZone(TimeZone.getTimeZone("GMT+8"));

        // 将时间戳转换为日期和时间
        Date date = new Date(timestamp);
        String chinaTime = sdf.format(date);

        System.out.println("中国区时间：" + chinaTime);

    }
}
