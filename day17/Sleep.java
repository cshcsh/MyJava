package com.java5200.date0604;

public class Sleep {

	public static void main(String[] args) {
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
