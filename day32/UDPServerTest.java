package com.java5200.date0619;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class UDPServerTest {

	public static void main(String[] args) throws Exception {
		DatagramSocket ds = null; // ����DatagamSocket����
		DatagramPacket dp = null; // ����DatagramPacket����
		ds = new DatagramSocket(3000); // ����������3000�˿ڼ���
		String str = "hello world "; // ׼����Ҫ���͵���Ϣ
		// ʵ����DatagramPacket����,ָ����������,���ݳ���,Ҫ���͵�Ŀ���ַ,���Ͷ˿�
		dp = new DatagramPacket(str.getBytes(), str.length(), InetAddress.getByName("localhost"), 9000);// �˴���ͻ������ڵ�9000�˿ڷ�����Ϣ
		System.out.println("������Ϣ��"); // ��Ϣ���
		ds.send(dp); // �������ݱ�
		ds.close(); // �ر�
	}
}
