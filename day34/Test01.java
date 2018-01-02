package com.java5200.date0621;

import java.sql.SQLException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class Test01 {

	public static void main(String[] args) throws SQLException {

		String sql="insert into t_user(id,name,password,age,sex,birthday) values (null,'lyy6666','888888',18,'Ů','1998-08-08')";
		CRUD.saveOrDelete(sql);
		
		String sql2="select name,age,sex from t_user";
		List<Map> list=CRUD.query(sql2);
		Iterator<Map> iterator=list.iterator();
		while (iterator.hasNext()) {
			HashMap<String, String> map = (HashMap<String, String>) iterator.next();
			String name=map.get("name");
			String age=map.get("age");
			String sex=map.get("sex");
			System.out.println(name+" "+age+" "+sex);
		}
	}

}
