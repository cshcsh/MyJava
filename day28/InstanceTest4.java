package com.java5200.date0615;

class Father {
	public String dec;
}

class Person4 extends Father { // ����Person4��
	private String name; // ����name����
	private int age; // ����age����

	/*
	 * ����Class�����newInstance()���� Ҫ �� 1���������һ���޲����Ĺ������� 2����Ĺ������ķ���Ȩ����Ҫ�㹻��
	 */

	public Person4(String name, int age) {
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

}

public class InstanceTest4 {

	// ���Ǹ��ӿ�
	public static void main(String[] args) {
		Class<?> c = null;
		try {// ����Class����
			c = Class.forName("com.java5200.date0615.Person4");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		Class<?> cons = c.getSuperclass(); // ͨ������,ȡ��ȫ������
		try {
			// ���췽���д��ݲ���,�˷���ʹ�ÿɱ��������,��ʵ��������
			System.out.println(cons); // �������

		} catch (Exception e) { // ��Ϊֻ��һ������,���������±�Ϊ0
			e.printStackTrace();
		}
	}
}
