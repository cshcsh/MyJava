package com.java5200.date0606;

public class GenericsTest {

	public static void main(String[] args) {
		Info i = new Info<String>("csh");
		i.setVar("��С��"); // �����ַ���
		fun(i); // �������ͱ���ƥ��ſ��Դ���
		
		Info i2 = new Info<Integer>(555555);
		i.setVar(5); // �����ַ���
		fun(i); // �������ͱ���ƥ��ſ��Դ���
		
	}


	// �˴����Խ���Object�������͵�Info����
	public static <T> void fun(Info<T> i) {
		System.out.println("���ݣ�" + i);
	}
}
