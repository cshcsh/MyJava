package com.java5200.date0607;

class MyDaemonThread implements Runnable { // 实现Runnable接口
	public void run() { // 重写run()方法
		while (true) { // 无限制循环
			System.out.println(Thread.currentThread().getName() + "在运行。");// 输出线程名称
		}
	}
};


public class DaemonTest {

	public static void main(String args[]) {
		MyDaemonThread mt = new MyDaemonThread(); // 实例化线程对象
		Thread t = new Thread(mt, "线程"); // 实例化Thread类对象
		t.setDaemon(true); // 此线程在后台运行
		t.start(); // 启动线程
		try {
			Thread.sleep(10000);// 当前台没有线程运行时,后台线程也停止
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
