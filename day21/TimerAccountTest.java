package com.java5200.date0608;

import java.util.Timer;
import java.util.TimerTask;

class Account2{
	private String name;
	private double balance;
	public Account2(String name) {
		super();
		this.name = name;
		this.balance=10000;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public void save(double money){
		if(money>0){
			System.out.print("¥Ê«Æ£∫"+money);
			this.setBalance(this.getBalance()+money);
			System.out.println("   ”‡∂Ó£∫"+this.getBalance());
		}
	}
	public void draw(double money){
		if(money<=this.balance&&money>0){
			System.out.print("»°«Æ£∫"+money);
			this.setBalance(this.getBalance()-money);
			System.out.println("   ”‡∂Ó£∫"+this.getBalance());
		}else{
			System.out.println("”‡∂Ó≤ª◊„");
		}
	}
}

class SaveTask extends TimerTask{

	private Account2 account2;
	
	public SaveTask(Account2 account2) {
		super();
		this.account2 = account2;
	}

	@Override
	public void run() {
		this.account2.save(1000);
	}
	
}

class DrawTask extends TimerTask{

	private Account2 account2;
	
	public DrawTask(Account2 account2) {
		super();
		this.account2 = account2;
	}

	@Override
	public void run() {
		this.account2.draw(2000);
	}
	
}

public class TimerAccountTest {

	public static void main(String[] args) {
		Timer t = new Timer(); 
		Account2 account2=new Account2("csh");
		SaveTask saveTask = new SaveTask(account2);
		DrawTask drawTask=new DrawTask(account2);
		t.schedule(saveTask, 0, 2000);
		t.schedule(drawTask, 0, 1000);
		
	}
}
