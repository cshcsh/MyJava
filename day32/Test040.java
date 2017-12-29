package com.java5200.date0619;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

class ServerThread extends Thread{

	private Socket client = null;

	public void setSocket(Socket client) {
		this.client = client;
	}

	public void run() {
		
		boolean temp = true;
		while (temp) {
			
		}
	
	}
}

public class Test040 {

	public static void main(String[] args) throws IOException {

		ServerSocket serverSocket = new ServerSocket(6666);

		System.out.println("服务器运行,等待客户端连接");
		boolean flag = true;
		while (flag) { 
			Socket client = serverSocket.accept();
			ServerThread serverThread = new ServerThread(); 
			serverThread.setSocket(client);
			serverThread.start();
		}

	}

}
