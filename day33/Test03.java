package com.java5200.date0620;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.mysql.jdbc.PreparedStatement;

/**
 * ģ����ѯ������ִ��sql���
 * @author CSH
 * @date 2018��6��20������10:57:12
 */
public class Test03 {

	public static void find(int id) throws SQLException{
		
		Connection connection=JdbcUtil.getConnection();
		Statement statement=connection.createStatement();
		String sql="select id,name,password,age,sex,birthday from t_user where id= "+id;
		statement.executeQuery(sql);
	}
	
	//����ִ��Insert
	public static void executeInsert(String[] sql) throws SQLException{
		
		Connection connection=JdbcUtil.getConnection();
		Statement statement=connection.createStatement();
		for(int i=0;i<sql.length;i++){
			statement.execute(sql[i]);
		}
	}
	
}
