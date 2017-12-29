package com.java5200.date0619;

import java.net.ServerSocket;
import java.net.Socket;

public class TCPServerRunable {

	public static void main(String args[]) throws Exception {
		ServerSocket server = null; // 声明ServerSocket对象
		server = new ServerSocket(8899);// 服务器在8888端口上等待客户端访问
		System.out.println("服务器运行,等待客户端连接");
		boolean flag = true;
		while (flag) { // 服务器可以接收到多个用户请求
			Socket client = server.accept(); // 程序再此阻塞,等待客户端连接
			ThreadServer ts = new ThreadServer(); // 线程子类
			ts.setSocket(client);// 传递socket
			ts.start(); // 开启线程
		}
		server.close(); // 关闭服务器连接
	}
}
