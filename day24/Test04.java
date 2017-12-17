package com.java5200.date0611;

interface InterfacePhone {
	
	public void dial(String phoneNumber);//拨通电话
	public void chat(Object o);//通话
	public void hangup();//通话完毕，挂电话
}

class InterfacePhoneImpl implements InterfacePhone{
	
	public void chat(Object o) {
		System.out.print("通话,传送数据:");
		System.out.println(o.toString());
	}

	public void dial(String phoneNumber) {
		System.out.println("拨通号码："+phoneNumber);
	}

	public void hangup() {
		System.out.println("通话完毕，挂电话");
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
