package com.java5200.date0619;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class Test022 {

	public static void main(String[] args) throws UnknownHostException, IOException {

		Socket client=new Socket("localhost", 9998);
		OutputStream outputStream=client.getOutputStream();
		InputStream inputStream=client.getInputStream();
		Scanner scanner=new Scanner(System.in);
		System.out.println("输入文本：");
		String string=scanner.next();
		outputStream.write(string.getBytes());
		client.shutdownOutput();
		int len=0;
		byte[] b=new byte[1024];
		while((len=inputStream.read(b))!=-1){
			System.out.println("接受服务器端返回的数据："+new String(b, 0, len));
		}
		inputStream.close();
		outputStream.close();
		client.close();
	}

}
