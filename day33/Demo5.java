package com.java5200.date0620;

import java.text.SimpleDateFormat;

import com.mysql.jdbc.PreparedStatement;

public class Demo5 {

	public static void main(String[] args) throws Exception {
		PreparedStatement pstmt = null;// ���ݿ����
		String name = "��С��"; // ����
		String password = "dbtestjava";// ����
		int age = 30; // ����
		String sex = "��"; // �Ա�
		String birthday = "2007-08-27"; // ����
		java.util.Date temp = null; // ����һ��Date����
		// ͨ��SimpleDateFormat�ཫ��һ���ַ�����Ϊjava.util.Date����
		temp = new SimpleDateFormat("yyyy-MM-dd").parse(birthday);
		// ͨ��java.util.Dateȡ�������������,�������Ϊjava.sql.Date����
		java.sql.Date bir = new java.sql.Date(temp.getTime());
		String sql = "INSERT INTO user(name,password,age,sex,birthday) " + " VALUES (?,?,?,?,?)"; // ��дԤ����SQL
		pstmt = (PreparedStatement) JdbcUtil.getConnection().prepareStatement(sql); // ʵ����PreparedStatement
		pstmt.setString(1, name); // ���õ�һ����?��������
		pstmt.setString(2, password); // ���õڶ�����?��������
		pstmt.setInt(3, age); // ���õ�������?��������
		pstmt.setString(4, sex); // ���õ��ĸ���?��������
		pstmt.setDate(5, bir); // ���õ������?��������
		pstmt.executeUpdate(); // ִ�����ݿ���²���,����Ҫsql
		pstmt.close(); // �����ر�
	}
}
