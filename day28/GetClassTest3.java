package com.java5200.date0615;

class Ref3 {

	public Ref3() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public void fun(){
		
	}

	
}

public class GetClassTest3 {

	public static void main(String args[]) throws NoSuchMethodException, SecurityException {
		Class c1 = null;
		try {
			c1 = Class.forName("com.java5200.date0615.Ref3");// ��õ���ʽ
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		System.out.println(c1.getMethod("fun", null).getName());
		System.out.println("�����ƣ�" + c1.getName()); // �õ��������
	}

}
