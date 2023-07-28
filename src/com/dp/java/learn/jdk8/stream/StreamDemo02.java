package com.dp.java.learn.jdk8.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

import com.dp.java.learn.jdk8.lambda.entity.Employee;

/**
 * @Author: DZF
 * @Date: 2022年5月10日 下午9:34:17
 * @Version: 1.0
 * @Description:
 * 		中间操作(常见)
(1) filter 接收lambda，从流中排除某些元素
(2) limit 截断流，使其元素不超过给定的数量
(3) skip 跳过元素，返回一个去掉前n个元素的流，若流中元素不足n个，则返回一个空流
(4) distinct 筛选,需要流所产生元素重写hashCode和equals()方法
(5) Sorted 排序，返回的是排序好后的Stream。如果你不指定一个自定义的Comparator则会使用默认排序。
 */
public class StreamDemo02 {

	static List<Employee> list = Arrays.asList(
			new Employee(1001,"aa", 16),
			new Employee(1002,"bb", 13),
			new Employee(1003,"cc", 15),
			new Employee(1004,"dd", 32),
			new Employee(1005,"ee", 19),
			new Employee(1005,"ee", 19)
	);
	public static void main(String[] args) {
		test();

	}

	public static void test() {
		//获取stream
		Stream<Employee> stream = list.stream();

		//中间操作
		Stream<Employee> stream1 = stream
				.filter(e->e.getAge() >= 15)//筛选
				.limit(5)//限制行数
				.distinct()//去重
				.sorted((e1,e2)->{//定制排序
					if(e1.getAge() == e2.getAge()) {
						return e1.getName().compareTo(e2.getName());
					}
					return Integer.compare(e1.getAge(), e2.getAge());
				});



		//终止操作
		stream1.forEach(System.out::println);

	}

}
