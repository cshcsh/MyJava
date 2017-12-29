package com.java5200.date0619;

import java.io.IOException;
import java.net.Socket;

class ClientThread extends Thread{

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



/**
 * 2编程实现：让TCP的服务器端和TCP的客户端能够持续的实现通信,
 * 互相发消息,当客户端打印exit时结束客户端,
 * 当服务器在超过15秒种没有客户端连接时退出
 * @author CSH
 * @date 2018年6月19日下午8:39:49
 */
public class Test04 {

	public static void main(String[] args) throws IOException {

		boolean flag = true;
		while (flag) { 
			Socket client = new Socket("localhost", 6666);
			System.out.println("客户端连接服务器成功");
			ClientThread clientThread = new ClientThread(); 
			clientThread.setSocket(client);
			clientThread.start();
		}
	}

}
