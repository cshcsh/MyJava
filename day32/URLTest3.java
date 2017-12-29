package com.java5200.date0619;

import java.net.URL;
import java.net.URLConnection;
import java.util.Date;

public class URLTest3 {

	public static void main(String[] args) throws Exception {
		URL url = new URL("http://www.baidu.com"); // 指定操作的URL
		URLConnection urlCon = url.openConnection(); // 建立连接
		// 取得内容大小
		System.out.println("内容大小：" + urlCon.getContentLength());
		// 取得内容类型
		System.out.println("内容类型：" + urlCon.getContentType());
		// 取得时间
		System.out.println("Date: " + new Date(urlCon.getDate()));
		// 取得最后修改时间
		System.out.println("Last-Modified: " + new Date(urlCon.getLastModified()));
		//urlCon.addRequestProperty("wd", "世界杯");
		//urlCon.getContent();
		
	}
}
