package com.java5200.date0607;

class ThreadName implements Runnable { // ʵ��Runnable�ӿ�
	public void run() { // ��д�ӿ��е�run()����
		for (int i = 0; i < 3; i++) { // ѭ�����3��
			System.out.println(Thread.currentThread().getName() + "����, i = " + i);
			// ȡ�õ�ǰ�̵߳�����
		}
	}
};

public class SetGetName {

	public static void main(String args[]) {
		ThreadName my = new ThreadName(); // ����Runnable�������
		Thread thread=new Thread(my);
		thread.setName("����");
		thread.start(); // ϵͳ�Զ������߳�����
		new Thread(my, "�߳�-A").start(); // �ֹ������߳�����
		new Thread(my, "�߳�-B").start(); // �ֹ������߳�����
		new Thread(my).start(); // ϵͳ�Զ������߳�����
		new Thread(my).start(); // ϵͳ�Զ������߳�����
	}
}
