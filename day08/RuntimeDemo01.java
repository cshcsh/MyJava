package com.java5200.date0526;

public class RuntimeDemo01 {
	public static void main(String[] args) {
		Runtime run = Runtime.getRuntime();// ͨ����̬����Ϊ��ʵ����
		System.out.println("JVM����ڴ�����" + run.maxMemory() / 1024 / 1024 + "M");// �۲�����ڴ���,���ݻ���������������ͬ

		System.out.println("JVM�����ڴ�����" + run.freeMemory() / 1024 / 1024 + "M"); // ȡ�ó�������֮ǰ���ڴ������
		String str = "Hello" + "World" + "!!!" + "\t" + "Welcome " + "To"
				+ "NONGDA" + "~";
		System.out.println(str);
		for (int x = 0; x < 1000; x++) {// ѭ���޸�String ����������� ��ռ���ڴ�
			str += x;
		}
		System.out.println("����String֮���,JVM�����ڴ�����" + run.freeMemory() / 1024
				/ 1024 + "M");// �۲��ж�������ռ����֮����ڴ������
		run.gc(); // ���������ռ�,�ͷſռ�
		System.out.println("��������֮���,JVM�����ڴ�����" + run.freeMemory() / 1024 / 1024
				+ "M"); // �����ռ�֮����ڴ������
	}
}
