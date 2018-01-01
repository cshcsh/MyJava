package com.java5200.date0620;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Date;

public class Test {

	private static String driverName="com.mysql.jdbc.Driver";
	private static String url="jdbc:mysql://localhost:3306/db_bank";
	private static String userName="root";
	private static String password="123456";
	
	public static void main(String[] args) {

		try {
			Class.forName(driverName);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		try {
			Connection connection=DriverManager.getConnection(url, userName, password);
			if(connection!=null){
				System.out.println("数据库连接成功");
			}else{
				System.out.println("数据库连接失败");
			}
			Statement statement=connection.createStatement();
			ResultSet resultSet=statement.executeQuery("select * from t_user");
			System.out.println("id"+"\t"+"name"+"\t"+"password"+"\t"+"age"+"\t"+"sex"+"\t"+"date");
			while(resultSet.next()){
				int id=resultSet.getInt("id");
				String name=resultSet.getString("name");
				String password=resultSet.getString("password");
				int age=resultSet.getInt("age");
				String sex=resultSet.getString("sex");
				Date date=resultSet.getDate("birthday");
				System.out.println(id+"\t"+name+"\t"+password+"\t\t"+age+"\t"+sex+"\t"+date);
			}
			connection.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		
	}

}
