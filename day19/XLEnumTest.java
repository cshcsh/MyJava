package com.java5200.date0606;

enum XL {
	BACHELOR("����"), MASTER("˶ʿ"), DOCTOR("��ʿ"); // ����ö�ٵ���������
	private XL(String name){ // ���幹�췽��
		this.setName(name) ; // ��������
	}
	private String name ; // ����name����
	public String getName() { // ȡ��name����
		return name;
	}
	public void setName(String name) { // ����name����
		this.name = name;
	}
	public static void show(){
		for(XL c:XL.values()){ //ö��.values()��ʾ�õ�ȫ��ö�ٵ�����
			System.out.println(c.ordinal()
					+ " --> " + c.name()//ö������
					+ "(" + c.getName() + ")") ;// ���ö����������
		}
	}
}

public class XLEnumTest {
	
	public static void main(String[] args) {
		XL.show();
	}
}

