package com.java5200.date0606;

class Info8<T> {
	private T var; // �˱������������ⲿ����

	public T getVar() { // ����ֵ���������ⲿָ��
		return var;
	}

	public void setVar(T var) { // ���õ��������ⲿָ��
		this.var = var;
	}

	public String toString() { // ��дObject���е�toString()����
		return this.var.toString();
	}
};
//ʹ�÷���ͳһ����Ĳ�������
public class GenericsTest7 {
	public static void main(String args[]) {
		Info8<String> i1 = new Info8<String>(); // ����StringΪ��������
		Info8<String> i2 = new Info8<String>(); // ����StringΪ��������
		i1.setVar("HELLO"); // ��������
		i2.setVar("��С��"); // ��������
		add(i1, i2);
	}
	
	public static <T> void add(Info8<T> i1, Info8<T> i2) {
		System.out.println(i1.getVar() + " " + i2.getVar());
	}

}
