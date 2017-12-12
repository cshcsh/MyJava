package com.java5200.date0607;

class MyCurThread implements Runnable { // 实现Runnable接口
	public void run() { // 重写接口中的run()方法
		for (int i = 0; i < 3; i++) { // 循环输出3次
			System.out.println(Thread.currentThread().getName() + "运行, i = " + i);
			// 取得当前线程的名字
		}
	}
};

public class MyThreadTest7 {

	public static void main(String args[]) {
		Runnable my = new MyCurThread(); // 定义Runnable子类对象
		new Thread(my, "子线程").start(); // 启动线程
		my.run(); // 直接调用run方法
	}
}
