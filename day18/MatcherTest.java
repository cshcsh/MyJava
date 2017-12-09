package com.java5200.date0605;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MatcherTest {

	// 一个用户的用户名应该是 6~15 位的字母、数字、_
	public static void main(String[] args) {
		String str = "helloworld";
		Pattern pat = Pattern.compile("\\w{6,15}");
		Matcher mat = pat.matcher(str);
		if (mat.matches()) {
			System.out.println("验证通过！");
		}else{
			System.out.println("验证不通过！");
		}
	}
}
