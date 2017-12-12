package com.java5200.date0607;

class MyThread extends Thread { // 继承 Thread 类
	public void run() { // 做为线程的主体
		for (int x = 0; x < 5; x++) {
			System.out.println("x =" + x);
		}
	}
};

public class MyThreadTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MyThread myThread=new MyThread();
		myThread.run();
	}

}
