package com.java5200.date0615;

import java.lang.reflect.Constructor;

interface MyComparable{
	public void fun();
}
interface MyComparable2{
	public void fun2();
}
interface MyComparable3 extends MyComparable{
	public void fun3();
}

class Person2 implements MyComparable,MyComparable2{ // 定义Person2类
	private String name; // 定义name属性
	private int age; // 定义age属性

	/*
	 * 调用Class对象的newInstance()方法 要 求： 1）类必须有一个无参数的构造器。 2）类的构造器的访问权限需要足够。
	 */

	public Person2(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	public String getName() { // 取得name属性
		return name;
	}

	public void setName(String name) { // 设置name属性
		this.name = name;
	}

	public int getAge() { // 取得age属性
		return age;
	}

	public void setAge(int age) { // 设置age属性
		this.age = age;
	}

	public String toString() { // 覆写toString()方法
		return "姓名：" + this.name + ",年龄：" + this.age;
	}

	@Override
	public void fun() {
		System.out.println("fun");
	}

	@Override
	public void fun2() {
		System.out.println("fun");
		
	}
}

public class InstanceTest2 {

	public static void main(String[] args) {
		Class<?> c = null;
		try {// 声明Class对象
			c = Class.forName("com.java5200.date0615.Person2");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		Person2 per = null; // 声明Person对象
		Constructor<?> cons[] = null; // 声明一个表示构造方法的数组
		cons = c.getConstructors(); // 通过反射,取得全部构造
		try {
			// 向构造方法中传递参数,此方法使用可变参数接收,并实例化对象
			per = (Person2) cons[0].newInstance("张无忌", 30);
		} catch (Exception e) { // 因为只有一个构造,所以数组下标为0
			e.printStackTrace();
		}
		System.out.println(per); // 输出对象
	}
}
