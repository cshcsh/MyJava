package com.java5200.date0608;

import java.util.Random;

class Print implements Runnable {

	private static int i = 1;// Ա�����
	private static int f = 0;// ͳ��ǰ��
	private static int d = 0;// ͳ�ƺ���

	@Override
	public void run() {
		synchronized (this) {// ͬ������鱣֤i���ظ�
			Random random = new Random();
			String[] strings = { "ǰ��", "����" };
			int s = new Random().nextInt(2);
			System.out.println("���Ϊ:" + i++ + " ��Ա�� ��  " + strings[s] + " �볡! �õ���˫ɫ���Ʊ������: [ "
					+ (random.nextInt(33) + 1) + "," + (random.nextInt(33) + 1) + "," + (random.nextInt(33) + 1) + ","
					+ (random.nextInt(33) + 1) + "," + (random.nextInt(33) + 1) + "," + (random.nextInt(33) + 1) + ","
					+ (random.nextInt(16) + 1) + " ]");
			if (s == 0) {
				f++;
			}
		}
		if (i == 101) {
			System.out.println("�Ӻ����볡��Ա���ܹ�:" + (100 - f) + "λԱ��. ��ǰ���볡��Ա���ܹ�:" + f + "λԱ�� ");
		}
	}

}

/**
 * ���߳�ģ������볡����
 * 
 * @author CSH
 * @date 2018��6��8������8:00:18
 */
public class AnnualMeeting {

	public static void main(String[] args) {

		Print print = new Print();
		Thread[] threads = new Thread[100];
		for (int i = 0; i < 100; i++) { // 100���߳�ģ��100��Ա��
			threads[i] = new Thread(print);
			threads[i].start(); // Ա������᳡
		}
	}

}
