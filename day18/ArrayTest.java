package com.java5200.date0605;

import java.util.Arrays;

public class ArrayTest {

	public static void main(String args[]) {
		int temp[] = { 3, 5, 7, 9, 1, 2, 6, 8 }; // ����һ����������
		Arrays.sort(temp);
		// ��������
		System.out.print("����������");
		System.out.println(Arrays.toString(temp));// ���ַ����������
		int point = Arrays.binarySearch(temp, 3); // ��������λ��
		System.out.println("Ԫ�ء�3����λ���ڣ�" + point);
		Arrays.fill(temp, 3); // �������
		System.out.print("������䣺");
		System.out.println(Arrays.toString(temp));// ���ַ����������
	}
}
