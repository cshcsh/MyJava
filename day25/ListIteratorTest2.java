package com.java5200.date0612;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ListIteratorTest2 {

	public static void main(String[] args) {
		List<String> all = new ArrayList<String>(); // 实例化List接口
		all.add("hello"); // 增加元素
		all.add("_"); // 增加元素
		all.add("world"); // 增加元素
		ListIterator<String> iter = all.listIterator();
		System.out.print("由前向后输出："); // 输出信息
		while (iter.hasNext()) { // 由前向后输出
			String str = iter.next(); // 取出内容
			System.out.print(str + "、"); // 输出内容
		}
		System.out.print("\n由后向前输出："); // 输出信息
		while (iter.hasPrevious()) { // 由前向后输出
			String str = iter.previous(); // 取出内容
			System.out.print(str + "、"); // 输出内容
		}
	}
}
