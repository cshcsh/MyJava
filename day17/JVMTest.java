package com.java5200.date0604;

public class JVMTest {

	public static void main(String[] args) {
		Runtime run = Runtime.getRuntime();// ͨ����̬����Ϊ��ʵ����
		System.out.println("JVM����ڴ�����" + run.maxMemory());// �۲�����ڴ���,���ݻ���������������ͬ
		System.out.println("JVM�����ڴ�����" + run.freeMemory()); // ȡ�ó�������֮ǰ���ڴ������
		String str = "Hello" + "World" + "!!!" + "\t" + "Welcome " + "To" + "NONGDA" + "~";
		System.out.println(str);
		for (int x = 0; x < 1000; x++) {// ѭ���޸�String ����������� ��ռ���ڴ�
			str += x;
		}
		System.out.println("����String֮���,JVM�����ڴ�����" + run.freeMemory());// �۲��ж�������ռ����֮����ڴ������
		run.gc(); // ���������ռ�,�ͷſռ�
		System.out.println("��������֮���,JVM�����ڴ�����" + run.freeMemory()); // �����ռ�֮����ڴ������
	}
}
