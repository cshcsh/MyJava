package com.java5200.date0604;

public class System2 {

	public static void main(String[] args) {
		long startTime = System.currentTimeMillis();
		int sum = 0;
		for (int i = 0; i < 30000000; i++) { // 执行累加操作
			sum += i;
		}
		long endTime = System.currentTimeMillis();
		System.out.println("计算所花费的时间：" + (endTime - startTime) + "毫秒");
	}
}
