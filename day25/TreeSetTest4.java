package com.java5200.date0612;

import java.util.SortedSet;
import java.util.TreeSet;

public class TreeSetTest4 {

	public static void main(String[] args) {
		SortedSet<String> allSet = new TreeSet<String>();
		allSet.add("A"); // ����Ԫ��
		allSet.add("B"); // ����Ԫ��
		allSet.add("C"); // ����Ԫ��
		allSet.add("C"); // �ظ�Ԫ��,���ܼ���
		allSet.add("C"); // �ظ�Ԫ��,���ܼ���
		allSet.add("D"); // ����Ԫ��
		allSet.add("E"); // ����Ԫ��
		System.out.println("��һ��Ԫ�أ�" + allSet.first());
		System.out.println("���һ��Ԫ�أ�" + allSet.last());
		System.out.println("headSetԪ�أ�" + allSet.headSet("C"));
		System.out.println("tailSetԪ�أ�" + allSet.tailSet("C"));
		System.out.println("subSetԪ�أ�" + allSet.subSet("B", "D"));
	}
}
