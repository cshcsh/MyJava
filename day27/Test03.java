package com.java5200.date0614;


import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.junit.Test;

/**
分别使用节点流：FileInputStream、FileOutputStream
和缓冲流：BufferedInputStream、BufferedOutputStream
实现图片或视频文件的复制。并比较二者在数据复制方面的效率
(给出时间和内存消耗方面的数据)
 * @author CSH
 * @date 2018年6月14日下午4:14:38
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
		System.out.println("消耗时间"+(end-start));
		System.out.println("消耗内存："+endMen);
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
		System.out.println("消耗时间"+(end-start));
		System.out.println("消耗内存："+endMen);
	}

}
