package com.dp.java.learn.jdk8.stream;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

import com.dp.java.learn.jdk8.lambda.entity.Employee;

/**
 * @Author: DZF
 * @Date: 2022年5月12日 上午10:00:32
 * @Version: 1.0
 * @Description: 中间操作： 收集collector
 */
public class StreamDemo05 {
	static List<Employee> emps = Arrays.asList(
			new Employee(1001,"aa", 16),
			new Employee(1002,"bb", 13),
			new Employee(1003,"cc", 15),
			new Employee(1004,"dd", 32),
			new Employee(1005,"ee", 19)
	);

	public static void main(String[] args) {
		//需求：获取当前公司所有员工的姓名添加到集合中
		//list - 把流中所有元素收集到List中
		List<String> list = emps.stream()
				.map(Employee::getName)
				.collect(Collectors.toList());
		System.out.println("list: " + list);

		//set - 把流中所有元素收集到Set中 删除重复项
		Set<String> set = emps.stream()
				.map(Employee::getName)
				.collect(Collectors.toSet());
		System.out.println("set: " + set);

		//map - 把流中的所有元素收集到map中，当出现相同的key是会抛异常
		Map<String,Integer> map  =  emps.stream()
				.collect(Collectors.toMap(Employee::getName, Employee::getAge));
		System.out.println("map: " + map);

		//员工总数
		long count = emps.stream()
				.collect(Collectors.counting());
		System.out.println("员工总数counting: " + count);

		//平均年龄
		double avg = emps.stream()
				.collect(Collectors.averagingDouble(Employee::getAge));
		System.out.println("平均年龄: " + avg);

		//年龄总数
		int sum = emps.stream()
				.collect(Collectors.summingInt(Employee::getAge));
		System.out.println("年龄总数 : " + sum);

		//年龄最大的员工
		Optional<Employee> max = emps.stream()
				.collect(Collectors.maxBy((e1,e2)->Double.compare(e1.getAge(), e2.getAge())));
		System.out.println("年龄最大的员工 : " + max.get());


	}


}
