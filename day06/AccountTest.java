package com.java5200.date0524;

public class AccountTest{

	public static void main(String[] args){
		
		Account a1=new Account("csh1","123456");
		Account a2=new Account("csh2","123456");
		Account a3=new Account("csh3","123456");
		Account a4=new Account("csh4","123456");

		Bank b1=new Bank("��������");
		b1.addAccount(a1);
		b1.addAccount(a2);
		b1.addAccount(a3);
		b1.addAccount(a4);
		System.out.println("�������ƣ�"+b1.getBankName());
		System.out.println("�˻�������"+b1.getAccountNum());	
		System.out.println("�˻���Ϣ��");
		for(int i=0;i<b1.getAccountNum();i++){
			System.out.println("�˻����ƣ�"+b1.getAccounts()[i].getAccountName()+"     �˻���"+b1.getAccounts()[i].getBalance());
		}
		
	}
}