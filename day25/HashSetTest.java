package com.java5200.date0612;

import java.util.HashSet;
import java.util.Set;

public class HashSetTest {

	public static void main(String[] args) {
		Set<String> allSet = new HashSet<String>();
		allSet.add("B"); // ����Ԫ��
		allSet.add("C"); // ����Ԫ��
		allSet.add("C"); // �ظ�Ԫ��,���ܼ���
		allSet.add("C"); // �ظ�Ԫ��,���ܼ���
		allSet.add("D"); // ����Ԫ��
		allSet.add("E"); // ����Ԫ��
		allSet.add("A"); // ����Ԫ��
		System.out.println(allSet); // ������϶���,����toString()
	}
}
