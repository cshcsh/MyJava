package com.java5200.date0612;

import java.util.Set;
import java.util.TreeSet;

public class TreeSetTest {

	public static void main(String[] args) {
		Set<String> allSet = new TreeSet<String>();
		allSet.add("C"); // ����Ԫ��
		allSet.add("C"); // �ظ�Ԫ��,���ܼ���
		allSet.add("C"); // �ظ�Ԫ��,���ܼ���
		allSet.add("D"); // ����Ԫ��
		allSet.add("B"); // ����Ԫ��
		allSet.add("A"); // ����Ԫ��
		allSet.add("E"); // ����Ԫ��
		System.out.println(allSet); // �������,����toString()
	}
}
