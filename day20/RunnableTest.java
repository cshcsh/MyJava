package com.java5200.date0607;

public class RunnableTest implements Runnable {

	private String name; // �����ж���һ������

	public RunnableTest(String name) { // ͨ�����췽��������������
		this.name = name;
	}

	public void run() { // ��дRunnable�ӿ��е�run()����
		for (int i = 0; i < 10; i++) {
			System.out.println(name + "����,i = " + i);
		}
	}
}
