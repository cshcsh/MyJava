package com.java5200.date0619;

import java.io.InputStream;
import java.net.URL;
import java.util.Scanner;

public class URLTest {

	public static void main(String[] args) throws Exception {
		URL url = new URL("http", "www.baidu.com", 80, "/index.php"); // ָ��������URL
		InputStream input = url.openStream();// ��������,��ȡURL����
		Scanner scan = new Scanner(input);// ʵ����Scanner����
		scan.useDelimiter("\n"); // ���ö�ȡ�ָ���
		while (scan.hasNext()) { // ���϶�ȡ����
			System.out.println(scan.next()); // �������
		}
	}
}
