package com.example.srpingcorerush.aop;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

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
