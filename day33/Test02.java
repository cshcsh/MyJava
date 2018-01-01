package com.java5200.date0620;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * 查询操作
 * @author CSH
 * @date 2018年6月20日上午10:33:08
 */
public class Test02 {

	public static ResultSet query(String table) throws SQLException{
		
		Connection connection=JdbcUtil.getConnection();
		Statement statement=connection.createStatement();
		ResultSet resultSet=statement.executeQuery("select * from "+table);
		return resultSet;
	}
}
