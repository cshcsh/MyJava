package com.java5200.date0531;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class IOExceptionTest {

	public static void main(String[] args) throws IOException {
		readFile();
		//writeFile();
	}

	private static void readFile() throws FileNotFoundException, IOException {
		FileInputStream in = new FileInputStream("D:\\myfile.txt");
		int b = 0;
		b = in.read();
		while (b != -1) {
			System.out.print((char) b);
			b = in.read();
		}
		in.close();
	}
	
	private static void writeFile() throws FileNotFoundException, IOException {
		FileOutputStream out = new FileOutputStream("D:\\myfile.txt");
		
		byte[] b = {2,3,4,5};//¬“¬Î£¨…Ë÷√±‡¬ÎUTF-8
		out.write(b);
		out.close();
	}
}
