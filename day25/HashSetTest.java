package com.java5200.date0612;

import java.util.HashSet;
import java.util.Set;

public class HashSetTest {

	public static void main(String[] args) {
		Set<String> allSet = new HashSet<String>();
		allSet.add("B"); // 增加元素
		allSet.add("C"); // 增加元素
		allSet.add("C"); // 重复元素,不能加入
		allSet.add("C"); // 重复元素,不能加入
		allSet.add("D"); // 增加元素
		allSet.add("E"); // 增加元素
		allSet.add("A"); // 增加元素
		System.out.println(allSet); // 输出集合对象,调用toString()
	}
}
