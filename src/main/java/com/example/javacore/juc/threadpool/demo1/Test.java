package com.example.javacore.juc.threadpool.demo1;

import java.util.concurrent.*;

public class Test {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        /**
         * 一些常见的jdk提供的线程池
         * */
        ExecutorService es1 = Executors.newFixedThreadPool(3);

        ExecutorService es2 = Executors.newCachedThreadPool();

        ExecutorService es3 = Executors.newScheduledThreadPool(3);


        //往线程池里面提交的task
        PrintTimeTask timeTask = new PrintTimeTask();

        /**
         * 自定义线程池
         * */
        CustomThreadPool customThreadPool = new CustomThreadPool();

        for (int i = 0; i < 4; i++) {
           // customThreadPool.execute(timeTask);
            Future future = customThreadPool.submit(timeTask);
            future.get();
        }
    }
}
