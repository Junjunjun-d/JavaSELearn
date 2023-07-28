package com.dp.java.learn.jdk8.lambda.common;
/**
 * 7、函数式接口
 */
public class LambdaFuncInter {
    public static void main(String[] args) {
        MyInterface myInterface = new MyInterface(){
            public void doSomething(String input){
                System.out.println(input);
            }
        };
        System.out.println("==============内部类==============");
        myInterface.doSomething("fdsnfklfuslsgflsiL<.?");


        MyInterface myInterface1 = s -> System.out.println(s);
        System.out.println("==============lambda==============");
        myInterface1.doSomething("hello wocao");
    }

}
