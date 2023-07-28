package com.dp.java.learn.jdk8.stream;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import com.dp.java.learn.jdk8.lambda.entity.Employee;

/**
 * @Author: DZF
 * @Date: 2022年8月25日 下午7:31:15
 * @Version: 1.0
 * @Description:终止操作
 */
public class StreamDemo04 {

	static List<Employee> emps = Arrays.asList(
			new Employee(1001,"aa", 16),
			new Employee(1002,"bb", 13),
			new Employee(1003,"cc", 15),
			new Employee(1004,"dd", 32),
			new Employee(1005,"ee", 19)
	);

	public static void main(String[] args) {

		//allMatch 所有元素必须都匹配 结果为true
		boolean flag = emps.stream()
				.allMatch(e->e.getAge()>10);
		System.out.println("allMatch: " + flag);

		//anyMatch 任意一个元素能匹配 结果为true
		flag = emps.stream()
				.anyMatch(e->e.getName().equals("sd"));
		System.out.println("anyMatch: "+ flag);

		//noneMatch 没有元素能匹配 结果为true
		flag = emps.stream()
				.noneMatch(e->e.getName().equals("cc"));
		System.out.println("noneMatch: "+ flag);

		//findFirst
		Optional<Employee>  op = emps.stream()
				.sorted((e1,e2)->e2.getAge() - e1.getAge())// 降序  相减排序的原理？？
				.distinct()
				.findFirst();
		//System.out.println("findFirst: "+ op.get());
		System.out.println("findFirst: "+ op.orElse(new Employee()));//防止为空时报错  为空时给定默认值
	}

}
