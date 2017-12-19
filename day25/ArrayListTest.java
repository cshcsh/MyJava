package com.java5200.date0612;

import java.util.ArrayList;
import java.util.List;

public class ArrayListTest {
	
	public static void main(String[] args) {
		List<String> allList = null; // 声明List对象
		allList = new ArrayList<String>(); // 实例化List对象,只能是String类型
		allList.add("Hello"); // 增加元素
		allList.add(0, "World"); // 增加元素
		allList.add("张无忌"); // 增加元素
		allList.add("www.cx.com"); // 增加元素
		String str[] = (String[]) allList.toArray(new String[] {});// 指定的泛型类型
		System.out.print("指定数组类型："); // 信息输出
		for (int i = 0; i < str.length; i++) {// 输出字符串数组中的内容
			System.out.print(str[i] + "、"); // 输出每一个元素
		}
		System.out.print("\n返回对象数组："); // 信息输出
		Object obj[] = allList.toArray(); // 直接返回对象数组
		for (int i = 0; i < obj.length; i++) { // 循环输出对象数组内容
			String temp = (String) obj[i]; // 每一个对象都是String类型实例
			System.out.print(temp + "、"); // 输出每一个元素
		}
	}

}
