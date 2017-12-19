package com.java5200.date0612;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ListIteratorTest {

	public static void main(String[] args) {
		List<String> all = new ArrayList<String>(); // ʵ����List�ӿ�
		all.add("hello"); // ����Ԫ��
		all.add("_"); // ����Ԫ��
		all.add("world"); // ����Ԫ��
		ListIterator<String> iter = all.listIterator();// ʵ����ListIterator�ӿ�
		System.out.print("��ǰ��������"); // ��Ϣ���
		while (iter.hasNext()) { // ��ǰ������
			String str = iter.next(); // ȡ������
			System.out.print(str + "��"); // �������
			iter.set("LI-" + str); // �滻Ԫ��
		}
		System.out.print("\n�ɺ���ǰ�����"); // ��Ϣ���
		iter.add("Hello"); // ����Ԫ��
		while (iter.hasPrevious()) { // ��ǰ������
			String str = iter.previous(); // ȡ������
			System.out.print(str + "��"); // �������
		}
	}
}