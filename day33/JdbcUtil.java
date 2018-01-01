package com.java5200.date0620;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

/**
 * jdbc工具类
 * @author CSH
 * @date 2018年6月20日上午10:07:12
 */
public class JdbcUtil {

	//获取连接
	public static Connection getConnection(){
		Properties properties=new Properties();
		try {
			InputStream inputStream=new FileInputStream("D:\\9Study\\eclipse javaee workspace\\JavaTest\\src\\com\\java5200\\date0620\\jdbc.properties");
			properties.load(inputStream);
		} catch (IOException e1) {
			e1.printStackTrace();
		}
		String driverName=properties.getProperty("driverName");
		String url=properties.getProperty("url");
		String userName=properties.getProperty("userName");
		String password=properties.getProperty("password");
		try {
			Class.forName(driverName);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		Connection connection=null;
		try {
			connection=DriverManager.getConnection(url, userName, password);
			if(connection!=null){
				System.out.println("数据库连接成功");
			}else{
				System.out.println("数据库连接失败");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return connection;
	}
	
	
}
