package com.java5200.date0607;

class MyCurThread implements Runnable { // ʵ��Runnable�ӿ�
	public void run() { // ��д�ӿ��е�run()����
		for (int i = 0; i < 3; i++) { // ѭ�����3��
			System.out.println(Thread.currentThread().getName() + "����, i = " + i);
			// ȡ�õ�ǰ�̵߳�����
		}
	}
};

public class MyThreadTest7 {

	public static void main(String args[]) {
		Runnable my = new MyCurThread(); // ����Runnable�������
		new Thread(my, "���߳�").start(); // �����߳�
		my.run(); // ֱ�ӵ���run����
	}
}
