package com.java5200.date0607;

class MyTicket implements Runnable { // ʵ��Runnable�ӿ�
	private int ticket = 5; // һ��5��Ʊ

	public void run() { // ��дrun()����
		for (int i = 0; i < 100; i++) { // ����Ʊ����ѭ��
			if (ticket > 0) { // �ж��Ƿ���ʣ��Ʊ
				System.out.println("��Ʊ��ticket=" + ticket--);
			}
		}
	}
};

/**
 * ʵ��Runnable�ӿڿ�����Դ����
 * @author CSH
 * @date 2018��6��7������3:02:22
 */
public class MyThreadTest5 {

	public static void main(String args[]) {
		MyTicket my = new MyTicket();
		new Thread(my).start(); // ���������߳�
		new Thread(my).start(); // ���������߳�
		new Thread(my).start(); // ���������߳�
	}
}
