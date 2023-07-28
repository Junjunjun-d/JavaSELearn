package com.dp.mian.shi.abst;

/**
 * @Author: DZF
 * @Date: 2022年3月25日 下午7:23:10
 * @Description: 超类；验证子类继承时 是否需要实现其中的实例方法
 * @Version: 1.0
 */
public abstract class Supper {

	public abstract void test();

	public void test2() {
		System.out.println("实例方法");
	}
}
