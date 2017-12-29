package com.java5200.date0619;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Test030 {

	public static void main(String[] args) throws IOException {

		ServerSocket serverSocket=new ServerSocket(9988);
		Socket socket=serverSocket.accept();
		InputStream inputStream=socket.getInputStream();
		byte[] b=new byte[1024];
		int len=0;
		String string=null;
		while((len=inputStream.read(b))!=-1){
			string=new String(b, 0, len);
			System.out.println("接受客户端数据："+string);
			string=fun(string);
		}
		socket.shutdownInput();
		OutputStream outputStream=socket.getOutputStream();
		outputStream.write(string.getBytes("utf-8"));
		outputStream.close();
		inputStream.close();
		socket.close();
		serverSocket.close();
	}
	
	public static String fun(String string){
		double[] n=new double[string.split(" ").length];
		double num=0;
		for(int i=0;i<string.split(" ").length;i++){
			n[i]=Double.parseDouble(string.split(" ")[i]);
			num=num+n[i];
		}
		return String.valueOf(num/string.split(" ").length);
	}

}
