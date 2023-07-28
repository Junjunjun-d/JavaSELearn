package com.dp.mian.shi.listtoarray;

import java.util.*;

/**
 * @Author: DZF
 * @Date: 2022年3月25日 下午7:36:55
 * @Description: com.mian.shi.listtoarray
 * @Version: 1.0
 */
public class ListAndArray {

	/**
	 * 数组与list之间的转化
	 *
	 */
	public static void main(String[] args) {

		// list -> array
		// ListToArray();

		// array -> list
		// 方法1 Arrays.asList()
		// ArrayToList01();

		// 方法2 Collections.addAll()
		// ArrayToList02();

		// 方法3 集合的addAll()
		ArrayToList03();

	}

	//list -> array
	public static void ListToArray() {
		List<String> list = new ArrayList<String>();
		list.add("list01");
		list.add("list02");
		list.add("list03");

		Object[] arrs = list.toArray();
		for(Object o:  arrs) {
			String s = (String)o;
			System.out.println(s);
		}
	}

	//Arrays.asList()
	public static void ArrayToList01() {
		String[] arrs = {"list1","list2","list3"};
		List<String> al = Arrays.asList(arrs);
		//al.add("list4");//Arrays.asList() 返回的是一个固定大小的数组，不能被修改,可以使用new ArrayList(Arrays.asList(array)) 添加元素
		System.out.println(al);//基于数组的List视图（List view）
	}

	//Collections.addAll()
	public static void ArrayToList02() {
		String[] arrs = {"list1","list2","list3"};
		List<String> al = new ArrayList<String>();
		Collections.addAll(al, arrs);
		al.add("list4");//把数组中的元素复制到list, 可以添加，更改元素
		System.out.println(al);
	}

	// addAll()
	public static void ArrayToList03() {
		String[] arrs = {"list1","list2","list3"};
		List<String> al = new ArrayList<String>();
		al.addAll(Arrays.asList(arrs));
		al.add("list4");//把数组中的元素复制到list, 可以添加，更改元素
		System.out.println(al);
	}
}
