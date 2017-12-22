package com.java5200.date0613;

import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;

public class SortedMapTest {

	public static void main(String args[]) {
		
		SortedMap<String, String> map = null; // ����SortedMap����
		map = new TreeMap<String, String>(); // ʵ����SortedMap����
		map.put("D��jiangker", "http://www.jiangker.com/");// ��������
		map.put("A��jxau", "www.jxau.com"); // ��������
		map.put("C��zhangshanfeng", "www.zhangshanfeng.cn");// ��������
		map.put("B��nowcode", "www.nowcode.cn"); // ��������
		System.out.print("��һ��Ԫ�ص����ݵ�key��" + map.firstKey());
		System.out.println("����Ӧ��ֵ��" + map.get(map.firstKey()));
		System.out.print("���һ��Ԫ�ص����ݵ�key��" + map.lastKey());
		System.out.println("����Ӧ��ֵ��" + map.get(map.lastKey()));
		System.out.println("����С��ָ����Χ�ļ���");
		for (Map.Entry<String, String> me : map.headMap("B��nowcode").entrySet()) {
			System.out.println("\t|- " + me.getKey() + " --> " + me.getValue());
		}
		System.out.println("���ش���ָ����Χ�ļ���");
		for (Map.Entry<String, String> me : map.tailMap("B��nowcode").entrySet()) {
			System.out.println("\t|- " + me.getKey() + " --> " + me.getValue());
		}
		System.out.println("���ּ���");
		for (Map.Entry<String, String> me : map.subMap("A��jxau", "C��zhangshanfeng").entrySet()) {
			System.out.println("\t|- " + me.getKey() + " --> " + me.getValue());
		}
	}
}
