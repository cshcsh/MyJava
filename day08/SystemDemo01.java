package com.java5200.date0526;

public class SystemDemo01 {
//System��Ӧ�ã�����һ�������ִ��ʱ��
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long startTime = System.currentTimeMillis();// ȡ�ÿ�ʼ����֮ǰ��ʱ��
		int sum = 0;
		// ������������ۼӺ�Ľ��
		for (int i = 0; i < 30000000; i++) { // ִ���ۼӲ���
			sum += i;
		}
		long endTime = System.currentTimeMillis();
		// ��ʼʱ���ȥ����ʱ��
		System.out.println("���������ѵ�ʱ�䣺" + (endTime - startTime) + "����");
	}
}
