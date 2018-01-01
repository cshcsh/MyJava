package com.java5200.date0620;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionDemo02 {

	// 定义MySQL的数据库驱动程序
	public static final String DBDRIVER ="com.mysql.Driver" ;
	// 定义MySQL数据库的连接地址
	public static final String DBURL="jdbc:mysql://localhost:3306/db_bank";
	// MySQL数据库的连接用户名
	public static final String DBUSER="root";
	// MySQL数据库的连接密码
	public static final String DBPASS="123456";
	public static void main(String[] args) throws Exception{
	Connection conn = null ; // 数据库连接
	Class.forName(DBDRIVER) ; // 加载驱动程序,有异常
	// 连接MySQL数据库时,要写上连接的用户名和密码,有异常
	conn = DriverManager.getConnection(DBURL, DBUSER, DBPASS);
	System.out.println(conn) ;
	conn.close() ; // 数据库关闭,有异常
	}
}
