package com.java5200.date0606;

class Info7<T extends Number> { // �˴�����ֻ������������
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

//ͨ���������ط�����ʵ��
public class GenericsTest6 {
	public static void main(String args[]) {
		Info7<Integer> i = fun(30); // ����������fun()����
		System.out.println(i.getVar());
	}
	
	public static <T extends Number> Info7<T> fun(T param) {
		Info7<T> temp = new Info7<T>(); // ���ݴ������������ʵ����Info����
		temp.setVar(param); // �����ݵ��������õ�Info���е�var����֮��
		return temp; // ����ʵ��������
	}

}
