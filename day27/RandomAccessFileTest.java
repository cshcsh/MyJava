package com.java5200.date0614;

import java.io.IOException;
import java.io.RandomAccessFile;

public class RandomAccessFileTest {

	public static void main(String[] args) throws IOException {

		RandomAccessFile raf = new RandomAccessFile("test.txt", "rw");
		raf.seek(5);
		byte[] b = new byte[1024];// �ֽ�����
		int off = 0;
		int len = 5;
		raf.read(b, off, len);// ��ȡ���ֽ�������
		// ���ֽ�����תΪ�ַ���
		String str = new String(b, 0, len);
		System.out.println(str);
		raf.close();
	}

}
