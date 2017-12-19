package com.java5200.date0612;

import java.util.Enumeration;
import java.util.Vector;

public class EnumerationTest {

	public static void main(String[] args) {
		Vector<String> all = new Vector<String>();// 只能使用Vector
		all.add("hello"); // 增加元素
		all.add("_"); // 增加元素
		all.add("world"); // 增加元素
		Enumeration<String> enu = all.elements();// 实例化Enumeration
		while (enu.hasMoreElements()) { // 循环输出
			System.out.print(enu.nextElement() + "、");
		}
	}
}
