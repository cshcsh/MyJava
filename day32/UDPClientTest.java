package com.java5200.date0619;

import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class UDPClientTest {

	public static void main(String[] args) throws Exception {
		DatagramSocket ds = null; // 声明DatagramSocket对象
		byte[] buf = new byte[1024]; // 定义接收数据的字节数组
		DatagramPacket dp = null; // 声明DatagramPacket对象
		ds = new DatagramSocket(9000); // 此客户端在9000端口监听
		dp = new DatagramPacket(buf, 1024); // 指定接收数据的长度为1024
		System.out.println("等待接收数据。"); // 输出信息
		ds.receive(dp); // 接收数据
		String str = new String(dp.getData(), 0, dp.getLength()) + "from " + dp.getAddress().getHostAddress() + " : "
				+ dp.getPort(); // 接收数据
		System.out.println(str); // 输出数据
		ds.close(); // 关闭
	}
}
