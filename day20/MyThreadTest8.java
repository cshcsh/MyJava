package com.java5200.date0607;

class MyThreadSleep implements Runnable { // ʵ��Runnable�ӿ�
	public void run() { // ��дrun()����
		for (int i = 0; i < 5; i++) { // ѭ��5��
			try {
				Thread.sleep(500); // �߳�����,��̬����
			} catch (Exception e) {
			} // ��Ҫ�쳣����
			System.out.println(Thread.currentThread().getName() + "����, i = " + i); // ����߳�����
		}
	}
};

public class MyThreadTest8 {

	public static void main(String args[]) {
		MyThreadSleep mt = new MyThreadSleep(); // ʵ��������
		new Thread(mt, "�߳�").start(); // �����߳�
	}
}
