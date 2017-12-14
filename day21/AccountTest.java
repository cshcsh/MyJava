package com.java5200.date0608;

class MyThread implements Runnable {

	private Account account;

	public MyThread(Account account) {
		super();
		this.account = account;
	}

	@Override
	public void run() {
		for (int i = 0; i < 3; i++) {
			saveMoney(1000);
		}
	}

	public synchronized void saveMoney(double money) {

		account.setBalance(account.getBalance() + money);
		System.out.println(Thread.currentThread().getName() + "   存入1000元     " + "账户余额：" + account.getBalance());
	}

}

class Account {
	private String name;
	private double balance;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public synchronized double getBalance() {
		return balance;
	}

	public synchronized void setBalance(double balance) {
		this.balance = balance;
	}

	public Account(String name) {
		super();
		this.name = name;
		this.balance = 0;
	}

}

/**
 * 实现两个储户交替存钱的操作
 * @author CSH
 * @date 2018年6月8日上午8:57:18
 */
public class AccountTest {

	public static void main(String[] args) {

		Account account = new Account("csh");
		MyThread myThread = new MyThread(account);
		Thread thread = new Thread(myThread, "A储户");
		Thread thread2 = new Thread(myThread, "B储户");
		thread.start();
		thread2.start();
	}

}
