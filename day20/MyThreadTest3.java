package com.java5200.date0607;

class MyThread3 implements Runnable { // ʵ��Runnable�ӿ�
	private String name; // �����ж���һ������
	
	public MyThread3() {
		super();
		// TODO Auto-generated constructor stub
	}

	public MyThread3(String name) { // ͨ�����췽��������������
		this.name = name; // Ϊname���Ը�ֵ
	}

	public void run() { // ��дRunnable�ӿ��е�run()����
		for (int i = 0; i < 10; i++) { // ѭ�����10��
			System.out.println(name + "����,i = " + i);
		}
	}
};

public class MyThreadTest3 {

	public static void main(String args[]) {
		MyThread3 my1 = new MyThread3("�߳�һ");// ʵ����Runnable�������
		MyThread3 my2 = new MyThread3("�̶߳�");// ʵ����Runnable�������
		Thread t1 = new Thread(my1); // ʵ����Thread�����
		Thread t2 = new Thread(my2); // ʵ����Thread�����
		t1.start(); // �����߳�
		t2.start(); // �����߳�
	}
}
