package com.java5200.date0607;

class MyThread2 extends Thread { // �̳�Thread��
	public void run() { // ��дThread���е�run()����
		for (int i = 0; i < 1000; i++) { // ѭ��10�����
			String name = Thread.currentThread().getName();
			System.out.println(name + "���߳�����,i = " + i);
		}
	}
}

public class MyThreadTest2 {

	public static void main(String args[]) {
		MyThread2 mt1 = new MyThread2(); // ʵ��������
		MyThread2 mt2 = new MyThread2(); // ʵ��������
		// mt1.run(); // �����߳�����,��û�п����߳�
		// mt2.run(); // �����߳�����
		mt1.start(); // ����start���������߳�
		mt2.start();
	}
}
