package com.example.javacore.threadpool.demo1;

import java.util.concurrent.*;

public class Test {
    public static void main(String[] args) {
//        /**
//         * 一些常见的jdk提供的线程池
//         * */
//        ExecutorService es1 = Executors.newFixedThreadPool(3);
//
//        ExecutorService es2 = Executors.newCachedThreadPool();
//
//        ExecutorService es3 = Executors.newScheduledThreadPool(3);
//
//
//        /**
//         * 自定义线程池
//         * */
//
//        ExecutorService es4 =new ThreadPoolExecutor(
//                5,
//                6,
//                30,
//                TimeUnit.SECONDS,
//                new ArrayBlockingQueue<>(3));

        PrintTimeTask timeTask = new PrintTimeTask();

        CustomThreadPool customThreadPool = new CustomThreadPool();

        for (int i = 0; i < 4; i++) {
            customThreadPool.execute(timeTask);
        }
    }
}
