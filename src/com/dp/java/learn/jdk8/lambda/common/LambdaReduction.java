package com.dp.java.learn.jdk8.lambda.common;

import java.util.Arrays;
import java.util.List;

/**
 * 5、归约：sum
 */
public class LambdaReduction {
    public static void main(String[] args) {
        List<Integer> intList = Arrays.asList(1, 2, 3, 4, 5);
        int sum = 0;
        //使用froeach
        System.out.println("==============foreach==============");
        for (Integer i : intList) {
            sum += i;
        }
        System.out.println(sum);

        //lambda 使用Stream流来操作
        System.out.println("==============lambda==============");
        sum = intList
                .stream()
                .reduce(0, (a, b) -> a + b);

        System.out.println(sum);
    }
}
