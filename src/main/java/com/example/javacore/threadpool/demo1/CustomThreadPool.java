package com.example.javacore.threadpool.demo1;

import java.util.concurrent.*;

public class CustomThreadPool {

    /**
     * 这里我们创建自定义线程池，
     * jdk提供的现成的现场池也是由这个接口实现。但是下面的参数是固定的。
     * 下面自定义的方式 参数我们可以自己定
     * */
    private ExecutorService executorService;

    public CustomThreadPool(){
       executorService = new ThreadPoolExecutor(
               5,
               6,
               30,
               TimeUnit.SECONDS,
               new ArrayBlockingQueue<>(3),
               new ThreadFactory() {
                   @Override
                   public Thread newThread(Runnable r) {
                       Thread thread = new Thread();
                       thread.setName("定制化名称");
                       thread.setDaemon(true);
                       thread.setPriority(3);//优先级
                       return thread;
                   }
               });

    }

    public void execute(Runnable task){
        executorService.execute(task);
    }

    public Future submit(Runnable task){
        Future future = executorService.submit(task);
        return future;
    }
}