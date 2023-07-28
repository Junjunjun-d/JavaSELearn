package com.dp.java.learn.sub.thread.extend;

public class Thread2 extends Thread {

	public Thread2(String name) {
		super(name);
		this.start();
	}

	public void run() {
		for (int i = 100000; i > 0; i--) {
			System.out.println(this.getName() + "线程222222222" + i);
		}
	}
}
