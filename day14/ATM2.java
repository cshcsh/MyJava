package com.java5200.date0601;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class ATM{
	private String ATMName;
	private Bank bank;
	
	public void show(Account account){
		System.out.println("余额："+account.getBalance());
	}
	
	public void add(Account account,double money){
		double m=account.getBalance()+money;
		account.setBalance(m);
		System.out.println("存入成功");
		System.out.println("余额："+account.getBalance());
	}
	
	public void sub(Account account,double money){
		if(money>account.getBalance()){
			System.out.println("余额不足");
			return;
		}else {
			double m=account.getBalance()-money;
			account.setBalance(m);
			System.out.println("取出成功");
			System.out.println("余额："+account.getBalance());
		}
	}
	
	public void out(){
		System.out.println("退出系统");
	}
	
	public ATM(String aTMName, Bank bank) {
		super();
		ATMName = aTMName;
		this.bank = bank;
	}
	public String getATMName() {
		return ATMName;
	}
	public void setATMName(String aTMName) {
		ATMName = aTMName;
	}
	public Bank getBank() {
		return bank;
	}
	public void setBank(Bank bank) {
		this.bank = bank;
	}
	
}

class Bank{
	private String bankName;
	private List<Account> accounts;
	private List<ATM> atms;
	
	public Bank(String bankName) {
		super();
		this.bankName = bankName;
		this.accounts=null;
		this.atms=null;
	}
	public String getBankName() {
		return bankName;
	}
	public void setBankName(String bankName) {
		this.bankName = bankName;
	}
	public List<Account> getAccounts() {
		return accounts;
	}
	public void setAccounts(List<Account> accounts) {
		this.accounts = accounts;
	}
	public List<ATM> getAtms() {
		return atms;
	}
	public void setAtms(List<ATM> atms) {
		this.atms = atms;
	}
	
	
}

class Account{
	private String userName;
	private String password;
	private double balance;
	private Bank bank;
	
	public Account(String userName, String password,Bank bank) {
		super();
		this.userName = userName;
		this.password = password;
		this.bank=bank;
		this.balance=0;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	
}

public class ATM2 {

	public static void main(String[] args) {

		Bank bank=new Bank("招商银行");
		Account csh=new Account("csh", "123456", bank);
		List<Account> list=new ArrayList<>();
		list.add(csh);
		bank.setAccounts(list);
		ATM atm=new ATM("招商ATM", bank);
		List<ATM> list2=new ArrayList<>();
		list2.add(atm);
		bank.setAtms(list2);
		System.out.println(csh.getUserName());
		atm.show(csh);
		atm.add(csh, 1000);
		atm.sub(csh, 100);
	}
}
