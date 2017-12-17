package com.java5200.date0611;

import java.io.IOException;

public class DBTest {

	public static void main(String[] args) {
		try {
			DBBase base = new DBTest().new MySQLDB();//无法访问PersonTest类型的封闭实例。必须用附件限定分配
		} catch (IOException e) { // 异常处理
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	class DBBase {// 父类
		// 父类抛出IOException
		public DBBase() throws IOException {
			throw new IOException();
		}
	}

	class MySQLDB extends DBBase {// 子类
		// 子类抛出Exception异常
		public MySQLDB() throws Exception {
		}
	}
}
