package com.dp.java.learn.sub.overload;

/**
 * @Author: DZF
 * @Date: 2022年5月6日 上午8:22:54
 * @Description: 方法重载
 * 			定义：同一个类中的同名不同参的多个方法
条件：
(1) 同一类中的多个方法
(2) 方法名相同
(3) 参数列表不同：个数，类型，不同类型的参数的顺序
 * @Version: 1.0
 */
public class TestOverLoad {

	//无参
	int getSum() {
		return 0;
	}

	// 重载：有1个参
	int getSum(int a) {
		return 0;
	}

	// 重载：有2个参
	int getSum(int a, int b) {
		return 0;
	}

	// 重载：有2个参  参数类型不同
	int getSum(long a, long b) {
		return 0;
	}

	// 重载：有3个参  参数类型位置不同
	int getSum(int a, long b, double c) {
		return 0;
	}

	// 重载：有3个参  参数类型位置不同
	int getSum(int a, double b, long c) {
		return 0;
	}

	// 重载：有3个参  参数类型位置不同
	int getSum(long a, int b, double c) {
		return 0;
	}
}
