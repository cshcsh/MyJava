package com.java5200.date0607;

class MyThreadInter implements Runnable { // ʵ��Runnable�ӿ�
	public void run() { // ��дrun()����
		System.out.println("1������run����");
		try {
			Thread.sleep(10000); // ����10��
			System.out.println("2���Ѿ��������");
		} catch (Exception e) {
			System.out.println("3�����߱���ֹ");
			return; // �ó��򷵻ر����ô�
		}
		System.out.println("4��run������������");
	}
};

public class InterruptTest {

	public static void main(String args[]) {
		MyThreadInter mt = new MyThreadInter(); // ʵ�����������
		Thread t = new Thread(mt, "���߳�"); // ʵ�����̶߳���
		t.start();
		try {
			Thread.sleep(2000); // ��΢ͣ2���ټ����ж�
		} catch (Exception e) {
		}
		t.interrupt(); // �ж��߳�ִ��
	}
}
