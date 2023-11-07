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

//    自定义配置OkHttpClient示例
//    OkHttpClient client = new OkHttpClient.Builder()
//            .cache(cache) // configure cache, see above
//            .proxy(proxy) // configure proxy, see above
//            .certificatePinner(certificatePinner) // certificate pinning, see above
//            .addInterceptor(interceptor) // app level interceptor, see above
//            .addNetworkInterceptor(interceptor) // network level interceptor, see above
//            .authenticator(authenticator) // authenticator for requests (it supports similar use-cases as "Authorization header" earlier
//            .callTimeout(10000) // default timeout for complete calls
//            .readTimeout(10000) // default read timeout for new connections
//            .writeTimeout(10000) // default write timeout for new connections
//            .dns(dns) // DNS service used to lookup IP addresses for hostnames
//            .followRedirects(true) // follow requests redirects
//            .followSslRedirects(true) // follow HTTP tp HTTPS redirects
//            .connectionPool(connectionPool) // connection pool used to recycle HTTP and HTTPS connections
//            .retryOnConnectionFailure(true) // retry or not when a connectivity problem is encountered
//            .cookieJar(cookieJar) // cookie manager
//            .dispatcher(dispatcher) // dispatcher used to set policy and execute asynchronous requests
//            .build();


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
