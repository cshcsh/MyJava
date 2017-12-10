package com.java5200.date0606;

interface Info5<T> { // �ڽӿ��϶��巺��
	public T getVar();
}

class InfoImpl<T> implements Info5<T> { // ���巺�ͽӿڵ�����
	private T var; // ��������

	public InfoImpl(T var) { // ͨ�����췽��������������
		this.setVar(var);
	}

	public void setVar(T var) {
		this.var = var;
	}

	public T getVar() {
		return this.var;
	}
}

public class GenericsInterface {
	public static void main(String[] args) {
		Info5<String> demo = new InfoImpl<String>("hello");
		System.out.println(demo.getVar());
		
		Info5<Integer> demo2 = new InfoImpl<Integer>(55657);
		System.out.print(demo2.getVar());
	}

}
