package com.java5200.date0607;

class MyMath implements Runnable{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		long startTime=System.currentTimeMillis();
		for(long i=1;i<=10000;i++){
			Math.hypot(Math.pow(924526789, i), Math.cos(i));
		}
		long endTime=System.currentTimeMillis();
		long n=endTime-startTime;
		System.out.println(n);
	}
	
}

public class MathThreadTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MyMath myMath=new MyMath();
		Thread thread=new Thread(myMath);
		thread.start();
	}

}
