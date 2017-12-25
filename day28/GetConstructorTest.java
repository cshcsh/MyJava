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
		Class<?> c1 = null; // 声明Class对象
		try {
			c1 = Class.forName("com.java5200.date0615.GetConstructorTest");// 实例化Class对象
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		Constructor<?> con[] = c1.getDeclaredConstructors();//getConstructors(); 不能得到private权限构造方法,只能得到public权限的构造方法
		for (int i = 0; i < con.length; i++) { // 循环输出
			System.out.println("构造方法：" + con[i].getParameterCount());// 直接打印输出
		}
	}
}
