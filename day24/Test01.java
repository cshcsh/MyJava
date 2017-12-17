package com.java5200.date0611;


public class Test01 {

	public static void main(String[] args) {
		
		int count=0;
		for(int i=1;i<=100;i++){//for循环
			count=count+i;
		}
		System.out.println(count);
		
		int n=(1+100)*100/2;//等差数列
		System.out.println(n);
		
		int n2=add(100);//递归
		System.out.println(n2);
	}

	public static int add(int i) {
		int num=0;
		if(i==1){
			num=1;
		}else if(i>1){
			num=i+add(i-1);
		}else{
			num=-1;
		}
		return num;
	}

}
