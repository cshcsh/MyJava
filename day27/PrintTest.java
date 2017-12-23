package com.java5200.date0614;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;

public class PrintTest {

	public static void main(String[] args) {

		FileOutputStream fos = null;
		try {
			fos = new FileOutputStream(new File("text02.txt"));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} // ������ӡ�����,����Ϊ�Զ�ˢ��ģʽ(д�뻻�з����ֽ� '\n' ʱ����ˢ�����������)
		PrintStream ps = new PrintStream(fos, true);
		if (ps != null) { // �ѱ�׼�����(����̨���)�ĳ��ļ�
			System.setOut(ps);
		}
		for (int i = 0; i <= 255; i++) { // ���ASCII�ַ�
			System.out.print((char) i);
			if (i % 50 == 0) { // ÿ50������һ��
				System.out.println(); // ����
			}
		}
		ps.close();
	}
}
