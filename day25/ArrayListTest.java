package com.java5200.date0612;

import java.util.ArrayList;
import java.util.List;

public class ArrayListTest {
	
	public static void main(String[] args) {
		List<String> allList = null; // ����List����
		allList = new ArrayList<String>(); // ʵ����List����,ֻ����String����
		allList.add("Hello"); // ����Ԫ��
		allList.add(0, "World"); // ����Ԫ��
		allList.add("���޼�"); // ����Ԫ��
		allList.add("www.cx.com"); // ����Ԫ��
		String str[] = (String[]) allList.toArray(new String[] {});// ָ���ķ�������
		System.out.print("ָ���������ͣ�"); // ��Ϣ���
		for (int i = 0; i < str.length; i++) {// ����ַ��������е�����
			System.out.print(str[i] + "��"); // ���ÿһ��Ԫ��
		}
		System.out.print("\n���ض������飺"); // ��Ϣ���
		Object obj[] = allList.toArray(); // ֱ�ӷ��ض�������
		for (int i = 0; i < obj.length; i++) { // ѭ�����������������
			String temp = (String) obj[i]; // ÿһ��������String����ʵ��
			System.out.print(temp + "��"); // ���ÿһ��Ԫ��
		}
	}

}
