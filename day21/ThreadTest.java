package com.java5200.date0608;

class MyTicketThread implements Runnable { // 实现Runnable接口
	private int ticket = 50; // 一共50张票

	public void run() { // 重写run()方法
		for (int i = 0; i < 100; i++) { // 超出票数的循环
			if (ticket > 0) { // 判断是否有剩余票
				try {
					Thread.sleep(300); // 加入延迟
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				System.out.println("卖票：ticket = " + ticket--);
			}
		}
	}
};


public class ThreadTest {

	public static void main(String[] args) {
		MyTicketThread mt = new MyTicketThread(); // 定义线程对象
		Thread t1 = new Thread(mt); // 定义Thread对象
		Thread t2 = new Thread(mt); // 定义Thread对象
		Thread t3 = new Thread(mt); // 定义Thread对象
		t1.start(); // 启动线程
		t2.start(); // 启动线程
		t3.start(); // 启动线程
	}
}
