package com.java5200.date0614;


import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.junit.Test;

/**
�ֱ�ʹ�ýڵ�����FileInputStream��FileOutputStream
�ͻ�������BufferedInputStream��BufferedOutputStream
ʵ��ͼƬ����Ƶ�ļ��ĸ��ơ����Ƚ϶��������ݸ��Ʒ����Ч��
(����ʱ����ڴ����ķ��������)
 * @author CSH
 * @date 2018��6��14������4:14:38
 */
public class Test03 {

	@Test
	public void test() throws IOException {
		Runtime r = Runtime.getRuntime(); 
		r.gc();
		long startMem = r.freeMemory(); 
		long start=System.currentTimeMillis();
		FileInputStream fileInputStream=new FileInputStream("test02.txt");
		FileOutputStream fileOutputStream=new FileOutputStream("test020.txt");
		byte[] b=new byte[1024];
		fileInputStream.read(b);
		fileOutputStream.write(b);
		fileInputStream.close();
		fileOutputStream.flush();
		fileOutputStream.close();
		long end=System.currentTimeMillis();
		long endMen = startMem - r.freeMemory();
		System.out.println("����ʱ��"+(end-start));
		System.out.println("�����ڴ棺"+endMen);
	}
	
	@Test
	public void test2() throws IOException {
		Runtime r = Runtime.getRuntime(); 
		r.gc();
		long startMem = r.freeMemory(); 
		long start=System.currentTimeMillis();
		FileInputStream fileInputStream=new FileInputStream("test02.txt");
		FileOutputStream fileOutputStream=new FileOutputStream("test020.txt");
		BufferedInputStream bufferedInputStream=new BufferedInputStream(fileInputStream);
		BufferedOutputStream bufferedOutputStream=new BufferedOutputStream(fileOutputStream);
		byte[] b=new byte[1024];
		bufferedInputStream.read(b);
		bufferedOutputStream.write(b);
		bufferedOutputStream.flush();
		bufferedOutputStream.close();
		bufferedInputStream.close();
		long end=System.currentTimeMillis();
		long endMen = startMem - r.freeMemory();
		System.out.println("����ʱ��"+(end-start));
		System.out.println("�����ڴ棺"+endMen);
	}

}
