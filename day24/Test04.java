package com.java5200.date0611;

interface InterfacePhone {
	
	public void dial(String phoneNumber);//��ͨ�绰
	public void chat(Object o);//ͨ��
	public void hangup();//ͨ����ϣ��ҵ绰
}

class InterfacePhoneImpl implements InterfacePhone{
	
	public void chat(Object o) {
		System.out.print("ͨ��,��������:");
		System.out.println(o.toString());
	}

	public void dial(String phoneNumber) {
		System.out.println("��ͨ���룺"+phoneNumber);
	}

	public void hangup() {
		System.out.println("ͨ����ϣ��ҵ绰");
	}
}



public class Test04 {

	public static void main(String[] args) {

		InterfacePhoneImpl interfacePhoneImpl=new InterfacePhoneImpl();
		interfacePhoneImpl.dial("15797713473");
		String string="haha";
		interfacePhoneImpl.chat(string);
		interfacePhoneImpl.hangup();
	}

}
