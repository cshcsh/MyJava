package com.java5200.date0601;

import java.util.List;

class ATM4{
	private String ATMName;
	private Bank4 bank;
	
	public void show(Account account){
		System.out.println("余额："+account.getBalance());
	}
	
	public void out(){
		System.out.println("退出系统");
	}
	
	public ATM4(String aTMName, Bank4 bank) {
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
	public Bank4 getBank() {
		return bank;
	}
	public void setBank(Bank4 bank) {
		this.bank = bank;
	}
	
}

abstract class Bank4{
	
	private String bankName;
	public String getBankName() {
		return bankName;
	}
	public void setBankName(String bankName) {
		this.bankName = bankName;
	}
	public Bank4(String bankName) {
		super();
		this.bankName = bankName;
	}
}

class ZSBank extends Bank4{
	
	private List<Account> accounts;
	private List<ATM> atms;
	
	public ZSBank(String bankName) {
		super(bankName);
		this.accounts=null;
		this.atms=null;
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

abstract class Account4{
	private String userName;
	private String password;
	public Account4(String userName, String password) {
		super();
		this.userName = userName;
		this.password = password;
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
	
}

interface AddSub{
	public  void sub(double money);
	
	public  void add(double money);
}

class CSHAccount extends Account4 implements AddSub{
	
	private double balance;
	private Bank4 bank;
	
	public CSHAccount(String userName, String password,Bank4 bank) {
		super(userName,password);
		this.bank=bank;
		this.balance=0;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public void add(double money){
		double m=getBalance()+money;
		setBalance(m);
		System.out.println("存入成功");
		System.out.println("余额："+getBalance());
	}
	
	public void sub(double money){
		if(money>getBalance()){
			System.out.println("余额不足");
			return;
		}else {
			double m=getBalance()-money;
			setBalance(m);
			System.out.println("取出成功");
			System.out.println("余额："+getBalance());
		}
	}
}

class LSAccount extends Account4 implements AddSub{
	
	private double balance;
	private Bank4 bank;
	
	public LSAccount(String userName, String password,Bank4 bank) {
		super(userName,password);
		this.bank=bank;
		this.balance=0;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public void add(double money){
		double m=getBalance()+money;
		setBalance(m);
		System.out.println("存入成功");
		System.out.println("余额："+getBalance());
	}
	
	public void sub(double money){
		if(money>getBalance()){
			System.out.println("余额不足");
			return;
		}else {
			double m=getBalance()-money;
			setBalance(m);
			System.out.println("取出成功");
			System.out.println("余额："+getBalance());
		}
	}
}

public class ATM3 {

	public static void main(String[] args) {

		Bank4 zsBank=new ZSBank("招商银行");
		CSHAccount cshAccount=new CSHAccount("csh", "123456", zsBank);
		ATM4 atm4=new ATM4("招商ATM", zsBank);
		cshAccount.add(1000);
	}
}
