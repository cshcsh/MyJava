package com.java5200.date0620;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionDemo02 {

	// ����MySQL�����ݿ���������
	public static final String DBDRIVER ="com.mysql.Driver" ;
	// ����MySQL���ݿ�����ӵ�ַ
	public static final String DBURL="jdbc:mysql://localhost:3306/db_bank";
	// MySQL���ݿ�������û���
	public static final String DBUSER="root";
	// MySQL���ݿ����������
	public static final String DBPASS="123456";
	public static void main(String[] args) throws Exception{
	Connection conn = null ; // ���ݿ�����
	Class.forName(DBDRIVER) ; // ������������,���쳣
	// ����MySQL���ݿ�ʱ,Ҫд�����ӵ��û���������,���쳣
	conn = DriverManager.getConnection(DBURL, DBUSER, DBPASS);
	System.out.println(conn) ;
	conn.close() ; // ���ݿ�ر�,���쳣
	}
}
