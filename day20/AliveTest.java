package com.java5200.date0607;

class MyThreadIsAlive implements Runnable { // ʵ��Runnable�ӿ�
	public void run() { // ��дrun()����
		for (int i = 0; i < 3; i++) { // ѭ�����3��
			System.out.println(Thread.currentThread().getName() + "���� --> " + i); // ȡ�õ�ǰ�߳�����
		}
	}
};

public class AliveTest {

	public static void main(String args[]) {
		MyThreadIsAlive mt = new MyThreadIsAlive(); // ʵ��������
		Thread t = new Thread(mt, "�߳�"); // ʵ����Thread����
		System.out.println("�߳̿�ʼִ��֮ǰ --> " + t.isAlive());// �ж��Ƿ�����
		t.start(); // �����߳�
		System.out.println("�߳̿�ʼִ��֮�� --> " + t.isAlive());// �ж��Ƿ�����
		for (int i = 0; i < 3; i++) { // ѭ�����3��
			System.out.println(" main ���� --> " + i); // ���
		}
		System.out.println("����ִ��֮�� --> " + t.isAlive());// �������������ȷ��
	}
}
