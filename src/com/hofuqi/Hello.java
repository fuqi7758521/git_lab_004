package com.hofuqi;

public class Hello {
	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
		System.out.println("hello");
		Class<?> personClazz = Class.forName("com.hofuqi.Person");
		Person person = (Person) personClazz.newInstance();
		person.setName("fuqi");
		person.setAge(31);
		person.show();
	}
}
