package com.java5200.date0612;

import java.util.ArrayList;
import java.util.List;

public class ForEachTest {

	public static void main(String[] args) {
		List<String> all = new ArrayList<String>();
		all.add("hello"); // ����Ԫ��
		all.add("_"); // ����Ԫ��
		all.add("world"); // ����Ԫ��
		for (String str : all) { // ���foreach���
			System.out.print(str + "��"); // �������
		}
	}
}
