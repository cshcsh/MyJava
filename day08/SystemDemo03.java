package com.java5200.date0526;

//�г�ָ������
public class SystemDemo03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("ϵͳ�汾Ϊ:" + System.getProperty("os.name")
				+ System.getProperty("os.version")
				+ System.getProperty("os.arch"));// ��ȡ��ǰϵͳ�汾
		System.out.println("ϵͳ�û�Ϊ:" + System.getProperty("user.name"));
		System.out.println("��ǰ��Ŀ¼:" + System.getProperty("user.home"));
		System.out.println("��ǰ�û�����Ŀ¼:" + System.getProperty("user.dir"));
	}
}
