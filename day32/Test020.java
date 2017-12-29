package com.java5200.date0619;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.Socket;


public class Test020 {

	public static void main(String[] args) throws IOException {
		Socket client = new Socket("localhost", 8889); 
		FileOutputStream fileOutputStream=new FileOutputStream(new File("C:\\img\\2.jpg"));
		InputStream inputStream=client.getInputStream();
		byte[] b=new byte[1024];
		int len=0;
		while((len=inputStream.read(b))!=-1){
			fileOutputStream.write(b, 0, len);
		}
		fileOutputStream.close();
		inputStream.close();
		client.close(); 
	}
}
