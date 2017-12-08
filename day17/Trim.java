package com.java5200.date0604;

public class Trim {

	public static void main(String[] args) {

		String str1 = "6666666666666666     tttttttt         Zhang    wuji     7777777";
		//str1=str1.trim();
		for(int i=0;i<str1.length();i++){
			if(str1.charAt(i)!=' '){
				for(int j=str1.length()-1;j>0;j--){
					if(str1.charAt(j)!=' '){
						System.out.println(str1.substring(i, j+1));
						break;
					}
				}
				break;
			}
		}
		//System.out.println(str1);
	}
}
