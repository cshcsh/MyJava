package com.java5200.date0607;

class MyDaemonThread implements Runnable { // ʵ��Runnable�ӿ�
	public void run() { // ��дrun()����
		while (true) { // ������ѭ��
			System.out.println(Thread.currentThread().getName() + "�����С�");// ����߳�����
		}
	}
};


public class DaemonTest {

	public static void main(String args[]) {
		MyDaemonThread mt = new MyDaemonThread(); // ʵ�����̶߳���
		Thread t = new Thread(mt, "�߳�"); // ʵ����Thread�����
		t.setDaemon(true); // ���߳��ں�̨����
		t.start(); // �����߳�
		try {
			Thread.sleep(10000);// ��ǰ̨û���߳�����ʱ,��̨�߳�Ҳֹͣ
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
