package com.dp.java.learn.jdk8.lambda.common;

import java.util.Arrays;
import java.util.List;

/**
 * 1、遍历集合
 */
public class LambdaCollectionErgodic {
    public static void main(String[] args) {
        List<String> stringList = Arrays.asList("aadsd","eww","526","vrf");

        //foreach
        System.out.println("==============foreach==============");
        for (String s: stringList) {
            System.out.println(s);
        }

        //lambda
        System.out.println("==============lambda 好理解==============");
        stringList.forEach(s-> System.out.println(s));

        System.out.println("==============lambda 不好理解==============");
        stringList.forEach(System.out::println);

    }
}
