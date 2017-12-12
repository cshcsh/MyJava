package com.java5200.date0607;

class MyThreadYield implements Runnable { // ʵ��Runnable�ӿ�
	public void run() { // ��дrun()����
		for (int i = 0; i < 5; i++) { // �������
			System.out.println(Thread.currentThread().getName() + "���� --> " + i); // ����߳�����
			if (i == 3) {
				System.out.print("�߳����ã�");
				Thread.currentThread().yield(); // �߳�����
			}
		}
	}
};


public class YieldTest {

	public static void main(String args[]) {
		MyThreadYield my = new MyThreadYield(); // ʵ����MyThread����
		Thread t1 = new Thread(my, "�߳�A"); // �����̶߳���
		Thread t2 = new Thread(my, "�߳�B"); // �����̶߳���
		t1.start(); // �������߳�
		t2.start(); // �������߳�
	}
}
