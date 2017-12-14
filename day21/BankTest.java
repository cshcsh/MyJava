package com.java5200.date0608;

class Account3{
	private String id;
	private double balance;
	
	public Account3() {
		super();
	}
	public Account3(String id,double balance) {
		super();
		this.id = id;
		this.balance=balance;
	}
	
	public int hashCode() {
		return super.hashCode();
	}
	
	public boolean equals(Account3 account3) {
		return this.getId().equals(account3.getId());
	}
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	
}
class Draw implements Runnable{

	private Account3 account3;
	private double money;
	private String name;
	
	public Account3 getAccount3() {
		return account3;
	}

	public void setAccount3(Account3 account3) {
		this.account3 = account3;
	}

	public double getMoney() {
		return money;
	}

	public void setMoney(double money) {
		this.money = money;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Draw(String name) {
		this.name = name;
	}

	@Override
	public void run() {
		for(int i=0;i<12;i++){
			synchronized(this){
				if(this.getMoney()<=account3.getBalance()&&this.getMoney()>0){
					System.out.print("取钱："+this.getMoney());
					account3.setBalance(account3.getBalance()-this.getMoney());
					System.out.println("   余额："+account3.getBalance());
				}else{
					System.out.println("余额不足");
				}
			}
		}
	}
	
}
public class BankTest {

	public static void main(String[] args) {

		Draw draw=new Draw("线程");
		Account3 account3=new Account3("csh", 1000);
		draw.setAccount3(account3);
		draw.setMoney(100);
		Thread thread=new Thread(draw);
		thread.start();
	}

}
