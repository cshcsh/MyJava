package com.java5200.date0619;

import java.net.URLDecoder;
import java.net.URLEncoder;

public class Code {

	public static void main(String[] args) throws Exception {
		String keyWord = "gf ��С��"; // Ҫ���������
		String encod = URLEncoder.encode(keyWord, "UTF-8");// �����ݽ��б���
		System.out.println("����֮������ݣ�" + encod);
		String decod = URLDecoder.decode(encod, "UTF-8");// �����ݽ��н���
		System.out.println("����֮������ݣ�" + decod);
	}
}
