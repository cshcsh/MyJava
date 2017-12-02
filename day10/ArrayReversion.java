package com.java5200.date0528;

class Array2 {

	public static int[] array;
	public void resize(int max){
		array=new int[max];
	}

}
public class ArrayReversion extends Array2{
	
	public int[] reversion(int[] currentArray){
		resize(currentArray.length);
		for (int i = 0; i < currentArray.length; i++) {
			array[i]=currentArray[currentArray.length-i-1];
		}
		return array;
	}
	
	public static void main(String[] args){
		
		int[] arr={2,3,3,5,1,1,1,0,8,7,-22};
		ArrayReversion as=new ArrayReversion();
		as.reversion(arr); 
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i]+" ");
		}
	}
}
