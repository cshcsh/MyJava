package com.java5200.date0619;

import java.net.InetAddress;

public class InetAddressTest {

	public static void main(String[] args) throws Exception {
		InetAddress locAdd = null; // ����InetAddress����
		InetAddress remAdd = null; // ����InetAddress����
		locAdd = InetAddress.getLocalHost(); // �õ�����InetAddress����
		remAdd = InetAddress.getByName("www.java5200.com");
		System.out.println("����IP��ַ��" + locAdd.getHostAddress());// �õ�����IP��ַ
		System.out.println("java5200��IP��ַ��" + remAdd.getHostAddress());// �õ�Զ��IP��ַ
		System.out.println("�����Ƿ�ɴ" + remAdd.isReachable(5000));
	}
}
