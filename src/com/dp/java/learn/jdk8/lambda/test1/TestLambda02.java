package com.dp.java.learn.jdk8.lambda.test1;

import java.util.function.Function;

/**
 * @Author: DZF
 * @Date: 2022年5月7日 下午8:57:15
 * @Description: (1) 声明函数式接口，接口中声明抽象方法，
 * 				 (2) 声明类 类中编写方法使用接口作为参数，将一个字符串转大写，并作为方法的返回值
 * 				 (3) 将一个字符串的第2个到第4个索引位置进行截取
 * @Version: 1.0
 */
public class TestLambda02 {

	public static void main(String[] args) {
		System.out.println(strHandler("sjhfbdfhjfg",(x)->x.toUpperCase()));
		System.out.println(strHandler("sjhfbdfhjfg",(x)->x.substring(2,5)));
	}
	//对某个字段进行某种操作并返回结果
	/*public static String strHandler(String str, MyFunction mf) {
		return mf.getValue(str);
	}*/

	public static String strHandler(String str, Function<String,String> mf) {
		return mf.apply(str);
	}

}

