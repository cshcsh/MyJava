package com.java5200.date0604;

/**
 * 		“To be or not to be"
		,将变成"oT eb ro ton ot eb."
 * @author CSH
 * @date 2018年6月4日上午11:23:44
 */
public class Word {

	public static String trans2(String string){
		
		StringBuffer stringBuffer=new StringBuffer();
		String[] strings=string.split(" ");
		for(int i=0;i<strings.length;i++){
			for(int j=strings[i].length()-1;j>=0;j--){
				stringBuffer.append(strings[i].charAt(j));
			}
			stringBuffer.append(" ");
		}
		return stringBuffer.toString();
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(trans2("To be or not to be         5yy"));
	}

}
