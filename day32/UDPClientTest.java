package com.java5200.date0619;

import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class UDPClientTest {

	public static void main(String[] args) throws Exception {
		DatagramSocket ds = null; // ����DatagramSocket����
		byte[] buf = new byte[1024]; // ����������ݵ��ֽ�����
		DatagramPacket dp = null; // ����DatagramPacket����
		ds = new DatagramSocket(9000); // �˿ͻ�����9000�˿ڼ���
		dp = new DatagramPacket(buf, 1024); // ָ���������ݵĳ���Ϊ1024
		System.out.println("�ȴ��������ݡ�"); // �����Ϣ
		ds.receive(dp); // ��������
		String str = new String(dp.getData(), 0, dp.getLength()) + "from " + dp.getAddress().getHostAddress() + " : "
				+ dp.getPort(); // ��������
		System.out.println(str); // �������
		ds.close(); // �ر�
	}
}
