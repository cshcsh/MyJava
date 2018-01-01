package com.java5200.date0620;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Demo3 {

	// 定义MySQL的数据库驱动程序
	public static final String DBDRIVER = "com.mysql.Driver";
	// 定义MySQL数据库的连接地址
	public static final String DBURL = "jdbc:mysql://localhost:3306/db_bank";
	// MySQL数据库的连接用户名
	public static final String DBUSER = "root";
	// MySQL数据库的连接密码
	public static final String DBPASS = "123456s";

	public static void main(String[] args) throws Exception {
		Connection conn = null; // 数据库连接
		Statement stmt = null; // 数据库操作
		int id = 3; // id
		String name = "李小龙"; // 姓名
		String password = "dbtest"; // 密码
		int age = 25; // 年龄
		String sex = "男"; // 性别
		String birthday = "2001-09-13"; // 生日
		// 拼凑出一个完整的SQL语句
		String sql = "UPDATE user SET name='" + name + "',password='" + password + "',age=" + age + ",sex='" + sex
				+ "',birthday='" + birthday + "' WHERE id=" + id;
		Class.forName(DBDRIVER); // 加载驱动程序
		// 连接MySQL数据库时,要写上连接的用户名和密码
		conn = DriverManager.getConnection(DBURL, DBUSER, DBPASS);
		stmt = conn.createStatement();// 实例化Statement对象
		stmt.executeUpdate(sql); // 执行数据库更新操作
		stmt.close(); // 操作关闭
		conn.close(); // 数据库关闭
	}
}
