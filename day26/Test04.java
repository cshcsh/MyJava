package com.java5200.date0613;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

/**
 * 以Iterator方式输出
 * @author CSH
 * @date 2018年6月13日上午10:27:16
 */
public class Test04 {

	/*
	• 1、将Map的实例通过entrySet()方法变为Set接口对象；
	• 2、通过Set接口实例为Iterator实例化；
	• 3、通过Iterator迭代输出,每个内容都是Map.Entry的对象；
	• 4、通过Map.Entry进行keyvalue的分离。
	*/
	public static void main(String[] args) {

		Map<String, String> map=new HashMap<String,String>();
		map.put("a", "111");
		map.put("b", "222");
		map.put("c", "333");
		Set<Entry<String, String>> set=map.entrySet();
		Iterator<Entry<String, String>> iterator=set.iterator();
		while(iterator.hasNext()){
			Map.Entry<String, String> entry=iterator.next();
			System.out.println(entry.getKey()+"--->"+entry.getValue());
		}
	}

}
