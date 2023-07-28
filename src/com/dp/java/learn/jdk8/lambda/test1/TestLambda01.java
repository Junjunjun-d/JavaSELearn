package com.dp.java.learn.jdk8.lambda.test1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.dp.java.learn.jdk8.lambda.entity.Employee;

/**
 * @Author: DZF
 * @Date: 2022年5月7日 下午8:37:15
 * @Description: 调用Collections.sort()方法，通过定值排序比较两个Employee
 * 				 先按年龄比较，年龄相同比较姓名
 *               使用lambda作为参数传递
 * @Version: 1.0
 */
public class TestLambda01 {

	public static void main(String[] args) {
		Employee ep01 = new Employee(1001,"aa", 16);
		Employee ep02 = new Employee(1002,"bb", 13);
		Employee ep03 = new Employee(1003,"cc", 15);
		Employee ep04 = new Employee(1004,"dd", 19);

		List<Employee> list = new ArrayList<Employee>();
		list.add(ep01);
		list.add(ep02);
		list.add(ep03);
		list.add(ep04);


		System.out.println("排序前：");
		for(Employee ep:list) {
			System.out.println(ep.toString());
		}

		//排序 匿名内部类
		/*Comparator<Employee> com = (o1,o2)->{
			if(o1.getAge() == o2.getAge()) {
				return o1.getName().compareTo(o2.getName());
			}
			return Integer.compare(o1.getAge(), o2.getAge());
		};
		Collections.sort(list,com);*/

		//简化
		Collections.sort(list,(o1,o2)->{
			if(o1.getAge() == o2.getAge()) {
				return o1.getName().compareTo(o2.getName());
			}
			return Integer.compare(o1.getAge(), o2.getAge());
		});

		System.out.println("排序后：");
		for(Employee ep:list) {
			System.out.println(ep.toString());
		}
	}

}
