package com.example.javacore.juc.sync;

public class SyncTestThread extends Thread{

    public static int count = 0;
    static SyncTestThread instance = new SyncTestThread();

    @Override
    public void run(){
        for (int i = 0; i < 10000; i++) {
            synchronized (instance) {
                count++;
            }
        }
    }

}
