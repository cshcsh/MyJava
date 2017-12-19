package com.java5200.date0612;

import java.util.ArrayList;
import java.util.List;

public class ForEachTest {

	public static void main(String[] args) {
		List<String> all = new ArrayList<String>();
		all.add("hello"); // 增加元素
		all.add("_"); // 增加元素
		all.add("world"); // 增加元素
		for (String str : all) { // 输出foreach输出
			System.out.print(str + "、"); // 输出内容
		}
	}
}
