package com.java5200.date0607;

class MyTicket implements Runnable { // 实现Runnable接口
	private int ticket = 5; // 一共5张票

	public void run() { // 重写run()方法
		for (int i = 0; i < 100; i++) { // 超出票数的循环
			if (ticket > 0) { // 判断是否有剩余票
				System.out.println("卖票：ticket=" + ticket--);
			}
		}
	}
};

/**
 * 实现Runnable接口可以资源共享
 * @author CSH
 * @date 2018年6月7日下午3:02:22
 */
public class MyThreadTest5 {

	public static void main(String args[]) {
		MyTicket my = new MyTicket();
		new Thread(my).start(); // 启动三个线程
		new Thread(my).start(); // 启动三个线程
		new Thread(my).start(); // 启动三个线程
	}
}
