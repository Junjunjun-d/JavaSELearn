package com.dp.mian.shi.mx.q10;

/**
 * @Author: DZF
 * @Date: 2022年3月16日 下午9:42:25
 * @Description: com.mian.shi.mx.q10
 * @Version: 1.0
 */
public class Super {
	public static void a() {
		//公有的类方法（静态方法）
		//a();
		b();
		Super s = new Super();
		s.c();
	}
	private static void b() {
		//私有的类方法（静态方法）
		System.out.println("b");
	}
	public void c() {
		//公有的实例方法
		System.out.println("c");
		this.d();
	}
	private void d() {
		//私有的实例方法
		System.out.println("d");
	}
}
