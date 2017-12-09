package com.java5200.date0605;

import java.util.Arrays;

public class ArrayTest {

	public static void main(String args[]) {
		int temp[] = { 3, 5, 7, 9, 1, 2, 6, 8 }; // 声明一个整型数组
		Arrays.sort(temp);
		// 数组排序
		System.out.print("排序后的数组");
		System.out.println(Arrays.toString(temp));// 以字符串输出数组
		int point = Arrays.binarySearch(temp, 3); // 检索数据位置
		System.out.println("元素‘3’的位置在：" + point);
		Arrays.fill(temp, 3); // 填充数组
		System.out.print("数组填充：");
		System.out.println(Arrays.toString(temp));// 以字符串输出数组
	}
}
