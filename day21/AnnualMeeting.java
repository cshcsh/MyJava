package com.java5200.date0608;

import java.util.Random;

class Print implements Runnable {

	private static int i = 1;// 员工编号
	private static int f = 0;// 统计前门
	private static int d = 0;// 统计后门

	@Override
	public void run() {
		synchronized (this) {// 同步代码块保证i不重复
			Random random = new Random();
			String[] strings = { "前门", "后门" };
			int s = new Random().nextInt(2);
			System.out.println("编号为:" + i++ + " 的员工 从  " + strings[s] + " 入场! 拿到的双色球彩票号码是: [ "
					+ (random.nextInt(33) + 1) + "," + (random.nextInt(33) + 1) + "," + (random.nextInt(33) + 1) + ","
					+ (random.nextInt(33) + 1) + "," + (random.nextInt(33) + 1) + "," + (random.nextInt(33) + 1) + ","
					+ (random.nextInt(16) + 1) + " ]");
			if (s == 0) {
				f++;
			}
		}
		if (i == 101) {
			System.out.println("从后门入场的员工总共:" + (100 - f) + "位员工. 从前门入场的员工总共:" + f + "位员工 ");
		}
	}

}

/**
 * 多线程模拟年会入场过程
 * 
 * @author CSH
 * @date 2018年6月8日下午8:00:18
 */
public class AnnualMeeting {

	public static void main(String[] args) {

		Print print = new Print();
		Thread[] threads = new Thread[100];
		for (int i = 0; i < 100; i++) { // 100个线程模仿100个员工
			threads[i] = new Thread(print);
			threads[i].start(); // 员工进入会场
		}
	}

}
