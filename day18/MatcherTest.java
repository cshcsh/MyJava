package com.java5200.date0605;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MatcherTest {

	// һ���û����û���Ӧ���� 6~15 λ����ĸ�����֡�_
	public static void main(String[] args) {
		String str = "helloworld";
		Pattern pat = Pattern.compile("\\w{6,15}");
		Matcher mat = pat.matcher(str);
		if (mat.matches()) {
			System.out.println("��֤ͨ����");
		}else{
			System.out.println("��֤��ͨ����");
		}
	}
}
