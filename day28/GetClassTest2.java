package com.java5200.date0615;

class Ref2 {

}

public class GetClassTest2 {

	public static void main(String args[]) {
		Class<?> c1 = null; // ָ������
		Class<?> c2 = null; // ָ������
		Class<?> c3 = null; // ָ������
		try {
			c1 = Class.forName("com.java5200.date0615.Ref2");// ��õ���ʽ
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		c2 = new Ref2().getClass(); // ͨ��Object���еķ���ʵ��
		c3 = Ref2.class; // ͨ����.classʵ����
		System.out.println("�����ƣ�" + c1.getName()); // �õ��������
		System.out.println("�����ƣ�" + c2.getName()); // �õ��������
		System.out.println("�����ƣ�" + c3.getName()); // �õ��������
		System.out.println(c1==c2);
	}

}
