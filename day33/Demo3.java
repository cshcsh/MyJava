package com.java5200.date0620;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Demo3 {

	// ����MySQL�����ݿ���������
	public static final String DBDRIVER = "com.mysql.Driver";
	// ����MySQL���ݿ�����ӵ�ַ
	public static final String DBURL = "jdbc:mysql://localhost:3306/db_bank";
	// MySQL���ݿ�������û���
	public static final String DBUSER = "root";
	// MySQL���ݿ����������
	public static final String DBPASS = "123456s";

	public static void main(String[] args) throws Exception {
		Connection conn = null; // ���ݿ�����
		Statement stmt = null; // ���ݿ����
		int id = 3; // id
		String name = "��С��"; // ����
		String password = "dbtest"; // ����
		int age = 25; // ����
		String sex = "��"; // �Ա�
		String birthday = "2001-09-13"; // ����
		// ƴ�ճ�һ��������SQL���
		String sql = "UPDATE user SET name='" + name + "',password='" + password + "',age=" + age + ",sex='" + sex
				+ "',birthday='" + birthday + "' WHERE id=" + id;
		Class.forName(DBDRIVER); // ������������
		// ����MySQL���ݿ�ʱ,Ҫд�����ӵ��û���������
		conn = DriverManager.getConnection(DBURL, DBUSER, DBPASS);
		stmt = conn.createStatement();// ʵ����Statement����
		stmt.executeUpdate(sql); // ִ�����ݿ���²���
		stmt.close(); // �����ر�
		conn.close(); // ���ݿ�ر�
	}
}
