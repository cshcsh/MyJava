package com.java5200.date0604;

/**
 * "The last French hostage held by Islamistmilitants, Serge Lazarevic"
 * @author CSH
 * @date 2018��6��4������11:36:23
 */
public class WordNum {

	//ͳ�Ƹ��ַ�������ĸs���ֵĴ���
	public static int strNum(String string, String string2) {
		int num = 0;
		int i = 0;
		int j = string2.length();
		while (i != string.length() - j) {

			if (string.substring(i, i + j).equals(string2)||string.substring(i, i + j).equals(string2.toUpperCase())) {
				num++;
			}
			i++;

		}

		return num;
	}
	
	public static void main(String[] args) {

		String string="The last French hostage held by Islamistmilitants, Serge Lazarevic";
		int n=strNum(string,"s");
		System.out.println("ͳ�Ƹ��ַ�������ĸs���ֵĴ���:"+n);
		//���ַ�����ÿ�����ʵ�����ĸ��д
		String[] strings=string.split(" ");
		System.out.println("���ĸ�����:"+strings[3]);
		
		for(int i=0;i<strings.length;i++){
			for(int j=0;j<strings[i].length();j++){
				//strings[i].
			}
		}
	}

}
