package com.java5200.date0613;

import java.io.IOException;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 * 两个集合去除重复项合并成一个
 * 
 * @author CSH
 * @date 2018年6月14日上午10:41:10
 */
public class Test08 {

	public static void main(String[] args) throws IOException {

		Set<String> set=new HashSet<>();
		set.add("a");
		set.add("b");
		set.add("c");
		set.add("d");
		set.add("e");
		Set<String> set2=new HashSet<>();
		set2.add("d");
		set2.add("e");
		set2.add("f");
		set2.add("g");
		set2.add("h");
		set.addAll(set2);
		Iterator<String> iterator=set.iterator();
		while (iterator.hasNext()) {
			String string = (String) iterator.next();
			System.out.print(string+" ");
		}
	}
	
}
