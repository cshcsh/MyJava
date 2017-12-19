package com.java5200.date0612;

import java.util.SortedSet;
import java.util.TreeSet;

public class TreeSetTest4 {

	public static void main(String[] args) {
		SortedSet<String> allSet = new TreeSet<String>();
		allSet.add("A"); // 增加元素
		allSet.add("B"); // 增加元素
		allSet.add("C"); // 增加元素
		allSet.add("C"); // 重复元素,不能加入
		allSet.add("C"); // 重复元素,不能加入
		allSet.add("D"); // 增加元素
		allSet.add("E"); // 增加元素
		System.out.println("第一个元素：" + allSet.first());
		System.out.println("最后一个元素：" + allSet.last());
		System.out.println("headSet元素：" + allSet.headSet("C"));
		System.out.println("tailSet元素：" + allSet.tailSet("C"));
		System.out.println("subSet元素：" + allSet.subSet("B", "D"));
	}
}
