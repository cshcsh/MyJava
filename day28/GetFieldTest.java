package com.java5200.date0615;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

class Student2 {
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

	public Student2(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	@Override
	public String toString() {
		return "Student2 [name=" + name + ", age=" + age + "]";
	}

}

public class GetFieldTest {

	public static void main(String[] args) {
		Class<?> c1 = null; // ����Class����
		try {
			c1 = Class.forName("com.java5200.date0615.Student2"); // ʵ����Class����
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		{ // ��ͨ�����
			Field f[] = c1.getDeclaredFields(); // ȡ�ñ�������
			for (int i = 0; i < f.length; i++) { // ѭ�����
				Class<?> r = f[i].getType(); // ȡ�����Ե�����
				int mo = f[i].getModifiers();// �õ����η�����
				String priv = Modifier.toString(mo);// ȡ�����Ե����η�
				System.out.print("�������ԣ�");
				System.out.print(priv + " "); // ������η�
				System.out.print(r.getName() + " ");// �����������
				System.out.print(f[i].getName()); // �����������
				System.out.println(" ;"); // ����
			}
		}
	}
}
