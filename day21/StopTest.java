package com.java5200.date0608;

class MyThread8 implements Runnable {
	private boolean flag = true; // �����־λ����

	public void run() { // ��дrun()����
		int i = 0;
		while (this.flag) { // ѭ�����
			while (true) {
				System.out.println(Thread.currentThread().getName() + "����,i = " + (i++)); // �����ǰ�߳�����
			}
		}
	}

	public void stop() { // ��дֹͣ����
		this.flag = false; // �޸ı�־λ
	}
}

public class StopTest {

	public static void main(String[] args) {
		MyThread8 my = new MyThread8(); // ʵ����Runnable�ӿڶ���
		Thread t = new Thread(my, "�߳�"); // �����̶߳���
		t.start(); // �����߳�
		my.stop(); // �߳�ֹͣ,�޸ı�־λ
	}
}
