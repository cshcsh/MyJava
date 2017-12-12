package com.java5200.date0607;

class MyThreadJoin implements Runnable { // ʵ��Runnable�ӿ�
	public void run() { // ��дrun()����
		for (int i = 0; i < 50; i++) { // ѭ��50��
			System.out.println(Thread.currentThread().getName() + "���� --> " + i); // ����߳�����
		}
	}
};


public class JoinTest {

	public static void main(String args[]) {
		MyThreadJoin mt = new MyThreadJoin(); // ʵ��������
		Thread t = new Thread(mt, "���߳�"); // ʵ����Thread����
		t.start(); // �߳�����
		for (int i = 0; i < 50; i++) { // ѭ��50��
			if (i > 10) { // �жϱ�������
				try {
					t.join(); // �߳�t����ǿ������
				} catch (Exception e) {
				} // ��Ҫ�����쳣����
			}
			System.out.println("Main �߳����� --> " + i);
		}
	}
}
