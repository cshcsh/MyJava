package com.java5200.date0615;

import java.lang.reflect.Array;

public class ClassArrayTest2 {

	public static void main(String[] args) throws Exception {
		int temp[] = { 1, 2, 3 }; // ����һ����������
		int newTemp[] = (int[]) arrayInc(temp, 5); // �������鳤��
		print(newTemp); // ��ӡ������Ϣ
		System.out.println("\n-------------------------------");
		String t[] = { "Hello", "word", "java" }; // ����һ���ַ�������
		String nt[] = (String[]) arrayInc(t, 8); // �������鳤��
		print(nt); // ��ӡ������Ϣ
	}

	public static Object arrayInc(Object obj, int len) { // �޸������С
		Class<?> c = obj.getClass(); // ͨ������õ�Class����
		Class<?> arr = c.getComponentType(); // �õ������Class����
		Object newO = Array.newInstance(arr, len); // ���¿����µ������С
		int co = Array.getLength(obj); // ȡ�����鳤��
		System.arraycopy(obj, 0, newO, 0, co); // ������������
		return newO;
	}

	public static void print(Object obj) { // �������
		Class<?> c = obj.getClass(); // ͨ������õ�Class����
		if (!c.isArray()) { // �ж��Ƿ�������
			return; // �����򷵻�
		}
		Class<?> arr = c.getComponentType(); // ȡ�������Class
		System.out.println(arr.getName() + "����ĳ�����:" + Array.getLength(obj)); // ���������Ϣ
		for (int i = 0; i < Array.getLength(obj); i++) { // ѭ�����
			System.out.print(Array.get(obj, i) + "��");// ͨ��Array���
		}
	}
}
