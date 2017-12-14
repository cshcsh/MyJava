package com.java5200.date0608;

class MyThread8 implements Runnable {
	private boolean flag = true; // 定义标志位属性

	public void run() { // 重写run()方法
		int i = 0;
		while (this.flag) { // 循环输出
			while (true) {
				System.out.println(Thread.currentThread().getName() + "运行,i = " + (i++)); // 输出当前线程名称
			}
		}
	}

	public void stop() { // 编写停止方法
		this.flag = false; // 修改标志位
	}
}

public class StopTest {

	public static void main(String[] args) {
		MyThread8 my = new MyThread8(); // 实例化Runnable接口对象
		Thread t = new Thread(my, "线程"); // 建立线程对象
		t.start(); // 启动线程
		my.stop(); // 线程停止,修改标志位
	}
}
