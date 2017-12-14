package com.java5200.date0608;

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

public class ThreadTest4 implements Runnable {

	private static Zhangsan zs = new Zhangsan();
	private static Lisi ls = new Lisi();
	public ThreadTest4(){
		new Thread(this).start();
		zs.say(ls);
	}
	public void run() { // ��дrun()����
		ls.say(zs); // ���÷���
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} // �����ӳ�,Ҫ�����쳣
	}
	public static void main(String[] args) {
		new ThreadTest4();
	}
}
