package com.example.javacore.exception;

public class Test {
    //检查异常 必须强制抛出异常或者捕获
    public static void demo1() throws ClassNotFoundException {
        Class.forName("unknownClass");
    }

    public static void demo2(){
        try {
            int[] a =   {1,2,3,4,5};
            int num =a[7];
        } catch (RuntimeException e) {
            System.out.println("运行时异常了！");
            e.printStackTrace();
        }
    }

    public static void main(String[] args) throws Exception {
        System.out.println("starting.....");
        try {
            demo2();
        }catch(Exception e){
            System.out.println("demo函数向上抛出了异常 (底层方法没有捕获到异常)");
            // 模拟程序到此中断，下面的ending....不会打印
            throw new Exception();
        }

        System.out.println("ending.....,程序没有因为异常而中断(底层方法捕获到了异常)");

    }
}
