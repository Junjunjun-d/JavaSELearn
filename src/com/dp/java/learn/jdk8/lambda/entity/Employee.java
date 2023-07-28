package com.dp.java.learn.jdk8.lambda.entity;

/**
 * @Author: DZF
 * @Date: 2022年5月7日 下午8:31:47
 * @Description: lambda练习
 * @Version: 1.0
 */
public class Employee {
	private int id;
	private String name;
	private int age;
	/**
	 * 无参的构造函数
	 */
	public Employee() {

	}
	/**
	 * @param id
	 * @param name
	 * @param age
	 */
	public Employee(int id, String name, int age) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
	}
	/**
	 * @return id
	 */
	public int getId() {
		return id;
	}
	/**
	 * @param id 要设置的 id
	 */
	public void setId(int id) {
		this.id = id;
	}
	/**
	 * @return name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name 要设置的 name
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return age
	 */
	public int getAge() {
		return age;
	}
	/**
	 * @param age 要设置的 age
	 */
	public void setAge(int age) {
		this.age = age;
	}

	/* （非 Javadoc）
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", age=" + age + "]";
	}
	/* （非 Javadoc）
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + age;
		result = prime * result + id;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}
	/* （非 Javadoc）
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		if (age != other.age)
			return false;
		if (id != other.id)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
}
