package com.java5200.date0619;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * 2.客户端给服务端发送文本,服务端会将文本转成大写在返回给客户端
 * @author CSH
 * @date 2018年6月19日下午9:26:09
 */
public class Test021 {

	public static void main(String[] args) throws IOException {

		ServerSocket serverSocket=new ServerSocket(9998);
		Socket socket=serverSocket.accept();
		InputStream inputStream=socket.getInputStream();
		byte[] b=new byte[1024];
		int len=0;
		String string=null;
		while((len=inputStream.read(b))!=-1){
			string=new String(b, 0, len);
			System.out.println("接受客户端信息："+string);
			string=string.toUpperCase();
		}
		socket.shutdownInput();
		OutputStream outputStream=socket.getOutputStream();
		outputStream.write(string.getBytes("utf-8"));
		outputStream.close();
		inputStream.close();
		socket.close();
		serverSocket.close();
	}

}
