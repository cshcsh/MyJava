package com.java5200.date0605;

import java.util.Arrays;

/**
 * ���ַ������ַ�������Ȼ˳������
 * @author CSH
 * @date 2018��6��5������9:28:21
 */

/*
1���ַ�������ַ����顣
2������������ѡ��ð�ݣ�Arrays.sort();
3�����������������ַ�����*/
public class StringSort {

	/**
	 * ѡ������
	 */
	public static void XZSort(char[] cs){
		for(int i=0;i<cs.length-1;i++){
			for(int j=0;j<cs.length-i-1;j++){
				if(cs[j]>cs[j+1]){
					char temp=cs[j+1];
						cs[j+1]=cs[j];
						cs[j]=temp;
				}
			}
		}
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String string="etgrhtfsses";
		char[] cs=string.toCharArray();
		//Arrays.sort(cs);
		XZSort(cs);
		StringBuffer stringBuffer=new StringBuffer();
		for(int i=0;i<cs.length;i++){
			System.out.print(cs[i]);
			stringBuffer.append(cs[i]);
		}
		System.out.println();
		System.out.println(stringBuffer.toString());
	}

}
