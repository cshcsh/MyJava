package com.java5200.date0606;

enum Color3 {
	RED("��ɫ"), GREEN("��ɫ"), BLUE("��ɫ"); // ����ö�ٵ���������
	private Color3(String name){ // ���幹�췽��
		this.setName(name) ; // ��������
	}
	private String name ; // ����name����
	public String getName() { // ȡ��name����
		return name;
	}
	public void setName(String name) { // ����name����
		this.name = name;
	}
}

public class EnumTest3 {
	public static void main(String[] args) {
		for(Color3 c:Color3.values()){ //ö��.values()��ʾ�õ�ȫ��ö�ٵ�����
			System.out.println(c.ordinal()
					+ " --> " + c.name()//ö������
					+ "(" + c.getName() + ")") ;// ���ö����������
		}
	}
}

