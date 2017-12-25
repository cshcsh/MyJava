package com.java5200.date0615;

import java.lang.reflect.Constructor;

public class GetConstructorTest {

	private String name;
	private int age;
	
	public GetConstructorTest() {
		super();
	}

	public GetConstructorTest(String name) {
		super();
		this.name = name;
	}

	private GetConstructorTest(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

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

	@Override
	public String toString() {
		return "GetConstructorTest [name=" + name + ", age=" + age + "]";
	}

	public static void main(String[] args) {
		Class<?> c1 = null; // ����Class����
		try {
			c1 = Class.forName("com.java5200.date0615.GetConstructorTest");// ʵ����Class����
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		Constructor<?> con[] = c1.getDeclaredConstructors();//getConstructors(); ���ܵõ�privateȨ�޹��췽��,ֻ�ܵõ�publicȨ�޵Ĺ��췽��
		for (int i = 0; i < con.length; i++) { // ѭ�����
			System.out.println("���췽����" + con[i].getParameterCount());// ֱ�Ӵ�ӡ���
		}
	}
}
