package com.java5200.date0615;

import java.lang.reflect.Constructor;
import java.lang.reflect.Modifier;

public class GetConstructorTest2 {

	private String name;
	private int age;

	public GetConstructorTest2() {
		super();
	}

	public GetConstructorTest2(String name) {
		super();
		this.name = name;
	}

	public GetConstructorTest2(String name, int age) {
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
		try {// ʵ����Class����
			c1 = Class.forName("com.java5200.date0615.GetConstructorTest2");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		Constructor<?> con[] = c1.getConstructors(); // �õ�ȫ������
		for (int i = 0; i < con.length; i++) { // ѭ�����
			Class<?> p[] = con[i].getParameterTypes(); // �г������еĲ�������
			System.out.print("���췽����");
			System.out.print(Modifier.toString(con[i].getModifiers()) + " "); // ȡ��Ȩ��
			System.out.print(con[i].getName()); // ������췽������
			System.out.print("("); // �����(��
			for (int j = 0; j < p.length; j++) {// ��ӡ��������
				System.out.print(p[j].getName() + " arg" + i);
				if (j < p.length - 1) { // �ж��Ƿ�Ҫ�����,��
					System.out.print(","); // �����,��
				}
			}
			System.out.println("){}"); // �����){}��
		}
	}
}
