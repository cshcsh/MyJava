package com.java5200.date0615;

import java.lang.reflect.Method;

class Person6{
	private  void sayChina(){
		System.out.println("hahaha");
	}
}

public class InvokeSayChinaTest2 {

	public static void main(String[] args) {
		Class<?> c1 = null; // ����Class����
		try {
			c1 = Class.forName("com.java5200.date0615.Person6");// ʵ����Class����
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		try {
			Method met =null;
			met = c1.getDeclaredMethod("sayChina");// �˷���û�в���
			met.setAccessible(true);
			//��ԭ��������Ϊprivate,����Ҫ�ڵ��ô�invoke()����ǰ,��ʽ���÷��������setAccessible(true)����,���ɷ���private�ķ���
			met.invoke(c1.newInstance()); // ���÷���,���봫�ݶ���ʵ��
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
