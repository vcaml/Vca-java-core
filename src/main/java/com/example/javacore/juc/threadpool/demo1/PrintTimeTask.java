package com.example.javacore.juc.threadpool.demo1;

public class PrintTimeTask implements Runnable{
    @Override
    public void run() {
        try {
            System.out.println("当前线程："+Thread.currentThread().getName()+"-打印时间："+System.currentTimeMillis());
        } catch (Exception e) {
            e.printStackTrace();
            //log.error()
        }
    }
}
