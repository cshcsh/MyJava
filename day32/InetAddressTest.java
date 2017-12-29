package com.java5200.date0619;

import java.net.InetAddress;

public class InetAddressTest {

	public static void main(String[] args) throws Exception {
		InetAddress locAdd = null; // 声明InetAddress对象
		InetAddress remAdd = null; // 声明InetAddress对象
		locAdd = InetAddress.getLocalHost(); // 得到本地InetAddress对象
		remAdd = InetAddress.getByName("www.java5200.com");
		System.out.println("本机IP地址：" + locAdd.getHostAddress());// 得到本地IP地址
		System.out.println("java5200的IP地址：" + remAdd.getHostAddress());// 得到远程IP地址
		System.out.println("本机是否可达：" + remAdd.isReachable(5000));
	}
}
