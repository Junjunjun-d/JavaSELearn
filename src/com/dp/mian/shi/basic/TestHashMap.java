package com.dp.mian.shi.basic;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author: DZF
 * @Date: 2022年5月9日 上午9:27:53
 * @Description: com.mian.shi.basic
 * @Version: 1.0
 */
public class TestHashMap {

	public static void main(String[] args) {
		Map<String, String> hm = new HashMap<>();
		
		hm.put("aa", "12");
		
		String res = hm.put("aa", "13");
		
		System.out.println(res);
		
	}

}
