package com.dp.java.learn.jdk8.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

import com.dp.java.learn.jdk8.lambda.entity.Employee;

/**
 * @Author: DZF
 * @Date: 2022年5月10日 下午10:18:07
 * @Version: 1.0
 * @Description: 中间操作
 * 			map() 流中的每一个数据当做map方法的参数(接口)，接口中抽象方法的参数进行定制操作，
最终得到一个结果，最后所有的结果返回成为一个流，相当于遍历操作每一个数据，
得到的多个结果组成一个新的流返回
 *          flatMap() 流中的每一个数据当做参数进行操作，得到的结果必须是一个流，最终会组成一个流返回
 */
public class StreamDemo03 {

	static List<Employee> list = Arrays.asList(
			new Employee(1001,"aa", 16),
			new Employee(1002,"bb", 13),
			new Employee(1003,"cc", 15),
			new Employee(1004,"dd", 32),
			new Employee(1005,"ee", 19),
			new Employee(1005,"ee", 19)
	);

	public static void main(String[] args) {
		System.out.println("-----testMap-----");
		testMap();

		System.out.println("-----map-----");
		Stream<String> stream = Stream.of("aaa","vvv","ccc");
		//map
		stream
				.map(StreamDemo03::testCharacter)//{{a,a,a},{v,v,v},{c,c,c}}
				.forEach(stream2->stream2.forEach(System.out::println));

		System.out.println("-----flatMap-----");
		Stream<String> stream3 = Stream.of("aaa","vvv","ccc");
		//flatMap
		stream3
				.flatMap(StreamDemo03::testCharacter)// {a,a,a,v,v,v,c,c,c}
				.forEach(System.out::println);
	}

	//map测试
	public static void testMap() {
		list.stream()
				.map(e->e.getName())
				.forEach(System.out::println);

	}


	public static Stream<Character> testCharacter(String str){
		List<Character> list = new ArrayList<>();
		for (Character character : str.toCharArray()) {
			list.add(character);
		}
		return list.stream();
	}

}
