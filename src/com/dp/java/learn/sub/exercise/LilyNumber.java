package com.dp.java.learn.sub.exercise;

/**
 * @Author: DZF
 * @Date: 2022年4月12日 下午7:20:56
 * @Description: 变种水仙花数 - Lily Number：把任意的数字，从中间拆分成两个数字，比如1461 可以拆分成（1和461）,（14和61）,（146和1),如果所有拆分后的乘积之和等于自身，则是一个Lily Number。
 * 例如：
 *	655 = 6 * 55 + 65 * 5
 *	1461 = 1*461 + 14*61 + 146*1
 *	求出 5位数中的所有 Lily Number
 * @Version: 1.0
 */
public class LilyNumber {

	public static void printLilyNumber() {
		long sum = 0;

		for (int i = 10000; i < 100000; i++) {
			//12345
			sum = (i / 10000) * (i % 10000) + (i / 1000) * (i % 1000) +  (i / 100) * (i % 100) + (i / 10) * (i % 10);
			if (i == sum) {
				System.out.println(i);
			} else {
				continue;
			}
		}
	}
}
