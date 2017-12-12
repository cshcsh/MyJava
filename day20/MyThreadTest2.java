package com.java5200.date0607;

class MyThread2 extends Thread { // 继承Thread类
	public void run() { // 重写Thread类中的run()方法
		for (int i = 0; i < 1000; i++) { // 循环10次输出
			String name = Thread.currentThread().getName();
			System.out.println(name + "子线程运行,i = " + i);
		}
	}
}

public class MyThreadTest2 {

	public static void main(String args[]) {
		MyThread2 mt1 = new MyThread2(); // 实例化对象
		MyThread2 mt2 = new MyThread2(); // 实例化对象
		// mt1.run(); // 调用线程主体,并没有开启线程
		// mt2.run(); // 调用线程主体
		mt1.start(); // 调用start方法启动线程
		mt2.start();
	}
}
