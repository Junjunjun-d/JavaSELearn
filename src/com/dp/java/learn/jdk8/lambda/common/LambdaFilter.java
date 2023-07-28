package com.dp.java.learn.jdk8.lambda.common;

import java.util.Arrays;
import java.util.List;

/**
 * 3、过滤
 */
public class LambdaFilter {
    public static void main(String[] args) {
        List<String> stringList = Arrays.asList("aadsd","eww","526","vrf");

        //使用froeach
        System.out.println("==============foreach==============");
        for(String s: stringList){
            if(!s.contains("a")){
                System.out.println(s);
            }
        }

        //lambda 使用Stream流来操作
        System.out.println("==============lambda==============");
        stringList
                .stream()
                .filter(f->f.contains("a"))
                .forEach(System.out::println);
    }
}
