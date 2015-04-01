package com.hofuqi;

public class Person {
	private String name;
	private int age;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public Person() {
	}

	public void show() {
		System.out.println("name: " + this.name + " age:" + this.age);
		// System.out.println("age: " + this.age);
	}

}
