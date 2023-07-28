package com.dp.mian.shi.basic;

/**
 * @Author: DZF
 * @Date: 2022年5月8日 下午8:49:03
 * @Description: String 比较
 * @Version: 1.0
 */
public class TestString {

	public static void main(String[] args) {
		//s1和s2 直接从常量池中取值  所以地址和值都是相等的
		//s3 是new出来的 内存地址不同
		String s1 = "12";
		String s2 = "1" + 2;
		String s3 = new String("12");

		System.out.println("==比较的是指向的地址：");
		System.out.println(s1 == s2);
		System.out.println(s3 == s1);
		System.out.println(s3 == s2);

		System.out.println(".equals()比较的是值：");
		System.out.println(s1.equals(s2));
		System.out.println(s3.equals(s1));
		System.out.println(s3.equals(s2));


		System.out.println("s1的hashCode：" + s1.hashCode());
		System.out.println("s2的hashCode：" + s2.hashCode());
		System.out.println("s3的hashCode：" + s3.hashCode());

		System.out.println("s1的内存地址：" + Integer.toHexString(System.identityHashCode(s1)));
		System.out.println("s2的内存地址：" + Integer.toHexString(System.identityHashCode(s2)));
		System.out.println("s3的内存地址：" + Integer.toHexString(System.identityHashCode(s3)));
	}

}
