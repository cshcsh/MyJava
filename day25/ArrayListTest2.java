package com.java5200.date0612;

import java.util.ArrayList;
import java.util.List;

public class ArrayListTest2 {

	public static void main(String[] args) {
		List<String> allList = null; // 声明List对象
		allList = new ArrayList<String>(); // 实例化List对象,只能是String类型
		System.out.println("集合操作前是否为空？" + allList.isEmpty());
		allList.add("Hello"); // 增加元素
		allList.add(0, "World"); // 增加元素
		allList.add("zhangwuji"); // 增加元素
		allList.add("www.chuanxi.com"); // 增加元素
		System.out.println(allList.contains("Hello") ? "\"Hello\"字符串存在！" : "\"Hello\"字符串不存在！");
		List<String> allSub = allList.subList(3, 4);// 取出里面的部分集合
		System.out.print("集合截取：");
		for (int i = 0; i < allSub.size(); i++) { // 截取部分集合
			System.out.print(allSub.get(i) + "、");
		}
		System.out.println("");
		System.out.println("World字符串的位置：" + allList.indexOf("World"));
		System.out.println("集合操作后是否为空？" + allList.isEmpty());
	}
}
