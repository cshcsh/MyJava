package com.java5200.date0607;

class ThreadName implements Runnable { // 实现Runnable接口
	public void run() { // 重写接口中的run()方法
		for (int i = 0; i < 3; i++) { // 循环输出3次
			System.out.println(Thread.currentThread().getName() + "运行, i = " + i);
			// 取得当前线程的名字
		}
	}
};

public class SetGetName {

	public static void main(String args[]) {
		ThreadName my = new ThreadName(); // 定义Runnable子类对象
		Thread thread=new Thread(my);
		thread.setName("哈哈");
		thread.start(); // 系统自动设置线程名称
		new Thread(my, "线程-A").start(); // 手工设置线程名称
		new Thread(my, "线程-B").start(); // 手工设置线程名称
		new Thread(my).start(); // 系统自动设置线程名称
		new Thread(my).start(); // 系统自动设置线程名称
	}
}
