package com.java5200.date0526;

class Person {
	public Person() {
		System.out.println("���󱻴���~~ ");
	}

	public void finalize() throws Throwable {// �����ͷſռ�ʱĬ�ϵ��ô˷���
		System.out.println("���󱻻���~~~~ ");
	}
}

public class SystemDemo04 {
	public static void main(String[] args) {
		Person per = new Person();
		per = null;
		// �Ͽ�����,�ͷſռ�
		System.gc();
		// ǿ�����ͷſռ�
	}
}