package com.java5200.date0612;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * 如果在使用Iterator输出时,集合自己调用了删除方法,则会出现运行时的错误
 * 
 * @author CSH
 * @date 2018年6月12日下午5:40:42
 */
public class IteratorTest {

	public static void main(String[] args) {
		List<String> all = new ArrayList<String>(); // 实例化List接口
		all.add("hello"); // 增加元素
		all.add("_"); // 增加元素
		all.add("world"); // 增加元素
		Iterator<String> iter = all.iterator(); // 直接实例化Iterator接口
		while (iter.hasNext()) {
			String str = iter.next(); // 取出内容
			if ("_".equals(str)) { // 判断内容是否是“_”
				//all.remove(str); // 删除当前元素,使用集合删除
				iter.remove();
			} else {
				System.out.print(str + "、"); // 输出元素内容
			}
		}
		System.out.println("\n删除之后的集合：" + all); // 输出集合内容,调用toString()方法
	}
}
