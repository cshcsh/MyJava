package com.java5200.date0604;

public class RunTime {

	// ͨ��Runtime��ľ�̬����Ϊ��ʵ����
	public static void main(String[] args) {
		Runtime run = Runtime.getRuntime();
		try {
			run.exec("notepad.exe");// ���ñ������� ��������쳣����
		} catch (Exception e) {
			e.printStackTrace();// ��ӡ�쳣��Ϣ
		}
	}
}
