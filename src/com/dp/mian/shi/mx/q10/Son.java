package com.dp.mian.shi.mx.q10;

/**
 * @Author: DZF
 * @Date: 2022年3月16日 下午9:52:27
 * @Description: com.mian.shi.mx.q10
 * @Version: 1.0
 */
public class Son extends Super {

	public static void e() {}//类方法

	public void f() {}//实例方法

	public static void main(String[] args) {
		Super s = new Super();

		a();//可以直接使用超类的类名.方法名 访问超类的公开的类方法
		//s.b();//私有的不能被访问
		s.c();//可以访问公开的超类的实例方法
		//s.d();//私有的不能被访问

		Son.e();//可以直接使用超类的类名.方法名 访问本类的公开的类方法

		Son son = new Son();
		son.f();//先实例化本类，在调用本类的实例方法
	}
}
