package com.java5200.date0612;

import java.util.ArrayList;
import java.util.List;

public class ArrayListTest2 {

	public static void main(String[] args) {
		List<String> allList = null; // ����List����
		allList = new ArrayList<String>(); // ʵ����List����,ֻ����String����
		System.out.println("���ϲ���ǰ�Ƿ�Ϊ�գ�" + allList.isEmpty());
		allList.add("Hello"); // ����Ԫ��
		allList.add(0, "World"); // ����Ԫ��
		allList.add("zhangwuji"); // ����Ԫ��
		allList.add("www.chuanxi.com"); // ����Ԫ��
		System.out.println(allList.contains("Hello") ? "\"Hello\"�ַ������ڣ�" : "\"Hello\"�ַ��������ڣ�");
		List<String> allSub = allList.subList(3, 4);// ȡ������Ĳ��ּ���
		System.out.print("���Ͻ�ȡ��");
		for (int i = 0; i < allSub.size(); i++) { // ��ȡ���ּ���
			System.out.print(allSub.get(i) + "��");
		}
		System.out.println("");
		System.out.println("World�ַ�����λ�ã�" + allList.indexOf("World"));
		System.out.println("���ϲ������Ƿ�Ϊ�գ�" + allList.isEmpty());
	}
}
