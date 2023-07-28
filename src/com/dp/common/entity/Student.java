package com.dp.common.entity;

public class Student extends Person {

	private String subject;

	/**
	 *
	 */
	public Student() {
		super();
		// TODO 自动生成的构造函数存根
	}

	/**
	 * @param age
	 * @param name
	 */
	public Student(int age, String name) {
		super(age, name);
		// TODO 自动生成的构造函数存根
	}

	/**
	 * @param name
	 */
	public Student(String name) {
		super(name);
		// TODO 自动生成的构造函数存根
	}

	/**
	 * @return subject
	 */
	public String getSubject() {
		return subject;
	}

	/**
	 * @param subject 要设置的 subject
	 */
	public void setSubject(String subject) {
		this.subject = subject;
	}


}
