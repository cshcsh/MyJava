package com.java5200.date0601;

import java.util.Scanner;

/**
 * ATM1
 * 
 * @author CSH
 * @date 2018��6��3������10:48:49
 */
public class ATM1 {

	private static String userName;
	private static String password;
	private static double balance = 1000;

	private static boolean flag = true;

	public static void login() {
		while (flag) {
			System.out.println("------��ӭʹ����������ATMϵͳ------");
			System.out.println("------------�û���¼------------");
			System.out.println("�������˻�:");
			Scanner scanner = new Scanner(System.in);
			userName = scanner.nextLine();
			System.out.println("����������:");
			password = scanner.nextLine();
			if (userName.equals("csh") && password.equals("123456")) {
				System.out.println("��¼�ɹ�");
				System.out.println("��ǰ�˻�:" + userName);
				flag = false;
				System.out.println("1:��ѯ���\n2:��Ǯ\n3:ȡǮ\n4:�˳�ϵͳ");
				System.out.println("--------------------------------");
			} else {
				System.out.println("�˻����������");
				System.out.println("��¼ʧ��,�����µ�¼");
				flag = true;
			}
		}
	}

	public static void outSystem() {
		flag = false;
		System.out.println("�ѳɹ��˳�ϵͳ");
	}

	public static void main(String[] args) {


			login();
			Scanner scanner2 = new Scanner(System.in);
			while (true) {
				System.out.println("��ѡ����˻��Ĳ���:");
				int n = scanner2.nextInt();
				if (n == 1) {
					System.out.println("�˻���" + balance);
					continue;
				}
				if (n == 2) {
					System.out.println("�˻���Ǯ����,����������");
					Scanner scanner3 = new Scanner(System.in);
					int money = scanner3.nextInt();
					while (money < 0) {
						System.out.println("�������,����������");
						money = scanner3.nextInt();
					}
					balance = balance + money;
					System.out.println("�˻���Ǯ�ɹ�,�ɹ�����" + money + "Ԫ");
					System.out.println("�˻����:" + balance);
					continue;
				}
				if (n == 3) {
					System.out.println("�˻�ȡǮ����,������Ҫȡ���������");
					Scanner scanner4 = new Scanner(System.in);
					int money = scanner4.nextInt();
					while (money < 0) {
						System.out.println("�������,����������");
						money = scanner4.nextInt();
					}
					while (balance < money) {
						System.out.println("����,����������");
						money = scanner4.nextInt();
					}
					balance = balance - money;
					System.out.println("�˻�ȡǮ�ɹ�,�ɹ�ȡ��" + money + "Ԫ");
					System.out.println("�˻����:" + balance);
					continue;
				}
				if (n == 4) {
					// outSystem();
					System.out.println("�ѳɹ��˳�ϵͳ");
					break;
				}
				System.out.println("�������,����������ѡ��");
			}
	}
}
