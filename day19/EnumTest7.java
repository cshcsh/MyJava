package com.java5200.date0606;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

enum Color6 {
	RED, GREEN, BLUE; // 定义枚举的三个类型
}


public class EnumTest7 {
	
	public static void main(String[] args) {
		Set<Color6> t = new TreeSet<Color6>(); // 只能加入Color类型
		t.add(Color6.GREEN); // 增加绿色的枚举对象
		t.add(Color6.BLUE); // 增加蓝色的枚举对象
		t.add(Color6.RED); // 增加红色的枚举对象
		Iterator<Color6> iter = t.iterator(); // 使用迭代输出
		while (iter.hasNext()) {
			System.out.print(iter.next() + "、");
		}
	}

}
