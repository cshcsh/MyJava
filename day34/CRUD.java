package com.java5200.date0621;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.java5200.date0620.JdbcUtil;
import com.mysql.jdbc.PreparedStatement;
import com.mysql.jdbc.ResultSetMetaData;

public class CRUD {

	//添加删除更新操作
	public static void saveOrDelete(String sql) throws SQLException{
		Connection conn=JdbcUtil.getConnection();
		Statement st=conn.createStatement();
		if(st.execute(sql)){
			System.out.println(sql+" 执行失败");
		}else{
			System.out.println(sql+" 执行成功");
		}
	}
	
	//查询
	public static List<Map> query(String sql) throws SQLException{
		Connection conn=JdbcUtil.getConnection();
		Statement st=conn.createStatement();
		ResultSet rs=st.executeQuery(sql);
		List<Map> list=new ArrayList<Map>();
		ResultSetMetaData rsmd=null;
		while(rs.next()){
			Map<String,String> hashMap=new HashMap<String,String>();
			rsmd=(ResultSetMetaData) rs.getMetaData();
			int cols=rsmd.getColumnCount();
			for(int i=1;i<=cols;i++){
				String key=rsmd.getColumnName(i);
				String value=rs.getString(i);
				hashMap.put(key, value);
			}
			list.add(hashMap);
		}
		return list;
	}
	
	//模糊查询
	public static List<Map> queryByName(String name) throws SQLException{
		Connection conn=JdbcUtil.getConnection();
		String sql="select id,name,password,age,sex,birthday from t_user where name like ?";
		PreparedStatement ps=(PreparedStatement) conn.prepareStatement(sql);
		ps.setString(1,"%"+name+"%");
		ResultSet rs=ps.executeQuery();
		List<Map> list=new ArrayList<Map>();
		ResultSetMetaData rsmd=null;
		while(rs.next()){
			Map<String,String> hashMap=new HashMap<String,String>();
			rsmd=(ResultSetMetaData) rs.getMetaData();
			int cols=rsmd.getColumnCount();
			for(int i=1;i<=cols;i++){
				String key=rsmd.getColumnName(i);
				String value=rs.getString(i);
				hashMap.put(key, value);
			}
			list.add(hashMap);
		}
		return list;
	}
	
}
