package com.java5200.date0526;

//���ñ�����ִ�г���
public class RuntimeDemo02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// ͨ��Runtime��ľ�̬����Ϊ��ʵ����
		Runtime run = Runtime.getRuntime();
		try {
			run.exec("notepad.exe");// ���ñ������� ��������쳣���� ������Ҳ�����������
		} catch (Exception e) {
			e.printStackTrace();// ��ӡ�쳣��Ϣ
		}
	}

}
