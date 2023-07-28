package com.dp.java.learn.jdk8.lambda.common;

/**
 * 7、函数式接口
 */
public class LambdaCreateThread {
    public static void main(String[] args) {
        System.out.println("==============内部类==============");
        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Thread000001");
            }
        });
        thread1.start();

        System.out.println("==============lambda==============");
        Thread thread2 = new Thread(()-> System.out.println("Thread000002") );
        thread2.start();
    }

}
