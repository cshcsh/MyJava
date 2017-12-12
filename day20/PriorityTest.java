package com.java5200.date0607;

class MyThreadPriority implements Runnable { // ʵ��Runnable�ӿ�
	public void run() { // ��дrun()����
		for (int i = 0; i < 5; i++) { // ѭ��5��
			try {
				Thread.sleep(500); // �߳�����
			} catch (Exception e) {
				e.printStackTrace();
			} // ��Ҫ�쳣����
			System.out.println(Thread.currentThread().getName() + "����, i = " + i); // ����߳�����
		}
	}
};

public class PriorityTest {

	public static void main(String[] args) {
		Thread t1 = new Thread(new MyThreadPriority(), "�߳�A"); // ʵ�����̶߳���
		Thread t2 = new Thread(new MyThreadPriority(), "�߳�B"); // ʵ�����̶߳���
		Thread t3 = new Thread(new MyThreadPriority(), "�߳�C"); // ʵ�����̶߳���
		Thread t4=new Thread(new MyThreadPriority(),"�߳�D");
		t1.setPriority(Thread.MIN_PRIORITY); // �����߳����ȼ�Ϊ���
		t2.setPriority(Thread.MAX_PRIORITY); // �����߳����ȼ�Ϊ���
		t3.setPriority(Thread.NORM_PRIORITY); // �����߳����ȼ�Ϊ�е�
		t4.setPriority(2);
		t1.start(); // �����߳�
		t2.start(); // �����߳�
		t3.start(); // �����߳�
		t4.start();
	}
}
