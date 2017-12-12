package com.java5200.date0607;

class MyThread9 extends Thread{

	private long time;

	public long getTime() {
		return time;
	}

	public void setTime(long time) {
		this.time = time;
	}

	public MyThread9(String name, int time) {
		super(name);
		this.time = time;
	}

	@Override
	public void run() {

		try {
			
			Thread.currentThread().sleep(this.getTime());
			System.out.println(Thread.currentThread().getName()+" 休眠 "+this.getTime()+" 毫秒");
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
}

public class MyThreadTest9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MyThread9 myThread9=new MyThread9("线程A", 1000);
		myThread9.start();
		
		MyThread9 myThread92=new MyThread9("线程B", 2000);
		myThread92.start();
		
		MyThread9 myThread93=new MyThread9("线程C", 3000);
		myThread93.start();
	}

}
