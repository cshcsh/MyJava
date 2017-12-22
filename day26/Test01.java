package com.java5200.date0613;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/**
 * 使用HashMap完成以下操作
 * •操作一：向集合中增加和取出内容
 * •操作二：判断指定的key或value是否存在
 * •操作三：输出全部的key
 * •操作四：输出全部的value
 * @author CSH
 * @date 2018年6月13日上午8:44:43
 */
public class Test01 {

	public static void main(String[] args) {

		Map<String, String> map=new HashMap<String,String>();
		map.put("a", "aaaa");
		map.put("b", "bbb");
		map.put("c", "ccccc");
		String string=map.get("a");
		String string2=map.get("b");
		String string3=map.get("c");
		System.out.print("向集合中增加和取出内容:");
		System.out.println(string+"  "+string2+"  "+string3);
		System.out.println("判断指定的key或value是否存在:");
		if(map.containsKey("a")){
			System.out.println("key--->a 存在");
		}
		if(map.containsValue("bbb")){
			System.out.println("value--->bbb 存在");
		}
		System.out.println("输出全部的key:");
		Set<String> set=map.keySet();
		Iterator<String> iterator=set.iterator();
		while(iterator.hasNext()){
			System.out.println("key--->"+iterator.next());
		}
		System.out.println("输出全部的value:");
		Iterator<String> iterator2=map.values().iterator();
		while(iterator2.hasNext()){
			System.out.println("value--->"+iterator2.next());
		}
	}

}
