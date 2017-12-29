package com.java5200.date0619;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class UDPServerTest {

	public static void main(String[] args) throws Exception {
		DatagramSocket ds = null; // 声明DatagamSocket对象
		DatagramPacket dp = null; // 声明DatagramPacket对象
		ds = new DatagramSocket(3000); // 服务器端在3000端口监听
		String str = "hello world "; // 准备好要发送的信息
		// 实例化DatagramPacket对象,指定数据内容,数据长度,要发送的目标地址,发送端口
		dp = new DatagramPacket(str.getBytes(), str.length(), InetAddress.getByName("localhost"), 9000);// 此处向客户端所在的9000端口发送信息
		System.out.println("发送信息。"); // 信息输出
		ds.send(dp); // 发送数据报
		ds.close(); // 关闭
	}
}
