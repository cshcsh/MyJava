package com.java5200.date0615;

import java.lang.reflect.Array;

public class ClassArrayTest2 {

	public static void main(String[] args) throws Exception {
		int temp[] = { 1, 2, 3 }; // 声明一个整型数组
		int newTemp[] = (int[]) arrayInc(temp, 5); // 扩大数组长度
		print(newTemp); // 打印数组信息
		System.out.println("\n-------------------------------");
		String t[] = { "Hello", "word", "java" }; // 声明一个字符串数组
		String nt[] = (String[]) arrayInc(t, 8); // 扩大数组长度
		print(nt); // 打印数组信息
	}

	public static Object arrayInc(Object obj, int len) { // 修改数组大小
		Class<?> c = obj.getClass(); // 通过数组得到Class对象
		Class<?> arr = c.getComponentType(); // 得到数组的Class对象
		Object newO = Array.newInstance(arr, len); // 重新开辟新的数组大小
		int co = Array.getLength(obj); // 取得数组长度
		System.arraycopy(obj, 0, newO, 0, co); // 拷贝数组内容
		return newO;
	}

	public static void print(Object obj) { // 输出数组
		Class<?> c = obj.getClass(); // 通过数组得到Class对象
		if (!c.isArray()) { // 判断是否是数组
			return; // 不是则返回
		}
		Class<?> arr = c.getComponentType(); // 取得数组的Class
		System.out.println(arr.getName() + "数组的长度是:" + Array.getLength(obj)); // 输出数组信息
		for (int i = 0; i < Array.getLength(obj); i++) { // 循环输出
			System.out.print(Array.get(obj, i) + "、");// 通过Array输出
		}
	}
}
