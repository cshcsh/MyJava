package com.java5200.date0613;

import java.util.Map;
import java.util.WeakHashMap;

public class WeakHashMapTest {

	public static void main(String[] args) {
		Map<String, String> map = null;
		map = new WeakHashMap<String, String>(); // ʵ����Map����
		map.put(new String("chuanxi"), new String("www.cx.com"));
		map.put(new String("zhangshanfeng"), new String("www.yuanrentang.com"));
		map.put(new String("Hello java"), new String("www.java.cn"));
		System.gc(); // ���������ռ�
		map.put(new String("Hello"), new String("lixinghua"));
		System.out.println("���ݣ�" + map); // һ��ֻ��ʣ��һ������
	}

}
