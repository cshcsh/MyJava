package com.java5200.date0607;

class MyThreadPriority implements Runnable { // 实现Runnable接口
	public void run() { // 重写run()方法
		for (int i = 0; i < 5; i++) { // 循环5次
			try {
				Thread.sleep(500); // 线程休眠
			} catch (Exception e) {
				e.printStackTrace();
			} // 需要异常处理
			System.out.println(Thread.currentThread().getName() + "运行, i = " + i); // 输出线程名称
		}
	}
};

public class PriorityTest {

	public static void main(String[] args) {
		Thread t1 = new Thread(new MyThreadPriority(), "线程A"); // 实例化线程对象
		Thread t2 = new Thread(new MyThreadPriority(), "线程B"); // 实例化线程对象
		Thread t3 = new Thread(new MyThreadPriority(), "线程C"); // 实例化线程对象
		Thread t4=new Thread(new MyThreadPriority(),"线程D");
		t1.setPriority(Thread.MIN_PRIORITY); // 设置线程优先级为最低
		t2.setPriority(Thread.MAX_PRIORITY); // 设置线程优先级为最高
		t3.setPriority(Thread.NORM_PRIORITY); // 设置线程优先级为中等
		t4.setPriority(2);
		t1.start(); // 启动线程
		t2.start(); // 启动线程
		t3.start(); // 启动线程
		t4.start();
	}
}
