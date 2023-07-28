package com.dp.java.learn.sub.exercise;

import java.util.Scanner;
/**
 *
 * @Author: DZF
 * @Date: 2022年5月6日 下午9:19:03
 * @Description: Scanner器中next()和nextLine()区别
 * @Version: 1.0
 */
public class ScannerTestMethods {
	public static void scannerTest() {
		Scanner sc = new Scanner(System.in);
		while (sc.hasNext()) {
			// String s1 = scanner.next();// 如果有空格的话会返回两行
			// System.out.println(s1);

			String s2 = sc.nextLine();// 不考虑空格，只返回一行
			System.out.println(s2);
		}
		sc.close();
	}
}
