package com.java5200.date0528;

class Account4 {

	public float balance;

	public Account4(float balance) {
		super();
		this.balance = balance;
	}

	public float getBalance() {
		return balance;
	}
	//���
	public void deposit(float addMoney){
		balance=balance+addMoney;
	}
	//���
	public void withdaw(float subMoney){
		balance=balance-subMoney;
	}
}
public class CheckingAccount extends Account4{

	private double overdraftProtection;
	
	public CheckingAccount(float balance) {
		super(balance);
		// TODO Auto-generated constructor stub
	}
	
	

	public CheckingAccount(float balance, double overdraftProtection) {
		super(balance);
		this.overdraftProtection = overdraftProtection;
	}

	//���
	public void withdaw(float subMoney){
		if(subMoney<=balance||overdraftProtection>=subMoney){//����㹻���߿���͸֧����㹻������������
			balance=balance-subMoney;
		}else {//�������߿���͸֧����
			float n=(float) (balance+overdraftProtection-subMoney);
			if(n>=10000){
				//͸֧�����ڵ��ڵ�ǰ�������𣬽���ʧ��
				System.out.println("����ʧ��");
			}else {
				//͸֧���С�ڵ�ǰ�������𣬽��׳ɹ�
				overdraftProtection=balance+overdraftProtection-subMoney;
				balance=0;
				
			}
		}
	}

}
