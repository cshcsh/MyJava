package com.java5200.date0605;


/**
 * ��ȡ�����ַ����������ͬ�Ӵ�
 * @author CSH
 * @date 2018��6��5������10:11:39
 */
/*��ȡ�����ַ����������ͬ�Ӵ������磺
str1 = "abcwerthelloyuiodef��;str2 = "cvhellobnm"
��ʾ�����̵��Ǹ������г������εݼ����Ӵ���ϳ�
�Ĵ��Ƚ�*/
public class StringMax {
	
	public static String stringMax(String string,String string2){
		int n1=string.length();
		int n2=string2.length();
		String stringMax=null;
		if(n1>n2){
			for(int i=n2;i>0;i--){
				for(int j=0;j<n2-i+1;j++){
					if(string.indexOf(string2.substring(j, j+i))>0){
						stringMax=string2.substring(j-1, j+i);
						
					}
				}
				if(stringMax!=null){
					break;
				}
			}
		}else{
			for(int i=n1;i>0;i--){
				for(int j=0;j<n1-i+1;j++){
					if(string2.indexOf(string.substring(j, j+i))>0){
						stringMax=string.substring(j-1, j+i);
					}
				}
				if(stringMax!=null){
					break;
				}
			}
		}
		return stringMax;
	}
	
	public static void main(String[] args) {
		
		String string="abceeeeeeeeeeeeeeeeee";
		String string2="babcee";
		System.out.print(stringMax(string,string2));
	}
}
