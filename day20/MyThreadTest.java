package com.java5200.date0607;

class MyThread extends Thread { // �̳� Thread ��
	public void run() { // ��Ϊ�̵߳�����
		for (int x = 0; x < 5; x++) {
			System.out.println("x =" + x);
		}
	}
};

public class MyThreadTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MyThread myThread=new MyThread();
		myThread.run();
	}

}
