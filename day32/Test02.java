package com.java5200.date0619;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * 1.����˶�ȡͼƬ�����͸��ͻ���,�ͻ��˱���ͼƬ������
 * @author CSH
 * @date 2018��6��19������8:38:35
 */
public class Test02 {

	public static void main(String[] args) throws IOException {
		ServerSocket server = new ServerSocket(8889);
		Socket client = server.accept();
		FileInputStream fileInputStream=new FileInputStream(new File("D:\\img\\1.jpg"));
		byte[] b=new byte[1024];
		int len=0;
		OutputStream outputStream=client.getOutputStream();
		while((len=fileInputStream.read(b))!=-1){
			outputStream.write(b, 0, len);
		}
		client.shutdownOutput();
		fileInputStream.close();
		outputStream.close(); 
		client.close(); 
		server.close(); 
		
	}
}
