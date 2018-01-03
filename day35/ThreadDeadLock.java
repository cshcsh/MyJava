package com.java5200.date0622;

class Zhangsan { // 定义表示张三的类
	public synchronized void say(Lisi ls) { // 定义say()方法
		System.out.println("张三对李四说：“你给我画,我就把书给你”。");
		ls.get();
	}

	public synchronized void get() { // 定义得到东西的方法
		System.out.println("张三得到画了。");
	}
}

class Lisi { // 定义表示李四的类
	public synchronized void say(Zhangsan zs) { // 定义say()方法
		System.out.println("李四对张三说：“你给我书,我就把画给你”。");
		zs.get();
	}

	public synchronized void get() { // 定义得到东西的方法
		System.out.println("李四得到书了。");
	}
}

public class ThreadDeadLock implements Runnable {

	private static Zhangsan zs = new Zhangsan();
	private static Lisi ls = new Lisi();

	public ThreadDeadLock() {
		new Thread(this).start();
		zs.say(ls);
	}

	public void run() { // 重写run()方法
		ls.say(zs); // 调用方法
		try {
			Thread.sleep(500);// 加入延迟,要处理异常
		} catch (InterruptedException e) {
			e.printStackTrace();
		} 
	}

	public static void main(String[] args) {
		new ThreadDeadLock();
	}

	//多个线程访问同一个资源的时候需要进行同步，但是过多的同步会产生死锁。
}
