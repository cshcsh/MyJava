package com.java5200.date0524;

public class Bank{

	private String bankName;//��������
	private Integer accountNum;//�˻�������
	private Account[] accounts;//�˻�����

	private Bank(){//�������ṩ�޲ι��췽��

	}
	public Bank(String bankName){
		this.bankName=bankName;
		this.accountNum=0;
		this.accounts=new Account[1000];//������1000���˻�
	}
	
	public void addAccount(Account a){//���һ���˻�
		
		accounts[accountNum]=a;//�˻�a��ӵ�����accounts
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