package com.java5200.date0526;

import java.util.Arrays;
import java.util.Scanner;

/**
 * ���ַ������ַ�������Ȼ˳������ ��ʾ�� 1���ַ�������ַ����顣 2������������ѡ��ð�ݣ�Arrays.sort();
 * 3�����������������ַ�����
 */
public class AfterClass1_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("�����ַ�����");
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		// �ַ�������ַ�����
		char[] arr = str.toCharArray();
		// ��������
		Arrays.sort(arr);// ��������-->�Դ�
//		bubbleSort(arr);// ð������
//		selectSort(arr);// ѡ������
//		insertSort(arr);// ��������
		// �ַ��������ַ���
		String str2 = new String(arr);
		System.out.println("������ַ�����Ϊ��");
		System.out.print(str2);

	}

	// ð������:�����໥�Ƚ�,������������������λ��,�Դ�����
	public static void bubbleSort(char[] arr) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length - 1 - i; j++) {
				if (arr[j] > arr[j + 1]) {
					// ����λ��
					char temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		}
	}

	// ѡ������:�ҵ���С��������,���i��������λ��,�Դ�����
	public static void selectSort(char[] arr) {
		for (int i = 0; i < arr.length; i++) {
			int min = i;
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] > arr[j]) {
					min = j;
				}
			}
			// �ҵ�����Сֵ���±�min
			char temp = arr[i];
			arr[i] = arr[min];
			arr[min] = temp;
		}
	}

	// ��������:����ǰ������Ѿ�����˳��,�ڽ�Ҫ�����������ԭ���Ĺ��ɲ��뵽����
	public static void insertSort(char[] arr) {
		for (int i = 1; i < arr.length; i++) {
			// ����Ҫ�������
			char temp = arr[i];
			int j = i - 1;
			while (j >= 0 && arr[j] > temp) {
				arr[j + 1] = arr[j];
				j--;
			}
			arr[j + 1] = temp;
		}
	}

}
