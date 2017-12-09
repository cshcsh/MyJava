package com.java5200.date0605;

import java.util.regex.Pattern;
/**
 * • Pattern类的主要作用是进行正则规范（如之前的“[0-9]”就属于正则规范）的编写
 *   Matcher类主要是执行规范,验证一个字符串是否符合其规范
 * @author CSH
 * @date 2018年6月5日下午5:03:52
 */
public class PatternTest {

	public static void main(String[] args) {
		String str = "a1b22c333d4444e55555f";
		Pattern pat = Pattern.compile("\\d+");//在Pattern类中如果要想取得Pattern类实例,则必须调用compile()方法
		String s[] = pat.split(str); // 拆分
		for (int x = 0; x < s.length; x++) {
			System.out.print(s[x] + "");
		}
	}
}
