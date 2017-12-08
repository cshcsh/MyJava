package com.java5200.date0604;


/**
 * 获取两个字符串中最大相同子串
 * @author CSH
 * @date 2018年6月5日上午10:11:39
 */
public class StringMax {

	
	
	/*public static String stringMax(String string,String string2){
		int n1=string.length();
		int n2=string2.length();
		String stringMax="";
		if(n1>n2){
			for(int i=n2;i>0;i--){
				for(int j=0;j<n2-i+1;j++){
					if(string.split(string2.substring(j, j+i))!=null){
						stringMax=string2.substring(j, j+i);
						//break;
					}
				}
			}
		}
		return stringMax;
	}*/
	
	public static void main(String[] args) {
		
		String string="abce";
		String string2="bc";
		//System.out.println(stringMax(string,string2));
	}
}
