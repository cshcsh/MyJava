package com.java5200.date0605;

import java.util.Arrays;

class Account implements Comparable<Account>{
	
	private String name;
	private String sex;
	private int id;
	private String type;
	private double balance;
	
	public Account(String name, String sex, int id, String type, double balance) {
		super();
		this.name = name;
		this.sex = sex;
		this.id = id;
		this.type = type;
		this.balance = balance;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	@Override
	public String toString() {
		return "Account [name=" + name + ", sex=" + sex + ", id=" + id + ", type=" + type + ", balance=" + balance
				+ "]";
	}

	@Override
	public int compareTo(Account o) {
		if (this.id > o.id) {
			return 1;
		} else if (this.id < o.id) {
			return -1;
		} else {
			if (this.balance > o.balance) {
				return 1;
			} else if (this.balance < o.balance) {
				return -1;
			} else {
				return 0;
			}
		}
	}
	
}

public class AccountComparable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//´´½¨10¸öÕËºÅÐÎ³ÉÕËºÅÊý×é
		Account[] accounts={new Account("n1", "ÄÐ", 2344, "0", 8888),new Account("n13", "ÄÐ", 1233454, "0", 8838),new Account("n135", "ÄÐ", 123423, "0", 88288)
				,new Account("n66", "ÄÐ", 12234, "0", 88188),new Account("n1328", "ÄÐ", 13244, "0", 88),new Account("n194", "ÄÐ", 123433, "0", 88828)
				,new Account("n2", "ÄÐ", 1233454, "0", 88666688),new Account("n122", "ÄÐ", 125434, "0", 8),new Account("n1223", "ÄÐ", 123994, "0", 88788)
				,new Account("n7", "ÄÐ", 1234245, "0", 888668)};
		Arrays.sort(accounts);
		for(int i=0;i<accounts.length;i++){
			System.out.println(accounts[i]);
		}
	}

}
