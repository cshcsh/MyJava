package com.java5200.date0528;

import java.util.Arrays;

class Array {

	public static int[] array;
	public void resize(int max){
		array=new int[max];
	}

}
public class ArraySort extends Array{
	
	public int[] sort(int[] currentArray){
		resize(currentArray.length);
		Arrays.sort(currentArray);
		array=currentArray;
		return array;
	}
	
	public static void main(String[] args){
		
		int[] arr={2,3,3,5,1,1,1,0,8,7,-22};
		ArraySort as=new ArraySort();
		as.sort(arr);
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i]+" ");
		}
	}
}
