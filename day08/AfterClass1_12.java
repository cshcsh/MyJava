package com.java5200.date0526;

/**
 * ��ȡ�����ַ����������ͬ�Ӵ������磺 str1 = "abcwerthelloyuiodef��;str2 = "cvhellobnm"
 * ��ʾ�����̵��Ǹ������г������εݼ����Ӵ���ϳ��Ĵ��Ƚϡ�
 */
public class AfterClass1_12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1 = "abcwerthelloyuiodef";
		String str2 = "cvhellobnm";
		int a = 0;
		String s = "";
		for (int i = 0; i < str2.length(); i++) {
			for (int j = 1; j < str2.length() + 1; j++) {
				if (j > i) {
					String temp = str2.substring(i, j);
					int t = str1.indexOf(str2.substring(i, j));
					if (t != -1) {// t����
						if (temp.length() > a) {
							a = temp.length();
							s = temp;
						}
					}
				}
			}
		}
		System.out.println(s);
	}

}
