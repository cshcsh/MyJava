package com.java5200.date0607;

/**
 * �����������߳�,������һ�����1-100֮���ż��,��һ�����1-100֮���������
 * @author CSH
 * @date 2018��6��7������3:07:08
 */
class MyThread6 implements Runnable {

	@Override
	public void run() {
		// TODO Auto-generated method stub

		System.out.print("ż����");
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
				System.out.print("������");
				System.out.println(i+" ");
			}else{
				System.out.print("ż����");
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
