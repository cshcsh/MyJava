package com.java5200.date0611;

import java.io.IOException;

public class DBTest {

	public static void main(String[] args) {
		try {
			DBBase base = new DBTest().new MySQLDB();//�޷�����PersonTest���͵ķ��ʵ���������ø����޶�����
		} catch (IOException e) { // �쳣����
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	class DBBase {// ����
		// �����׳�IOException
		public DBBase() throws IOException {
			throw new IOException();
		}
	}

	class MySQLDB extends DBBase {// ����
		// �����׳�Exception�쳣
		public MySQLDB() throws Exception {
		}
	}
}
