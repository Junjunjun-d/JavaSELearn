package com.dp.java.learn.jdk8.lambda.common;

import java.util.*;
import java.util.Map.Entry;
import java.util.stream.Collectors;

/**
 * 6、分组
 */
public class LambdaGroup {
    public static void main(String[] args) {
        List<String> stringList = Arrays.asList("aadsd","eww","526","vrf");
        Map<Integer,List<String>> groupMap1 = new HashMap<>();
        Map<Integer,List<String>> groupMap2 = new HashMap<>();
        //使用froeach
        System.out.println("==============foreach==============");
        for (String s : stringList) {
            int length = s.length();
            if(!groupMap1.containsKey(length)){
                groupMap1.put(length,new ArrayList<String>());
            }
            groupMap1.get(length).add(s);
        }

        Set<Integer> keySet = groupMap1.keySet();
        Iterator<Integer> iterator = keySet.iterator();
        while (iterator.hasNext()){
            int key = iterator.next();
            List<String> list = groupMap1.get(key);
            System.out.println("key= " + key + " value= " + list);
        }

        //lambda 使用Stream流来操作
        System.out.println("==============lambda==============");
        groupMap2 = stringList
                .stream()
                .collect(Collectors.groupingBy(s -> s.length()));


        Set<Entry<Integer, List<String>>> entries = groupMap2.entrySet();
        Iterator<Entry<Integer, List<String>>> iterator1 = entries.iterator();
        while(iterator1.hasNext()){
            Entry<Integer, List<String>> entry = iterator1.next();
            int key = entry.getKey();
            List<String> value = entry.getValue();
            System.out.println("key= " + key + " value= " + value);
        }

    }
}
