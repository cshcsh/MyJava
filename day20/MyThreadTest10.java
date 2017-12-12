package com.java5200.date0607;

class MyThread10 extends Thread{

	private long time;

	public long getTime() {
		return time;
	}

	public void setTime(long time) {
		this.time = time;
	}

	public MyThread10(String name, int time) {
		super(name);
		this.time = time;
	}

	@Override
	public void run() {

		try {
			System.out.println(Thread.currentThread().getName()+" 执行 "+this.getTime()+" 毫秒");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
}

public class MyThreadTest10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MyThread10 myThread9=new MyThread10("线程A", 1000);
		myThread9.start();
		MyThread10 myThread92=new MyThread10("线程B", 2000);
		try {
			myThread92.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		myThread92.start();
		
		MyThread10 myThread93=new MyThread10("线程C", 3000);
		try {
			myThread93.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		myThread93.start();
		
		
	}

}
