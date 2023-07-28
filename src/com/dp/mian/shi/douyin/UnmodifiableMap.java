package com.dp.mian.shi.douyin;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * @Author: DZF
 * @Date: 2022年3月17日 下午10:06:44
 * @Description: 集合不可被改变: 使用Collections.unmodifiableMap等
 * @Version: 1.0
 */
public class UnmodifiableMap {

	public static Map<String, String> map = new HashMap<>();

	static {
		map.put("1", "21");
		map.put("2", "2323");
		map = Collections.unmodifiableMap(map);

	}
	public static void main(String[] args) {
		map.put("3", "ooo");//java.lang.UnsupportedOperationException
	}

}
