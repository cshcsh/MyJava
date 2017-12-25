package com.java5200.date0615;

import java.lang.reflect.Field;

class Student4{
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

	public Student4() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Student4(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	@Override
	public String toString() {
		return "Student4 [name=" + name + ", age=" + age + "]";
	}

}

public class InvokeFieldTest {

	public static void main(String[] args) throws Exception {
		Class<?> c1 = null; // 声明Class对象
		Object obj = null; // 声明一个对象
		c1 = Class.forName("com.java5200.date0615.Student4"); // 实例化Class对象
		obj = c1.newInstance(); // 实例化对象
		Field nameField = null; // 表示name属性
		Field ageField = null; // 表示age属性
		nameField = c1.getDeclaredField("name"); // 取得name属性
		ageField = c1.getDeclaredField("age"); // 取得age属性
		nameField.setAccessible(true);// 将name属性设置成可被外部访问
		nameField.set(obj, "张无忌"); // 设置name属性内容
		ageField.setAccessible(true);// 将age属性设置成可被外部访问
		ageField.set(obj, 30); // 设置age属性内容
		System.out.println("姓名:" + nameField.get(obj));// 通过get取得属性内容
		System.out.println("年龄:" + ageField.get(obj));// 通过get取得属性内容
	}
}
