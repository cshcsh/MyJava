package com.java5200.date0605;

import java.util.Arrays;
import java.util.Random;

/**
 * ˫ɫ������1-16,����1-33,�����ظ�,����һ��
 * 
 * @author CSH
 * @date 2018��6��11������10:58:58
 */
public class RedBlue {

	public static boolean beBoolean(int[] a,int n){
		boolean b=false;
		for(int i=0;i<a.length;i++){
			if(a[i]==n){
				b=true;
			}
		}
		return b;
	}
	
	public static void RedBlue() {
		Random random=new Random();
		int[] a =new int[6];
		int n,j=0;
		while (j<6) {// ����������򣬲��ظ�
			n =random.nextInt(33) + 1;//�����ظ�
			if(!beBoolean(a,n)){
				a[j] = n;
				j++;
			}
		}
		Arrays.sort(a);// ����
		System.out.print("����" + (new Random().nextInt(16) + 1) + " ");// �������
		System.out.print("����");
		for (int i = 0; i < 6; i++) {
			System.out.print(a[i] + " ");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		RedBlue();
	}

}
