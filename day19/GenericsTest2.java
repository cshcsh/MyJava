package com.java5200.date0606;

public class GenericsTest2 {

	public static void main(String[] args) {
		Info<String> i = new Info<String>("rr");// ָ��ObjectΪ��������
		i.setVar("��С��"); // �����ַ���
		fun(i);
	}

	public static void fun(Info<?> temp) {// �˴����Խ�Info�Ķ���,ʹ��ͨ�����Info<?>���Ĵ�����ʽ,��ʾ����ʹ������ķ������Ͷ���
		System.out.println("���ݣ�" + temp);
	}
}
