package com.java5200.date0611;

import java.util.Arrays;

public class ArrayTest {

	
	public static void main(String[] args) {
		
		String[] strings={"张三(Z)","李四(L)","王五(W)"};
		//排序，默认是升序
		Arrays.sort(strings);
		int i=0;
		for(String string:strings){
			System.out.print((i++)+" "+string);
		}
	}
	

}
