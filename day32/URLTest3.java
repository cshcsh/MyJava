package com.java5200.date0619;

import java.net.URL;
import java.net.URLConnection;
import java.util.Date;

public class URLTest3 {

	public static void main(String[] args) throws Exception {
		URL url = new URL("http://www.baidu.com"); // ָ��������URL
		URLConnection urlCon = url.openConnection(); // ��������
		// ȡ�����ݴ�С
		System.out.println("���ݴ�С��" + urlCon.getContentLength());
		// ȡ����������
		System.out.println("�������ͣ�" + urlCon.getContentType());
		// ȡ��ʱ��
		System.out.println("Date: " + new Date(urlCon.getDate()));
		// ȡ������޸�ʱ��
		System.out.println("Last-Modified: " + new Date(urlCon.getLastModified()));
		//urlCon.addRequestProperty("wd", "���籭");
		//urlCon.getContent();
		
	}
}
