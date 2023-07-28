package com.dp.java.learn.jdk8.lambda.common;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * 4、映射
 */
public class LambdaReflection {
    public static void main(String[] args) {
        List<String> stringList = Arrays.asList("aadsd", "eww", "526", "vrf");

        //使用froeach
        System.out.println("==============foreach==============");
        for (String s : stringList) {
            System.out.println(s.length());
        }

        //lambda 使用Stream流来操作
        System.out.println("==============lambda==============");
        stringList
                .stream()
                .map(s->s.length())
                .forEach(System.out::println);
    }
}