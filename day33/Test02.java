package com.java5200.date0620;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * ��ѯ����
 * @author CSH
 * @date 2018��6��20������10:33:08
 */
public class Test02 {

	public static ResultSet query(String table) throws SQLException{
		
		Connection connection=JdbcUtil.getConnection();
		Statement statement=connection.createStatement();
		ResultSet resultSet=statement.executeQuery("select * from "+table);
		return resultSet;
	}
}
