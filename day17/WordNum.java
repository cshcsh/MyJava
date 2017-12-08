package com.java5200.date0604;

/**
 * "The last French hostage held by Islamistmilitants, Serge Lazarevic"
 * @author CSH
 * @date 2018年6月4日上午11:36:23
 */
public class WordNum {

	//统计该字符串中字母s出现的次数
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
		System.out.println("统计该字符串中字母s出现的次数:"+n);
		//将字符串的每个单词的首字母大写
		String[] strings=string.split(" ");
		System.out.println("第四个单词:"+strings[3]);
		
		for(int i=0;i<strings.length;i++){
			for(int j=0;j<strings[i].length();j++){
				//strings[i].
			}
		}
	}

}
