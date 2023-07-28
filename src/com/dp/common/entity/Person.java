package com.dp.common.entity;

public class Person {
	private int id;
	private int age;
	private String name;
	private String gender;

	public Person() {
		super();
	}

	public Person(String name) {
		this.name = name;
	}

	public Person(int age, String name) {
		super();
		this.age = age;
		this.name = name;
	}


	/* （非 Javadoc）
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Person [id=" + id + ", age=" + age + ", name=" + name + ", gender=" + gender + "]";
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
	 * @return gender
	 */
	public String getGender() {
		return gender;
	}

	/**
	 * @param gender 要设置的 gender
	 */
	public void setGender(String gender) {
		this.gender = gender;
	}

	/* （非 Javadoc）
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + age;
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
		Person other = (Person) obj;
		if (age != other.age)
			return false;
		if (name == null) {
			return other.name == null;
		} else return name.equals(other.name);
	}

}
