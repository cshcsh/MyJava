package com.java5200.date0611;

class Father{
	public static void doTest(){
		System.out.println("���Ǹ��ྲ̬����");
	}
	public void notStatic(){
		System.out.println("���Ǹ���Ǿ�̬����");
	}
}
class Son extends Father{
	
	public static void doTest(){
		System.out.println("�������ྲ̬����");
	}
	public void notStatic(){
		System.out.println("��������Ǿ�̬����");
	}
}

public class FatherSonTest {

	public static void main(String[] args) {
		
		Father father=new Son();
		father.doTest();
		father.notStatic();
		//���Ǹ��ྲ̬����
		//��������Ǿ�̬����
		//
	}
	

}
