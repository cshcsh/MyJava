package com.java5200.date0526;

public class RuntimeDemo03 {
//�ڹر�ǰʹ��Thread.sleep()�Ϳ����ӳٹر�
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// ͨ��Runtime��ľ�̬����Ϊ��ʵ����
		Runtime run = Runtime.getRuntime();
		try {// ���ñ������� ��������쳣����
			Process pro = run.exec("notepad.exe");
			Thread.sleep(3000);
			pro.destroy();// ���ٽ���
		} catch (Exception e) {
			e.printStackTrace();// ��ӡ�쳣��Ϣ
		}
	}

}
