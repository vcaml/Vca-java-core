package com.example.network.okhttp;

import okhttp3.OkHttpClient;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

/**
 * 通过单例模式生成 okhttpclient
 * 以确保在整个应用程序中只有一个共享的OkHttpClient对象，不然每次通过okhttp调用的时候 都要new一个client会非常浪费资源和内存
 * */

public class OkHttpClientSingleton {
    private static OkHttpClient instance;

    // 私有构造函数，防止外部实例化
    private OkHttpClientSingleton() {
    }

    public static OkHttpClient getInstance() {
        if (instance == null) {
            synchronized (OkHttpClientSingleton.class) {
                if (instance == null) {
                    instance = new OkHttpClient();
                    System.out.println("系统new了一个OkHttpClient");
                }
            }
        }
        return instance;
    }
}
