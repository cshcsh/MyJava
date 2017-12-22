package com.java5200.date0613;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

/**
 * 以foreach方式输出
 * @author CSH
 * @date 2018年6月13日上午10:27:16
 */
public class Test040 {

	
	public static void main(String[] args) {

		Map<String, String> map=new HashMap<String,String>();
		map.put("a", "111");
		map.put("b", "222");
		map.put("c", "333");
		for(Map.Entry<String, String> entry:map.entrySet()){
			System.out.println(entry.getKey()+"--->"+entry.getValue());
		}
	}

}
