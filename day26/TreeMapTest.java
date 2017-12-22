package com.java5200.date0613;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

/**
 * 使用TreeMap完成以下操作
 * •操作一：向集合中增加和取出内容
 * •操作二：判断指定的key或value是否存在
 * •操作三：输出全部的key
 * •操作四：输出全部的value
 * @author CSH
 * @date 2018年6月13日上午8:44:43
 */
public class TreeMapTest {

	public static void main(String[] args) {

		Map<String, String> map=new TreeMap<String,String>();
		map.put("c", "ccccc");
		map.put("b", "bbb");
		map.put("a", "aaaa");
		map.put("b", "bbb2");
		String string=map.get("a");
		String string2=map.get("b");
		String string3=map.get("c");
		System.out.println(string+"  "+string2+"  "+string3);
		if(map.containsKey("a")){
			System.out.println("key--->a 存在");
		}
		if(map.containsValue("bbb")){
			System.out.println("value--->bbb 存在");
		}
		Set<String> set=map.keySet();
		Iterator<String> iterator=set.iterator();
		while(iterator.hasNext()){
			System.out.println("key--->"+iterator.next());
		}
		Iterator<String> iterator2=map.values().iterator();
		while(iterator2.hasNext()){
			System.out.println("value--->"+iterator2.next());
		}
	}

}
