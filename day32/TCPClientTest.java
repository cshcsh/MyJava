package com.java5200.date0619;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.Socket;

public class TCPClientTest {

	public static void main(String artsg[]) throws Exception {
		Socket client = null; // ����Socket����
		client = new Socket("localhost", 8899); // ָ�����ӵ������Ͷ˿�
		BufferedReader buf = null; // ����BufferedReader����,������Ϣ
		buf = new BufferedReader(new InputStreamReader(client.getInputStream()));// ȡ�ÿͻ��˵�������
		String str = buf.readLine(); // ��ȡ��Ϣ
		System.out.println("��������������ݣ�" + str);
		client.close(); // �ر�Socket
		buf.close(); // �ر�������
	}
}
