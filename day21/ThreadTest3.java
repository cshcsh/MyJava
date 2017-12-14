package com.java5200.date0608;

class MyTicketThread3 implements Runnable { // ʵ��Runnable�ӿ�
	private int ticket = 50; // һ��50��Ʊ

	public  void run() { // ��дrun()����
		for (int i = 0; i < 100; i++) { // ����Ʊ����ѭ��
			this.sale(); // ����ͬ������
		}
	}

	public synchronized void sale() { // ����ͬ������
		if (ticket > 0) { // �ж��Ƿ���ʣ��Ʊ
			try {
				Thread.sleep(300); // �����ӳ�
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("��Ʊ��ticket = " + ticket--);
		}
	}
};

public class ThreadTest3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MyTicketThread3 mt = new MyTicketThread3(); // �����̶߳���
		Thread t1 = new Thread(mt); // ����Thread����
		Thread t2 = new Thread(mt); // ����Thread����
		Thread t3 = new Thread(mt); // ����Thread����
		t1.start(); // �����߳�
		t2.start(); // �����߳�
		t3.start(); // �����߳�
	}

}
