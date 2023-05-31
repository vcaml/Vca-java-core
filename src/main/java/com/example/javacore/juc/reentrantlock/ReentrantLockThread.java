package com.example.javacore.juc.reentrantlock;

import com.example.javacore.juc.sync.SyncTestThread;

import java.util.concurrent.locks.ReentrantLock;

public class ReentrantLockThread extends Thread{

    public static int count = 0;
    static ReentrantLock lock = new ReentrantLock(true);

    @Override
    public void run(){
        for (int i = 0; i < 101; i++) {
            lock.lock();
            try {
                count++;
                System.out.println(Thread.currentThread().getName()+"---"+count);
            }finally{
                lock.unlock();
            }
        }
    }

}
