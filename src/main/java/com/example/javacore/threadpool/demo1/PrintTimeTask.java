package com.example.javacore.threadpool.demo1;

public class PrintTimeTask implements Runnable{
    @Override
    public void run() {
        System.out.println("当前线程："+Thread.currentThread().getName()+"-打印时间："+System.currentTimeMillis());
    }
}
