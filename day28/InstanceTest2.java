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

class Person2 implements MyComparable,MyComparable2{ // ����Person2��
	private String name; // ����name����
	private int age; // ����age����

	/*
	 * ����Class�����newInstance()���� Ҫ �� 1���������һ���޲����Ĺ������� 2����Ĺ������ķ���Ȩ����Ҫ�㹻��
	 */

	public Person2(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	public String getName() { // ȡ��name����
		return name;
	}

	public void setName(String name) { // ����name����
		this.name = name;
	}

	public int getAge() { // ȡ��age����
		return age;
	}

	public void setAge(int age) { // ����age����
		this.age = age;
	}

	public String toString() { // ��дtoString()����
		return "������" + this.name + ",���䣺" + this.age;
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
		try {// ����Class����
			c = Class.forName("com.java5200.date0615.Person2");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		Person2 per = null; // ����Person����
		Constructor<?> cons[] = null; // ����һ����ʾ���췽��������
		cons = c.getConstructors(); // ͨ������,ȡ��ȫ������
		try {
			// ���췽���д��ݲ���,�˷���ʹ�ÿɱ��������,��ʵ��������
			per = (Person2) cons[0].newInstance("���޼�", 30);
		} catch (Exception e) { // ��Ϊֻ��һ������,���������±�Ϊ0
			e.printStackTrace();
		}
		System.out.println(per); // �������
	}
}
