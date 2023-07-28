package com.dp.java.learn.sub.extend;

public class Child extends Parent {
	public static void prit() {
		System.out.println("C");
	}

	public void B() {
		System.out.println("B");
	}

	public static void main(String[] args) {

		// 继承关系
		Parent parent = new Parent();
		Child.prit();
		parent.A();
		Parent.prit();

	}
}
