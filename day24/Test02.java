package com.java5200.date0611;

public class Test02 {
	
	public static void main(String[] args) {
		
		long start=System.currentTimeMillis();
		String string="";
		for(int i=0;i<100000;i++){
			string+=i;
		}
		long end=System.currentTimeMillis();
		System.out.println(end-start);
		
		long start1=System.currentTimeMillis();
		String string1="";
		for(int i=0;i<100000;i++){
			string1=string1.concat(Integer.toString(i));
		}
		long end1=System.currentTimeMillis();
		System.out.println(end1-start1);
		
		long start2=System.currentTimeMillis();
		StringBuilder string2=new StringBuilder();
		for(int i=0;i<100000;i++){
			string2=string2.append(Integer.toString(i));
		}
		long end2=System.currentTimeMillis();
		System.out.println(end2-start2);
	}
	

}
