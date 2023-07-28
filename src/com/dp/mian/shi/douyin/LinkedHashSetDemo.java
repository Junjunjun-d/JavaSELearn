package com.dp.mian.shi.douyin;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

/**
 * @Author: DZF
 * @Date: 2022年3月21日 下午8:22:59
 * @Description: TreeSet 有序不可重复，LinkedHashSet无序不可重复
 * @Version: 1.0
 */
public class LinkedHashSetDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//Set<String> set = new LinkedHashSet<String>();//输出dd aa bb cc 无序不重复
		Set<String> set = new TreeSet<String>();//输出aa bb cc dd  有序不重复
		set.add("dd");
		set.add("aa");
		set.add("bb");
		set.add("cc");
		set.add("aa");

		Iterator<String> it = set.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}

}
