package com.java5200.date0601;

import java.util.Scanner;

/**
 * ATM1
 * 
 * @author CSH
 * @date 2018年6月3日下午10:48:49
 */
public class ATM1 {

	private static String userName;
	private static String password;
	private static double balance = 1000;

	private static boolean flag = true;

	public static void login() {
		while (flag) {
			System.out.println("------欢迎使用招商银行ATM系统------");
			System.out.println("------------用户登录------------");
			System.out.println("请输入账户:");
			Scanner scanner = new Scanner(System.in);
			userName = scanner.nextLine();
			System.out.println("请输入密码:");
			password = scanner.nextLine();
			if (userName.equals("csh") && password.equals("123456")) {
				System.out.println("登录成功");
				System.out.println("当前账户:" + userName);
				flag = false;
				System.out.println("1:查询余额\n2:存钱\n3:取钱\n4:退出系统");
				System.out.println("--------------------------------");
			} else {
				System.out.println("账户或密码错误");
				System.out.println("登录失败,请重新登录");
				flag = true;
			}
		}
	}

	public static void outSystem() {
		flag = false;
		System.out.println("已成功退出系统");
	}

	public static void main(String[] args) {


			login();
			Scanner scanner2 = new Scanner(System.in);
			while (true) {
				System.out.println("请选择对账户的操作:");
				int n = scanner2.nextInt();
				if (n == 1) {
					System.out.println("账户余额：" + balance);
					continue;
				}
				if (n == 2) {
					System.out.println("账户存钱操作,请放入人民币");
					Scanner scanner3 = new Scanner(System.in);
					int money = scanner3.nextInt();
					while (money < 0) {
						System.out.println("输入错误,请重新输入");
						money = scanner3.nextInt();
					}
					balance = balance + money;
					System.out.println("账户存钱成功,成功存入" + money + "元");
					System.out.println("账户余额:" + balance);
					continue;
				}
				if (n == 3) {
					System.out.println("账户取钱操作,请输入要取得人民币数");
					Scanner scanner4 = new Scanner(System.in);
					int money = scanner4.nextInt();
					while (money < 0) {
						System.out.println("输入错误,请重新输入");
						money = scanner4.nextInt();
					}
					while (balance < money) {
						System.out.println("余额不足,请重新输入");
						money = scanner4.nextInt();
					}
					balance = balance - money;
					System.out.println("账户取钱成功,成功取出" + money + "元");
					System.out.println("账户余额:" + balance);
					continue;
				}
				if (n == 4) {
					// outSystem();
					System.out.println("已成功退出系统");
					break;
				}
				System.out.println("输入错误,请重新输入选择");
			}
	}
}
