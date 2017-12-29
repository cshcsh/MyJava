package com.java5200.date0619;

import java.net.URLDecoder;
import java.net.URLEncoder;

public class Code {

	public static void main(String[] args) throws Exception {
		String keyWord = "gf 李小龙"; // 要编码的内容
		String encod = URLEncoder.encode(keyWord, "UTF-8");// 对内容进行编码
		System.out.println("编码之后的内容：" + encod);
		String decod = URLDecoder.decode(encod, "UTF-8");// 对内容进行解码
		System.out.println("解码之后的内容：" + decod);
	}
}
