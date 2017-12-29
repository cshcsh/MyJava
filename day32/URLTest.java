package com.java5200.date0619;

import java.io.InputStream;
import java.net.URL;
import java.util.Scanner;

public class URLTest {

	public static void main(String[] args) throws Exception {
		URL url = new URL("http", "www.baidu.com", 80, "/index.php"); // 指定操作的URL
		InputStream input = url.openStream();// 打开输入流,读取URL内容
		Scanner scan = new Scanner(input);// 实例化Scanner对象
		scan.useDelimiter("\n"); // 设置读取分隔符
		while (scan.hasNext()) { // 不断读取内容
			System.out.println(scan.next()); // 输出内容
		}
	}
}
