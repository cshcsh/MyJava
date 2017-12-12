package com.java5200.date0607;

class MyThreadInter implements Runnable { // 实现Runnable接口
	public void run() { // 重写run()方法
		System.out.println("1、进入run方法");
		try {
			Thread.sleep(10000); // 休眠10秒
			System.out.println("2、已经完成休眠");
		} catch (Exception e) {
			System.out.println("3、休眠被终止");
			return; // 让程序返回被调用处
		}
		System.out.println("4、run方法正常结束");
	}
};

public class InterruptTest {

	public static void main(String args[]) {
		MyThreadInter mt = new MyThreadInter(); // 实例化子类对象
		Thread t = new Thread(mt, "子线程"); // 实例化线程对象
		t.start();
		try {
			Thread.sleep(2000); // 稍微停2秒再继续中断
		} catch (Exception e) {
		}
		t.interrupt(); // 中断线程执行
	}
}
