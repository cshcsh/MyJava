package com.java5200.date0606;

interface Info6<T> { // �ڽӿ��϶��巺��
	public T getVar();
}

// ���巺�ͽӿڵ�����,ָ������ΪString
class InfoImpl2 implements Info6<String> {
	private String var; // ��������
	
	

	public InfoImpl2(String var) {
		super();
		this.var = var;
	}

	public void setVar(String var) {
		this.var = var;
	}

	public String getVar() { // �ӿ�����ָ������,���Դ˴�������String
		return this.var;
	}
}


public class GenericsInterface2 {

	public static void main(String[] args) {
		//The type InfoImpl2 is not generic; it cannot be parameterized with arguments <String>
		Info6<String> demo = new InfoImpl2("hello");
		System.out.print(demo.getVar());
	}
}
