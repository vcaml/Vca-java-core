package com.example.network.okhttp;

import okhttp3.*;

import java.io.IOException;

/**
 * 最简单的okhttp的使用例子。 直接new一个client使用（后续可以优化成单例创建client）
 * https://jsonplaceholder.typicode.com/posts/1 是jsonplaceholder网站免费的测试api假数据调用
 *
 * 教程链接：https://blog.logrocket.com/a-complete-guide-to-okhttp/
 * */
public class DemoTest {

    //get方法例子
    public static void getf(){
        OkHttpClient client = new OkHttpClient();
        Request getRequest = new Request.Builder()
                .url("https://jsonplaceholder.typicode.com/posts/1")
                .build();

        try {
            Response response = client.newCall(getRequest).execute();
            System.out.println(response.body().string());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    //post方法例子
    public static void postf(){
        OkHttpClient client = new OkHttpClient();

        RequestBody requestBody = new FormBody.Builder()
                .add("new", "This is my new TODO")
                .build();

        Request postRequest = new Request.Builder()
                .url("https://mytodoserver.com/new")
                .post(requestBody)
                .build();

        try {
            Response response = client.newCall(postRequest).execute();
            System.out.println(response.body().string());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static void main(String[] args) {
          getf();
          postf();
    }
}
