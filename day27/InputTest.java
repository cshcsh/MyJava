package com.java5200.date0614;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class InputTest {

	public static void main(String[] args) throws IOException{
		
		// �ļ����������
		FileInputStream fis = new FileInputStream("test02.txt");
		FileOutputStream fos = new FileOutputStream("test02.txt");
		// ת����
		InputStreamReader isr = new InputStreamReader(fis, "GBK");
		OutputStreamWriter osw = new OutputStreamWriter(fos, "GBK");
		// �������������
		BufferedReader br = new BufferedReader(isr);
		BufferedWriter bw = new BufferedWriter(osw);
		String str = null;
		while((str = br.readLine()) != null){
			bw.write(str);
			bw.newLine();
			bw.flush();
		}
		bw.close();
		br.close();
	}
}
