package com.java5200.date0619;

import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;

public class TCPServerTest {

	public static void main(String args[]) throws Exception {
		ServerSocket server = null; // ����ServerSocket����
		Socket client = null; // һ��Socket�����ʾһ���ͻ���
		PrintStream out = null; // ������ӡ������,����ͻ������
		server = new ServerSocket(8888);// ��������8888�˿��ϵȴ��ͻ��˷���
		System.out.println("����������,�ȴ��ͻ�������");
		client = server.accept(); // �����ٴ�����,�ȴ��ͻ�������
		String str = "hello world!!!"; // Ҫ��ͻ����������Ϣ
		// ʵ������ӡ������,�����Ϣ
		out = new PrintStream(client.getOutputStream());
		out.println(str); // �����Ϣ
		out.close(); // �رմ�ӡ��
		client.close(); // �رտͻ�������
		server.close(); // �رշ���������
	}
}
