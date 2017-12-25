package com.java5200.date0615;

import java.lang.reflect.Field;

class Student {
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

}

public class Test01 {

	public static void main(String[] args) throws NoSuchFieldException, SecurityException, IllegalArgumentException,
			IllegalAccessException, InstantiationException {
		Class<?> c = null;
		try {
			c = Class.forName("com.java5200.date0615.Student");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		Object obj = c.newInstance();
		Field nameField = c.getDeclaredField("name");
		nameField.setAccessible(true);
		nameField.set(obj, "csh");
		Field ageField = c.getDeclaredField("age");
		ageField.setAccessible(true);
		ageField.set(obj, 18);
		System.out.println("–’√˚£∫" + nameField.get(obj));
		System.out.println("ƒÍ¡‰£∫" + ageField.get(obj));

	}

}
