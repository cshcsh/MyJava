package com.java5200.date0612;

import java.util.Enumeration;
import java.util.Vector;

public class EnumerationTest {

	public static void main(String[] args) {
		Vector<String> all = new Vector<String>();// ֻ��ʹ��Vector
		all.add("hello"); // ����Ԫ��
		all.add("_"); // ����Ԫ��
		all.add("world"); // ����Ԫ��
		Enumeration<String> enu = all.elements();// ʵ����Enumeration
		while (enu.hasMoreElements()) { // ѭ�����
			System.out.print(enu.nextElement() + "��");
		}
	}
}
