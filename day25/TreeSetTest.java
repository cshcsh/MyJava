package com.java5200.date0612;

import java.util.Set;
import java.util.TreeSet;

public class TreeSetTest {

	public static void main(String[] args) {
		Set<String> allSet = new TreeSet<String>();
		allSet.add("C"); // 加入元素
		allSet.add("C"); // 重复元素,不能加入
		allSet.add("C"); // 重复元素,不能加入
		allSet.add("D"); // 加入元素
		allSet.add("B"); // 加入元素
		allSet.add("A"); // 加入元素
		allSet.add("E"); // 加入元素
		System.out.println(allSet); // 输出集合,调用toString()
	}
}
