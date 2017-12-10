package com.java5200.date0606;

/**
 * 泛型数组
 * @author CSH
 * @date 2018年6月6日上午10:42:30
 */
public class GenericsArray {
	public static void main(String args[]) {
		Integer i[] = fun1(1, 2, 3, 4, 5, 6); // 返回泛型数组
		fun2(i); // 输出数组内容
	}

	public static <T> T[] fun1(T... arg) { // 接收可变参数,返回泛型数组
		return arg; // 返回泛型数组
	}

	public static <T> void fun2(T param[]) { // 接收泛型数组
		System.out.print("接收泛型数组：");
		for (T t : param) {
			System.out.print(t + "、");
		}
		System.out.println();
	}
}
