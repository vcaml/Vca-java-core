package com.example.javacore.juc.sync;

public class Test {

    public static void main(String[] args) throws InterruptedException {

        SyncTestThread syncTestThread1 = new SyncTestThread();
        SyncTestThread syncTestThread2 = new SyncTestThread();

        syncTestThread1.start();
        syncTestThread2.start();

        // 这里记得加上join方法 不然线程还没执行完 主线程就把count打出来了
        syncTestThread1.join();
        syncTestThread2.join();
        System.out.println("the back is "+SyncTestThread.count);
    }
}
