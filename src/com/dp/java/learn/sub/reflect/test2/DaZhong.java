package com.dp.java.learn.sub.reflect.test2;

public class DaZhong implements ICar {

	@Override
	public void run() {
		System.out.println("DaZhong的方法run()被调用");
	}

	@Override
	public void stop() {
		System.out.println("DaZhong的方法stop()被调用");
	}

}
