package com.java5200.date0619;

import java.net.ServerSocket;
import java.net.Socket;

public class TCPServerRunable {

	public static void main(String args[]) throws Exception {
		ServerSocket server = null; // ����ServerSocket����
		server = new ServerSocket(8899);// ��������8888�˿��ϵȴ��ͻ��˷���
		System.out.println("����������,�ȴ��ͻ�������");
		boolean flag = true;
		while (flag) { // ���������Խ��յ�����û�����
			Socket client = server.accept(); // �����ٴ�����,�ȴ��ͻ�������
			ThreadServer ts = new ThreadServer(); // �߳�����
			ts.setSocket(client);// ����socket
			ts.start(); // �����߳�
		}
		server.close(); // �رշ���������
	}
}
