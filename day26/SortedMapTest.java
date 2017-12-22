package com.java5200.date0613;

import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;

public class SortedMapTest {

	public static void main(String args[]) {
		
		SortedMap<String, String> map = null; // 声明SortedMap对象
		map = new TreeMap<String, String>(); // 实例化SortedMap对象
		map.put("D、jiangker", "http://www.jiangker.com/");// 增加内容
		map.put("A、jxau", "www.jxau.com"); // 增加内容
		map.put("C、zhangshanfeng", "www.zhangshanfeng.cn");// 增加内容
		map.put("B、nowcode", "www.nowcode.cn"); // 增加内容
		System.out.print("第一个元素的内容的key：" + map.firstKey());
		System.out.println("；对应的值：" + map.get(map.firstKey()));
		System.out.print("最后一个元素的内容的key：" + map.lastKey());
		System.out.println("；对应的值：" + map.get(map.lastKey()));
		System.out.println("返回小于指定范围的集合");
		for (Map.Entry<String, String> me : map.headMap("B、nowcode").entrySet()) {
			System.out.println("\t|- " + me.getKey() + " --> " + me.getValue());
		}
		System.out.println("返回大于指定范围的集合");
		for (Map.Entry<String, String> me : map.tailMap("B、nowcode").entrySet()) {
			System.out.println("\t|- " + me.getKey() + " --> " + me.getValue());
		}
		System.out.println("部分集合");
		for (Map.Entry<String, String> me : map.subMap("A、jxau", "C、zhangshanfeng").entrySet()) {
			System.out.println("\t|- " + me.getKey() + " --> " + me.getValue());
		}
	}
}
