package com.java5200.date0619;

import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;

public class TCPServerTest {

	public static void main(String args[]) throws Exception {
		ServerSocket server = null; // 声明ServerSocket对象
		Socket client = null; // 一个Socket对象表示一个客户端
		PrintStream out = null; // 声明打印流对象,以向客户端输出
		server = new ServerSocket(8888);// 服务器在8888端口上等待客户端访问
		System.out.println("服务器运行,等待客户端连接");
		client = server.accept(); // 程序再此阻塞,等待客户端连接
		String str = "hello world!!!"; // 要向客户端输出的信息
		// 实例化打印流对象,输出信息
		out = new PrintStream(client.getOutputStream());
		out.println(str); // 输出信息
		out.close(); // 关闭打印流
		client.close(); // 关闭客户端连接
		server.close(); // 关闭服务器连接
	}
}
