package com.dp.mian.shi.mx.q5;

/**
 * @Author: DZF
 * @Date: 2022年3月14日 下午11:54:57
 * @Description: com.mian.shi.mx.q5
 * @Version: 1.0
 */
public class OverWriteDemo extends OverWriteBase{

	public static void main(String[] args){
		OverWriteDemo demo = new OverWriteDemo();
		demo.amethod();
	}

	public void amethod() {
		System.out.println("hello amethod");
	}
}
