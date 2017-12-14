package com.java5200.date0608;

class Info2 { // 定义信息类
	private String name = "李小龙"; // 信息名称,指定默认值
	private String content = "JAVA讲师"; // 信息内容,指定默认值

	public synchronized void set(String name, String content) {// 设置信息名称及内容
		this.setName(name); // 设置信息名称
		try {
			Thread.sleep(300); // 加入延迟
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		this.setContent(content); // 设置信息内容
	}

	public synchronized void get() { // 取得信息内容
		try {
			Thread.sleep(300); // 加入延迟
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println(this.getName() + " --> " + this.getContent()); // 输出信息
	}
	

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}
}

class Producer3 implements Runnable { // 定义生产者线程
	private Info2 info = null; // 保存Info引用

	public Producer3(Info2 info2) { // 通过构造方法设置
		this.info = info2; // 为info属性初始化
	}

	public void run() { // 重写run()方法
		boolean flag = false; // 定义标记位
		for (int i = 0; i < 50; i++) { // 循环50次
			if (flag) { // 如果为true,则设置第一个信息
				this.info.set("李小龙", "JAVA讲师"); // 设置信息
				flag = false; // 修改标记位
			} else { // 如果为false,则设置第二个信息
				this.info.set("chuanxi", "www.yuanrenhome.com");
				flag = true; // 修改标记位
			}
		}
	}
}

class Consumer3 implements Runnable { // 定义消费者线程
	private Info2 info = null; // 保存Info引用

	public Consumer3(Info2 info) { // 通过构造方法设置Info属性内容
		this.info = info; // 为info属性初始化
	}

	public void run() { // 重写run()方法
		for (int i = 0; i < 50; i++) { // 循环50次
			try {
				Thread.sleep(100); // 加入延迟
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			this.info.get(); // 取出信息
		}
	}
}

public class PCerTest2 {

	public static void main(String[] args) {
		Info2 i = new Info2(); // 实例化Info对象
		Producer3 pro = new Producer3(i); // 实例化生产者,传递Info引用
		Consumer3 con = new Consumer3(i); // 实例化消费者,传递Info引用
		new Thread(pro).start(); // 启动生产者线程
		new Thread(con).start(); // 启动消费者线程
	}
}
