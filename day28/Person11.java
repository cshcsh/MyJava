package com.java5200.date0615;
interface China{
	public static final String NATIONAL="China";
	public static final String AUTHOR="���޼�";
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
		return "������"+this.name+"�����䣺"+this.age;
	}

	@Override
	public void sayChina() {
		System.out.println("���ߣ�"+AUTHOR+"��������"+NATIONAL);
	}

	@Override
	public String sayHello(String name, int age) {
		return name+"����ã��ҽ���"+age+"���ˣ�";
	}
	public void fun(int...a) {
		for(int b:a) {
			System.out.print(b+"\t");
		}
		System.out.println();
	}
}
