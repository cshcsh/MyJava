package com.java5200.date0607;

class MyThread5 extends Thread{

	public MyThread5(int priority) {
		super();
		if(priority>0&&priority<=10){
			Thread.currentThread().setPriority(priority); 
		}
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		long start=System.currentTimeMillis();
		for(int i=0;i<10000;i++){
			Math.hypot(Math.pow(924526789, i), Math.cos(i));
		}
		long end=System.currentTimeMillis();
		System.out.println(Thread.currentThread().getName()+"����ʱ�䣺"+(end-start)+"  ���ȼ���"+Thread.currentThread().getPriority());
	}
	
}

public class PriorityThreadTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for(int i=0;i<20;i++){
			new MyThread5(i%10+1).start();
		}
	}

}
