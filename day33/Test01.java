package com.java5200.date0620;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * 操作
 * 
 * @author CSH
 * @date 2018年6月20日上午10:41:49
 */
public class Test01 {

	public static void insert(String sql) throws SQLException {

		Connection connection = JdbcUtil.getConnection();
		Statement statement = connection.createStatement();
		if (!statement.execute(sql)) {
			System.out.println("添加成功");
		} else {
			System.out.println("添加失败");
		}
	}

	public static void delete(int id) throws Exception {
		Connection connection = JdbcUtil.getConnection();
		Statement stmt = connection.createStatement();
		String sql = "delete from t_user where id=" + id;
		stmt.executeUpdate(sql);
		stmt.close();
		connection.close();
	}

	public static void update(String sql) throws Exception {
		Connection connection = JdbcUtil.getConnection();
		Statement stmt = connection.createStatement();
		stmt.executeUpdate(sql);
		stmt.close();
		connection.close();
	}

	public static void query(int id) throws SQLException {

		Connection connection = JdbcUtil.getConnection();
		Statement statement = connection.createStatement();
		ResultSet resultSet = statement.executeQuery("select * from t_user where id=" + id);
		while (resultSet.next()) { 
			int id2 = resultSet.getInt(1); 
			String name = resultSet.getString(2);
			String pass = resultSet.getString(3);
			int age = resultSet.getInt(4); 
			String sex = resultSet.getString(5);
			java.util.Date d = resultSet.getDate(6);
			System.out.println(id2+" "+name+" "+pass+" "+age+" "+sex+" "+d);
		}
	}
	
	public static void queryByAge(int age) throws SQLException {

		Connection connection = JdbcUtil.getConnection();
		Statement statement = connection.createStatement();
		ResultSet resultSet = statement.executeQuery("select * from t_user where age="+age);
		while (resultSet.next()) { 
			int id = resultSet.getInt(1); 
			String name = resultSet.getString(2);
			String pass = resultSet.getString(3);
			int age2 = resultSet.getInt(4); 
			String sex = resultSet.getString(5);
			java.util.Date d = resultSet.getDate(6);
			System.out.println(id+" "+name+" "+pass+" "+age2+" "+sex+" "+d);
		}
	}

}
