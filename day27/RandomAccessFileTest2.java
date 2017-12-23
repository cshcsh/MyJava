package com.java5200.date0614;

import java.io.IOException;
import java.io.RandomAccessFile;

public class RandomAccessFileTest2 {

	public static void main(String[] args) throws IOException {
		RandomAccessFile raf = new RandomAccessFile("test.txt", "rw");
		raf.seek(5);
		// ÏÈ¶Á³öÀ´
		String temp = raf.readLine();
		raf.seek(5);
		raf.write("xyz".getBytes());
		raf.write(temp.getBytes());
		raf.close();
	}
}
