package com.dp.java.learn.jdk8.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

import com.dp.java.learn.jdk8.lambda.entity.Employee;

/**
 * @Author: DZF
 * @Date: 2022年5月10日 下午2:51:19
 * @Version: 1.0
 * @Description:
 * 	Stream
 * 		集合|数组  数据源 侧重于数据的存储
 * 		Stream对数据进行操作
 *  特点：
 *  	1) stream不能存储数据
2) stream操作不影响数据源，得到的是一个新的stream
3) stream流是一次性的流，已经使用过后的流不能再次使用，每次使用会返回一个新的stream
4) 惰性加载|延迟执行

步骤：
1. 获取流
2. 一连串流的中间操作
3. 终止行为
 *
 */
public class StreamDemo01 {

	static List<Employee> list = Arrays.asList(
			new Employee(1001,"aa", 16),
			new Employee(1002,"bb", 13),
			new Employee(1003,"cc", 15),
			new Employee(1004,"dd", 19),
			new Employee(1005,"cc", 23)
	);

	/*
	 * Stream 的创建
	 */
	public static void main(String[] args) {
		//1. Collection的Stream
		Stream<Employee> stream1 = list.stream();
		stream1.forEach(s->System.out.println(s));

		//2. Arrays.stream()
		Stream<Integer> stream2 = Arrays.stream(new Integer[]{12,3,5,19,31});
		stream2.forEach(s->System.out.println(s));

		//3. Stream.of()		
		Stream<Character> stream3 = Stream.of('a','b','c');
		stream3.forEach(s->System.out.println(s));

	}

}
