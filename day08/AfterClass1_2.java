package com.java5200.date0526;

import java.util.Arrays;
import java.util.Scanner;

/**
 * 对字符串中字符进行自然顺序排序。 提示： 1）字符串变成字符数组。 2）对数组排序，选择，冒泡，Arrays.sort();
 * 3）将排序后的数组变成字符串。
 */
public class AfterClass1_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("输入字符串：");
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		// 字符串变成字符数组
		char[] arr = str.toCharArray();
		// 数组排序
		Arrays.sort(arr);// 快速排序-->自带
//		bubbleSort(arr);// 冒泡排序
//		selectSort(arr);// 选择排序
//		insertSort(arr);// 插入排序
		// 字符数组变成字符串
		String str2 = new String(arr);
		System.out.println("排序后字符串变为：");
		System.out.print(str2);

	}

	// 冒泡排序:两两相互比较,大的数跟后面的数交换位置,以此类推
	public static void bubbleSort(char[] arr) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length - 1 - i; j++) {
				if (arr[j] > arr[j + 1]) {
					// 交换位置
					char temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		}
	}

	// 选择排序:找到最小数的索引,与第i个数交换位置,以此类推
	public static void selectSort(char[] arr) {
		for (int i = 0; i < arr.length; i++) {
			int min = i;
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] > arr[j]) {
					min = j;
				}
			}
			// 找到了最小值的下标min
			char temp = arr[i];
			arr[i] = arr[min];
			arr[min] = temp;
		}
	}

	// 插入排序法:假设前面的数已经有了顺序,在将要插入的数按照原来的规律插入到其中
	public static void insertSort(char[] arr) {
		for (int i = 1; i < arr.length; i++) {
			// 保存要插入的数
			char temp = arr[i];
			int j = i - 1;
			while (j >= 0 && arr[j] > temp) {
				arr[j + 1] = arr[j];
				j--;
			}
			arr[j + 1] = temp;
		}
	}

}
