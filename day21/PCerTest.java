package com.java5200.date0608;

class Info { // 定义信息类
	private String name = "李小龙"; // 信息名称,指定默认值
	private String content = "JAVA讲师"; // 信息内容,指定默认值

	public String getName() { // 取得信息名称
		return name; // 返回信息名称
	}

	public void setName(String name) { // 设置信息名称
		this.name = name; // 设置name属性内容
	}

	public String getContent() { // 取得信息内容
		return content; // 返回信息内容
	}

	public void setContent(String content) { // 设置信息内容
		this.content = content; // 设置content属性内容
	}
}

class Producer2 implements Runnable { // 定义生产者线程
	private Info info = null; // 保存Info引用

	public Producer2(Info info) { // 通过构造方法设置Info属性内容
		this.info = info; // 为info属性初始化
	}

	public void run() { // 重写run()方法
		boolean flag = false; // 定义标记位
		for (int i = 0; i < 50; i++) { // 循环50次
			if (flag) { // 如果为true,则设置第一个信息
				this.info.setName("李小龙"); // 设置信息名称
				try {
					Thread.sleep(90);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} // 加入延迟,处理异常
				this.info.setContent("JAVA讲师"); // 设置信息内容
				flag = false; // 修改标记位
			} else { // 如果为false,则设置第二个信息
				this.info.setName("chuanxi");// 设置信息名称
				try {
					Thread.sleep(90);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} // 加入延迟,处理异常
				this.info.setContent("www.yuanrenhome.com");
				flag = true; // 修改标记位
			}
		}
	}
}

class Consumer2 implements Runnable { // 定义消费者线程
	private Info info = null; // 保存Info引用

	public Consumer2(Info info) { // 通过构造方法设置Info属性内容
		this.info = info; // 为info属性初始化
	}

	public void run() { // 重写run()方法
		for (int i = 0; i < 50; i++) { // 循环50次
			try {
				Thread.sleep(100); // 加入延迟
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(this.info.getName() + " --> " + this.info.getContent());// 取出信息
		}
	}
}

public class PCerTest {

	public static void main(String[] args) {
		Info i = new Info(); // 实例化Info对象
		Producer2 pro = new Producer2(i); // 实例化生产者,传递Info引用
		Consumer2 con = new Consumer2(i); // 实例化消费者,传递Info引用
		new Thread(pro).start(); // 启动生产者线程
		new Thread(con).start(); // 启动消费者线程
	}

}
