package com.java5200.date0613;

import java.util.Map;
import java.util.WeakHashMap;

public class WeakHashMapTest {

	public static void main(String[] args) {
		Map<String, String> map = null;
		map = new WeakHashMap<String, String>(); // 实例化Map对象
		map.put(new String("chuanxi"), new String("www.cx.com"));
		map.put(new String("zhangshanfeng"), new String("www.yuanrentang.com"));
		map.put(new String("Hello java"), new String("www.java.cn"));
		System.gc(); // 进行垃圾收集
		map.put(new String("Hello"), new String("lixinghua"));
		System.out.println("内容：" + map); // 一般只会剩下一个内容
	}

}
