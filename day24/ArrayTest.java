package com.java5200.date0611;

import java.util.Arrays;

public class ArrayTest {

	
	public static void main(String[] args) {
		
		String[] strings={"����(Z)","����(L)","����(W)"};
		//����Ĭ��������
		Arrays.sort(strings);
		int i=0;
		for(String string:strings){
			System.out.print((i++)+" "+string);
		}
	}
	

}
