package com.java5200.date0620;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class InsertDemo01 {

	// ����MySQL�����ݿ���������
	public static final String DBDRIVER = "com.mysql.Driver" ;
	// ����MySQL���ݿ�����ӵ�ַ
	public static final String DBURL = "jdbc:mysql://localhost:3306/db_bank";
	// MySQL���ݿ�������û���
	public static final String DBUSER = "root" ;
	// MySQL���ݿ����������
	public static final String DBPASS = "123456" ;
	public static void main(String[] args) throws Exception {
	Connection conn = null ; // ���ݿ�����
	Statement stmt = null ; // ���ݿ����
	String sql = "INSERT INTO t_user(name,password,age,sex,birthday) "
	+ " VALUES ('��С��','dbtest',30,'��','2008-08-27')";
	Class.forName(DBDRIVER) ; // ������������
	// ����MySQL���ݿ�ʱ,Ҫд�����ӵ��û���������
	conn = DriverManager.getConnection(DBURL, DBUSER, DBPASS);
	stmt = conn.createStatement() ;// ʵ����Statement����
	stmt.executeUpdate(sql);// ִ�����ݿ���²���
	stmt.close() ; // �����ر�
	conn.close() ; // ���ݿ�ر�
	}
}
