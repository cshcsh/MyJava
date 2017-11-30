package com.java5200.date0526;

public class RuntimeDemo01 {
	public static void main(String[] args) {
		Runtime run = Runtime.getRuntime();// 通过静态方法为其实例化
		System.out.println("JVM最大内存量：" + run.maxMemory() / 1024 / 1024 + "M");// 观察最大内存量,根据机器环境会有所不同

		System.out.println("JVM空闲内存量：" + run.freeMemory() / 1024 / 1024 + "M"); // 取得程序运行之前的内存空闲量
		String str = "Hello" + "World" + "!!!" + "\t" + "Welcome " + "To"
				+ "NONGDA" + "~";
		System.out.println(str);
		for (int x = 0; x < 1000; x++) {// 循环修改String 产生多个垃圾 会占用内存
			str += x;
		}
		System.out.println("操作String之后的,JVM空闲内存量：" + run.freeMemory() / 1024
				/ 1024 + "M");// 观察有多个垃圾空间产生之后的内存空闲量
		run.gc(); // 进行垃圾收集,释放空间
		System.out.println("垃圾回收之后的,JVM空闲内存量：" + run.freeMemory() / 1024 / 1024
				+ "M"); // 垃圾收集之后的内存空闲量
	}
}
