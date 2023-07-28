package com.dp.java.learn.jdk8.lambda.test1;

import java.util.function.BiFunction;

/**
 * @Author: DZF
 * @Date: 2022年5月7日 下午9:08:23
 * @Description: (1) 声明一个带两个泛型的函数式接口，类型为<T,R> T为参数  R为返回值
 * 				 (2) 接口中声明对应的方法
 * 				 (3) 在类中声明方法，参数三个 两个long类型的参数，接口作为参数，接口实现中计算两个参数的和
 * 				 (4) 计算两个参数的乘积
 * @Version: 1.0
 */
public class TestLambda03 {

	public static void main(String[] args) {
		test(100L, 300L, (x,y)->x+y);
		test(100L, 300L, (x,y)->x*y);
	}

	/*public static void test(Long l1, Long l2, MyFunction02<Long,Long> my) {
		System.out.println(my.test(l1, l2));
	}
	*/
	public static void test(Long l1, Long l2, BiFunction<Long,Long,Long> my) {
		System.out.println(my.apply(l1, l2));
	}
}

