package com.java5200.date0614;

import java.io.IOException;
import java.io.RandomAccessFile;

/**
 * RandomAccessFile
 * 
 * @author CSH
 * @date 2018年6月14日下午5:43:10
 */
public class Test05 {

	public static void main(String[] args) throws IOException {

		write();
		read();
	}

	public static void write() throws IOException {
		RandomAccessFile raf = new RandomAccessFile("test.txt", "rw");
		raf.seek(1);
		String temp = raf.readLine();
		raf.seek(1);
		raf.write("zhangsan".getBytes());
		raf.seek(9);
		raf.write("30".getBytes());
		raf.seek(13);
		raf.write("lisi".getBytes());
		raf.seek(21);
		raf.write("31".getBytes());
		raf.seek(25);
		raf.write("wangwu".getBytes());
		raf.seek(33);
		raf.write("32".getBytes());
		raf.write(temp.getBytes());
		raf.close();
	}

	public static void read() throws IOException {
		RandomAccessFile raf = new RandomAccessFile("test.txt", "rw");
		raf.seek(1);
		byte[] b = new byte[1024];
		int off = 0;
		int len = 34;
		raf.read(b, off, len);
		String str = new String(b, 0, len);
		System.out.println(str);
		raf.close();
	}
}
