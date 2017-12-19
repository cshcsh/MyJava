package com.java5200.date0612;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ListIteratorTest {

	public static void main(String[] args) {
		List<String> all = new ArrayList<String>(); // 实例化List接口
		all.add("hello"); // 增加元素
		all.add("_"); // 增加元素
		all.add("world"); // 增加元素
		ListIterator<String> iter = all.listIterator();// 实例化ListIterator接口
		System.out.print("由前向后输出："); // 信息输出
		while (iter.hasNext()) { // 由前向后输出
			String str = iter.next(); // 取出内容
			System.out.print(str + "、"); // 输出内容
			iter.set("LI-" + str); // 替换元素
		}
		System.out.print("\n由后向前输出："); // 信息输出
		iter.add("Hello"); // 增加元素
		while (iter.hasPrevious()) { // 由前向后输出
			String str = iter.previous(); // 取出内容
			System.out.print(str + "、"); // 输出内容
		}
	}
}
