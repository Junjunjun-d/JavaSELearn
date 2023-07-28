package com.dp.mian.shi.mx.q1;

/**
 * @Author: DZF
 * @Date: 2022年3月14日 下午11:02:32
 * @Description: com.programming.training
 * @Version: 1.0
 */
public class PersonApp {

	public static void main(String[] args){
		Person p1 = new Person("Tom");
		Person p2 = new Person("Tom");
		System.out.println(p1 == p2);//false == 两边如果是基本类型， 比较的是基本类型的值，
		//两边如果是引用类型，比较的是对象指向的地址
		System.out.println(p1.equals(p2));//true 比较的是内容
	}
}
