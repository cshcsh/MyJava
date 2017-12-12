package com.java5200.date0607;

class MyThreadYield implements Runnable { // 实现Runnable接口
	public void run() { // 重写run()方法
		for (int i = 0; i < 5; i++) { // 不断输出
			System.out.println(Thread.currentThread().getName() + "运行 --> " + i); // 输出线程名称
			if (i == 3) {
				System.out.print("线程礼让：");
				Thread.currentThread().yield(); // 线程礼让
			}
		}
	}
};


public class YieldTest {

	public static void main(String args[]) {
		MyThreadYield my = new MyThreadYield(); // 实例化MyThread对象
		Thread t1 = new Thread(my, "线程A"); // 定义线程对象
		Thread t2 = new Thread(my, "线程B"); // 定义线程对象
		t1.start(); // 启动多线程
		t2.start(); // 启动多线程
	}
}
