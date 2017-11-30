package com.java5200.date0526;

public class SystemDemo01 {
//System类应用：计算一个程序的执行时间
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long startTime = System.currentTimeMillis();// 取得开始计算之前的时间
		int sum = 0;
		// 声明变量存放累加后的结果
		for (int i = 0; i < 30000000; i++) { // 执行累加操作
			sum += i;
		}
		long endTime = System.currentTimeMillis();
		// 开始时间减去结束时间
		System.out.println("计算所花费的时间：" + (endTime - startTime) + "毫秒");
	}
}
