package com.java5200.date0611;

import java.util.Random;

//账户
class Account{
	private String id;//账号
	private String password;//密码
	private double balance;//余额
	private String userType;//用户类别
	public Account() {
		this.id="622608"+new Random().nextInt(10)
				+new Random().nextInt(10)
				+new Random().nextInt(10)
				+new Random().nextInt(10)
				+new Random().nextInt(10)
				+new Random().nextInt(10)
				+new Random().nextInt(10)
				+new Random().nextInt(10);//初始账号
		this.password = "000000";//初始密码
		this.balance=10000;//初始余额
		this.userType=UserType.PlatUser.getName();
	}
	//存钱
	public void saveMoney(Account a,double money){
		if(money>0){
			a.setBalance(a.getBalance()+money);
		}
	}
	//取钱
	public void delMoney(Account a,double money){
		if(money>0&&money<=a.getBalance()){
			a.setBalance(a.getBalance()-money);
		}
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
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
	public String getUserType() {
		return userType;
	}
	public void setUserType(String userType) {
		this.userType = userType;
	}
	@Override
	public String toString() {
		return "Account [id=" + id +  ", userType=" + userType +", balance=" + balance + "]";
	}
	
	
}
//ATM
class ATM{
	private String AtmName;//ATM名称
	public ATM(String atmName) {
		super();
		AtmName = atmName;
	}
	public String getAtmName() {
		return AtmName;
	}
	public void setAtmName(String atmName) {
		AtmName = atmName;
	}
	
}
//银行
class Bank{
	private String bankName;//银行名称
	private ATM[] atms;//ATM
	public Bank(String bankName) {
		super();
		this.bankName = bankName;
	}
	public String getBankName() {
		return bankName;
	}
	public void setBankName(String bankName) {
		this.bankName = bankName;
	}
	public ATM[] getAtms() {
		return atms;
	}
	public void setAtms(ATM[] atms) {
		this.atms = atms;
	}
	
}

//用户类别
enum UserType{
	GenUser("普通用户"),VipUser("VIP用户"),PlatUser("白金用户");//分别有普通用户GenUser,VIP用户VipUser,白金用户PlatUser
	private String name;//用户类别描述
	private int score;//积分
	private UserType(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}
	
}

//用户存钱线程
class AccountSaveThread implements Runnable{

	private Account a;
	public AccountSaveThread(Account a) {
		super();
		this.a = a;
	}
	public Account getA() {
		return a;
	}
	public void setA(Account a) {
		this.a = a;
	}

	@Override
	public void run() {
		synchronized (this) {
			
			a.saveMoney(a, 100);
			System.out.println("存钱100元");
			System.out.println(a);
		}
	}
	
}
//用户取钱线程
class AccountDelThread implements Runnable{

	private Account a;
	public AccountDelThread(Account a) {
		super();
		this.a = a;
	}
	public Account getA() {
		return a;
	}
	public void setA(Account a) {
		this.a = a;
	}

	@Override
	public void run() {
		synchronized (this) {
			
			a.delMoney(a, 100);
			System.out.println("取钱100元");
			System.out.println(a);
		}
	}
	
}
/*账号通过随机数生成,前6位固定为622608,后8位随机产生
添加一个用户类别枚举类(分别有普通用户GenUser,VIP用户VipUser,白金用户PlatUser),
有用户类别名称描述和用户积分等属性。
使用多个线程模拟用户存取款的情况,
银行提供ATM多个柜台机,对多个账户进行存取款,
多个人对一个账户进行存取款等操作*/
public class Test07 {

	public static void main(String[] args) {

		Account account=new Account();
		//多个线程模拟用户存款100元
		AccountSaveThread accountSaveThread=new AccountSaveThread(account);
		Thread thread1=new Thread(accountSaveThread);
		Thread thread2=new Thread(accountSaveThread);
		thread1.start();
		thread2.start();
		
		//多个线程模拟用户取款100元
		AccountDelThread accountDelThread=new AccountDelThread(account);
		Thread thread3=new Thread(accountDelThread);
		Thread thread4=new Thread(accountDelThread);
		thread3.start();
		thread4.start();
		//考虑使用wait(),notify().
	}

}
