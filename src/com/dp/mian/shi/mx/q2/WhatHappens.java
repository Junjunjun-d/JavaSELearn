package com.dp.mian.shi.mx.q2;

/**
 * @Author: DZF
 * @Date: 2022年3月14日 下午11:16:10
 * @Description: com.mian.shi.mx
 * @Version: 1.0
 */
class WhatHappens implements Runnable{

	public static void main(String[] args) {
		//Thread t1 = new Thread(this);//不能在静态上下文中使用 this
		Thread t1 = new Thread();
		t1.start();
	}

	@Override
	public void run() {
		System.out.println("hi");

	}
}
