package com.java5200.date0606;

/**
 * ��������
 * @author CSH
 * @date 2018��6��6������10:42:30
 */
public class GenericsArray {
	public static void main(String args[]) {
		Integer i[] = fun1(1, 2, 3, 4, 5, 6); // ���ط�������
		fun2(i); // �����������
	}

	public static <T> T[] fun1(T... arg) { // ���տɱ����,���ط�������
		return arg; // ���ط�������
	}

	public static <T> void fun2(T param[]) { // ���շ�������
		System.out.print("���շ������飺");
		for (T t : param) {
			System.out.print(t + "��");
		}
		System.out.println();
	}
}
