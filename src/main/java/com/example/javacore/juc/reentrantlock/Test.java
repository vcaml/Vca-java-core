package com.example.javacore.juc.reentrantlock;

public class Test {

    public static void main(String[] args) {
        ReentrantLockThread thread1 = new ReentrantLockThread();
        ReentrantLockThread thread2 = new ReentrantLockThread();

        thread1.start();
        thread2.start();

//        try {
//            thread1.join();
//            thread2.join();
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
//
//        System.out.println("Final count: " + ReentrantLockThread.count);
    }
}
