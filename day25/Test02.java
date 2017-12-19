package com.java5200.date0612;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;


/**
 * 使用LinkedList集合添加字符串数据,删除数据,修改数据,输出所有数据
 * 1,迭代 2,get() 3,foreach
 * @author CSH
 * @date 2018年6月12日下午3:00:48
 */
public class Test02 {

	public static void main(String[] args) {

		List<String> list = new LinkedList<String>();
		list.add("string1");
		list.add("  string2");
		list.add("66");
		Iterator<String> iterator = list.iterator();
		while (iterator.hasNext()) {
			String string = iterator.next();
			System.out.println(string);
		}
		//不能再迭代遍历
		/*while (iterator.hasNext()) {
			String string = iterator.next();
			System.out.println(string);
		}*/
		System.out.println("----------------");
		list.set(0, "123456");
		list.remove(2);
		Iterator<String> iterator2 = list.iterator();
		while (iterator2.hasNext()) {
			String string = iterator2.next();
			System.out.println(string);
		}
	}

}
