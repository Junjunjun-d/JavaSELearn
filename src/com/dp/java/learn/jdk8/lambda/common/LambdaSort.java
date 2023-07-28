package com.dp.java.learn.jdk8.lambda.common;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * 2、排序
 */
public class LambdaSort {
    public static void main(String[] args) {
        //内部类
        List<String> stringList = Arrays.asList("aadsd","eww","526","vrf");
        Collections.sort(stringList, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.compareTo(o2);
            }
        });
        System.out.println("==============内部类==============");
        stringList.forEach(System.out::println);

        //lambda
        Collections.sort(stringList,(s1,s2)->s1.compareTo(s2));
        System.out.println("==============lambda==============");
        stringList.forEach(System.out::println);

    }
}
