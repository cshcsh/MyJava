package com.java5200.date0605;

import java.util.Arrays;

/**
 * 对字符串中字符进行自然顺序排序
 * @author CSH
 * @date 2018年6月5日下午9:28:21
 */

/*
1）字符串变成字符数组。
2）对数组排序，选择，冒泡，Arrays.sort();
3）将排序后的数组变成字符串。*/
public class StringSort {

	/**
	 * 选择排序
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
