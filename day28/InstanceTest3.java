package com.java5200.date0615;


interface MyComparable1{
	public void fun();
}
interface MyComparable22{
	public void fun2();
}
interface MyComparable33 extends MyComparable1{
	public void fun3();
}

class Person3 implements MyComparable33,MyComparable22{ // ����Person3��
	private String name; // ����name����
	private int age; // ����age����

	/*
	 * ����Class�����newInstance()���� Ҫ �� 1���������һ���޲����Ĺ������� 2����Ĺ������ķ���Ȩ����Ҫ�㹻��
	 */

	public Person3(String name, int age) {
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
	public void fun2() {
		System.out.println("fun");
		
	}

	@Override
	public void fun3() {
		System.out.println("fun3");
		
	}

	@Override
	public void fun() {
		System.out.println("fun");
		
	}
	
}

public class InstanceTest3 {

	//���Ǹ��ӿ�
	public static void main(String[] args) {
		Class<?> c = null;
		try {// ����Class����
			c = Class.forName("com.java5200.date0615.Person3");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		Class<?>[] cons=c.getInterfaces(); // ͨ������,ȡ��ȫ������
		try {
			// ���췽���д��ݲ���,�˷���ʹ�ÿɱ��������,��ʵ��������
			for(int i=0;i<cons.length;i++){
				System.out.println(cons[i].getName()); // �������
			}
			
		} catch (Exception e) { // ��Ϊֻ��һ������,���������±�Ϊ0
			e.printStackTrace();
		}
	}
}
