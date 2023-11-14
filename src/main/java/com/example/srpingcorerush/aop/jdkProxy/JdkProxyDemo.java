package com.example.srpingcorerush.aop.jdkProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * jdk动态代理，通过一个简单的例子表现jdk动态代理的底层核心原理
 * 真实的jdk动态代理源码比这个复杂很多 但是核心不变
 * */
public class JdkProxyDemo {

    interface Foo{
        void foo();
    }

    static class Target implements Foo{

        @Override
        public void foo() {
            System.out.println("原始擎天柱");
        }
    }
    public static void main(String[] args) {
        Target target = new Target();
        ClassLoader loader = JdkProxyDemo.class.getClassLoader();
        Foo proxyInstance = (Foo) Proxy.newProxyInstance(loader, new Class[]{Foo.class}, new InvocationHandler() {
            @Override
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                System.out.println("对擎天柱进行前置武器增强");
                method.invoke(target,args);
                System.out.println("对擎天柱进行后置武器增强");
                return null;
            }
        });
        proxyInstance.foo();
    }
}
