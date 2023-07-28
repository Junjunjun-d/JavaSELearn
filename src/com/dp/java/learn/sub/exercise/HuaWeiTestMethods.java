package com.dp.java.learn.sub.exercise;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class HuaWeiTestMethods {
	public static void mergeTableRecord() {
		Scanner sc = new Scanner(System.in);

		while (sc.hasNext()) {
			int size = sc.nextInt();
			TreeMap<Integer, Integer> map = new TreeMap<>();
			for (int i = 0; i < size; i++) {
				int key = sc.nextInt();
				int value = sc.nextInt();
				if (map.containsKey(key)) {
					map.put(key, map.get(key) + value);
				} else {
					map.put(key, value);
				}
			}
			for (Map.Entry<Integer, Integer> n : map.entrySet()) {
				System.out.println(n.getKey() + " " + n.getValue());
			}
		}
		sc.close();
	}
}
