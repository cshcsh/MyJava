package com.java5200.date0622;

class Zhangsan { // �����ʾ��������
	public synchronized void say(Lisi ls) { // ����say()����
		System.out.println("����������˵��������һ�,�ҾͰ�����㡱��");
		ls.get();
	}

	public synchronized void get() { // ����õ������ķ���
		System.out.println("�����õ����ˡ�");
	}
}

class Lisi { // �����ʾ���ĵ���
	public synchronized void say(Zhangsan zs) { // ����say()����
		System.out.println("���Ķ�����˵�����������,�ҾͰѻ����㡱��");
		zs.get();
	}

	public synchronized void get() { // ����õ������ķ���
		System.out.println("���ĵõ����ˡ�");
	}
}

public class ThreadDeadLock implements Runnable {

	private static Zhangsan zs = new Zhangsan();
	private static Lisi ls = new Lisi();

	public ThreadDeadLock() {
		new Thread(this).start();
		zs.say(ls);
	}

	public void run() { // ��дrun()����
		ls.say(zs); // ���÷���
		try {
			Thread.sleep(500);// �����ӳ�,Ҫ�����쳣
		} catch (InterruptedException e) {
			e.printStackTrace();
		} 
	}

	public static void main(String[] args) {
		new ThreadDeadLock();
	}

	//����̷߳���ͬһ����Դ��ʱ����Ҫ����ͬ�������ǹ����ͬ�������������
}
