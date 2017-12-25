package com.java5200.date0615;

class Person { // ����Person��
	private String name; // ����name����
	private int age; // ����age����

	/*����Class�����newInstance()����
	Ҫ ��
	1���������һ���޲����Ĺ�������
	2����Ĺ������ķ���Ȩ����Ҫ�㹻��*/
	
	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	public Person() {
		super();
		// TODO Auto-generated constructor stub
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
}

public class InstanceTest {

	public static void main(String[] args) {
		Class<?> c = null; // ָ������
		try { // ����Ҫʵ�������������.������
			c = Class.forName("com.java5200.date0615.Person");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		Person per = null; // ����Person����
		try {
			per = (Person) c.newInstance(); // ʵ����Person����
		} catch (Exception e) {
			e.printStackTrace();
		}
		per.setName("���޼�"); // ��������
		per.setAge(30); // ��������
		System.out.println(per); // �������,����toString()
	}
}
