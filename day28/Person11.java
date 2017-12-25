package com.java5200.date0615;
interface China{
	public static final String NATIONAL="China";
	public static final String AUTHOR="张无忌";
	public void sayChina();
	public String sayHello(String name,int age);
}
public class Person11 implements China{
	private String name;
	private int age;
	
	public Person11() {
		super();
	}
	
	public Person11(String name, int age) {
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
	public String toString() {
		return "姓名："+this.name+"，年龄："+this.age;
	}

	@Override
	public void sayChina() {
		System.out.println("作者："+AUTHOR+"，国籍："+NATIONAL);
	}

	@Override
	public String sayHello(String name, int age) {
		return name+"，你好！我今年"+age+"岁了！";
	}
	public void fun(int...a) {
		for(int b:a) {
			System.out.print(b+"\t");
		}
		System.out.println();
	}
}
