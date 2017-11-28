package com.java5200.date0524;

public class Bank{

	private String bankName;//银行名称
	private Integer accountNum;//账户户数量
	private Account[] accounts;//账户数组

	private Bank(){//不对外提供无参构造方法

	}
	public Bank(String bankName){
		this.bankName=bankName;
		this.accountNum=0;
		this.accounts=new Account[1000];//最大放置1000个账户
	}
	
	public void addAccount(Account a){//添加一个账户
		
		accounts[accountNum]=a;//账户a添加到数组accounts
		accountNum++;
	}

	public String getBankName(){
		return bankName;
	}
	public void setBankName(String bankName){
		this.bankName=bankName;
	}
	public Integer getAccountNum(){
		return accountNum;
	}
	public void setAccountNum(Integer accountNum){
		this.accountNum=accountNum;
	}
	public Account[] getAccounts(){
		return accounts;
	}
	public void setAccounts(Account[] accounts){
		this.accounts=accounts;
	}
}