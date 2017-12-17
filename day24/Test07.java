package com.java5200.date0611;

import java.util.Random;

//�˻�
class Account{
	private String id;//�˺�
	private String password;//����
	private double balance;//���
	private String userType;//�û����
	public Account() {
		this.id="622608"+new Random().nextInt(10)
				+new Random().nextInt(10)
				+new Random().nextInt(10)
				+new Random().nextInt(10)
				+new Random().nextInt(10)
				+new Random().nextInt(10)
				+new Random().nextInt(10)
				+new Random().nextInt(10);//��ʼ�˺�
		this.password = "000000";//��ʼ����
		this.balance=10000;//��ʼ���
		this.userType=UserType.PlatUser.getName();
	}
	//��Ǯ
	public void saveMoney(Account a,double money){
		if(money>0){
			a.setBalance(a.getBalance()+money);
		}
	}
	//ȡǮ
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
	private String AtmName;//ATM����
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
//����
class Bank{
	private String bankName;//��������
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

//�û����
enum UserType{
	GenUser("��ͨ�û�"),VipUser("VIP�û�"),PlatUser("�׽��û�");//�ֱ�����ͨ�û�GenUser,VIP�û�VipUser,�׽��û�PlatUser
	private String name;//�û��������
	private int score;//����
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

//�û���Ǯ�߳�
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
			System.out.println("��Ǯ100Ԫ");
			System.out.println(a);
		}
	}
	
}
//�û�ȡǮ�߳�
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
			System.out.println("ȡǮ100Ԫ");
			System.out.println(a);
		}
	}
	
}
/*�˺�ͨ�����������,ǰ6λ�̶�Ϊ622608,��8λ�������
���һ���û����ö����(�ֱ�����ͨ�û�GenUser,VIP�û�VipUser,�׽��û�PlatUser),
���û���������������û����ֵ����ԡ�
ʹ�ö���߳�ģ���û���ȡ������,
�����ṩATM�����̨��,�Զ���˻����д�ȡ��,
����˶�һ���˻����д�ȡ��Ȳ���*/
public class Test07 {

	public static void main(String[] args) {

		Account account=new Account();
		//����߳�ģ���û����100Ԫ
		AccountSaveThread accountSaveThread=new AccountSaveThread(account);
		Thread thread1=new Thread(accountSaveThread);
		Thread thread2=new Thread(accountSaveThread);
		thread1.start();
		thread2.start();
		
		//����߳�ģ���û�ȡ��100Ԫ
		AccountDelThread accountDelThread=new AccountDelThread(account);
		Thread thread3=new Thread(accountDelThread);
		Thread thread4=new Thread(accountDelThread);
		thread3.start();
		thread4.start();
		//����ʹ��wait(),notify().
	}

}
