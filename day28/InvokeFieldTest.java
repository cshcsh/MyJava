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
		Class<?> c1 = null; // ����Class����
		Object obj = null; // ����һ������
		c1 = Class.forName("com.java5200.date0615.Student4"); // ʵ����Class����
		obj = c1.newInstance(); // ʵ��������
		Field nameField = null; // ��ʾname����
		Field ageField = null; // ��ʾage����
		nameField = c1.getDeclaredField("name"); // ȡ��name����
		ageField = c1.getDeclaredField("age"); // ȡ��age����
		nameField.setAccessible(true);// ��name�������óɿɱ��ⲿ����
		nameField.set(obj, "���޼�"); // ����name��������
		ageField.setAccessible(true);// ��age�������óɿɱ��ⲿ����
		ageField.set(obj, 30); // ����age��������
		System.out.println("����:" + nameField.get(obj));// ͨ��getȡ����������
		System.out.println("����:" + ageField.get(obj));// ͨ��getȡ����������
	}
}
