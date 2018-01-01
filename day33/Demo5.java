package com.java5200.date0620;

import java.text.SimpleDateFormat;

import com.mysql.jdbc.PreparedStatement;

public class Demo5 {

	public static void main(String[] args) throws Exception {
		PreparedStatement pstmt = null;// 数据库操作
		String name = "李小龙"; // 姓名
		String password = "dbtestjava";// 密码
		int age = 30; // 年龄
		String sex = "男"; // 性别
		String birthday = "2007-08-27"; // 生日
		java.util.Date temp = null; // 声明一个Date对象
		// 通过SimpleDateFormat类将字一个字符串变为java.util.Date类型
		temp = new SimpleDateFormat("yyyy-MM-dd").parse(birthday);
		// 通过java.util.Date取出具体的日期数,并将其变为java.sql.Date类型
		java.sql.Date bir = new java.sql.Date(temp.getTime());
		String sql = "INSERT INTO user(name,password,age,sex,birthday) " + " VALUES (?,?,?,?,?)"; // 编写预处理SQL
		pstmt = (PreparedStatement) JdbcUtil.getConnection().prepareStatement(sql); // 实例化PreparedStatement
		pstmt.setString(1, name); // 设置第一个“?”的内容
		pstmt.setString(2, password); // 设置第二个“?”的内容
		pstmt.setInt(3, age); // 设置第三个“?”的内容
		pstmt.setString(4, sex); // 设置第四个“?”的内容
		pstmt.setDate(5, bir); // 设置第五个“?”的内容
		pstmt.executeUpdate(); // 执行数据库更新操作,不需要sql
		pstmt.close(); // 操作关闭
	}
}
