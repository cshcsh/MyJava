package com.java5200.date0607;

/**
 * 创建两个子线程,让其中一个输出1-100之间的偶数,另一个输出1-100之间的奇数。
 * @author CSH
 * @date 2018年6月7日下午3:07:08
 */
class MyThread6 implements Runnable {

	@Override
	public void run() {
		// TODO Auto-generated method stub

		System.out.print("偶数：");
		for(int i=1;i<=100;i++){
			if(i%2==0){
				System.out.print(i+" ");
			}
		}
	}

}

class MyThread7 extends Thread {

	@Override
	public void run() {
		// TODO Auto-generated method stub

		for(int i=1;i<=100;i++){
			if(i%2!=0){
				System.out.print("奇数：");
				System.out.println(i+" ");
			}else{
				System.out.print("偶数：");
				System.out.println(i+" ");
			}
		}
	}

}

public class MyThreadTest6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MyThread7 myThread7=new MyThread7();
		myThread7.start();
		
		MyThread6 myThread6=new MyThread6();
		Thread thread=new Thread(myThread6);
		//thread.start();
	}

}
