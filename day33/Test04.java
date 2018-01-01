package com.java5200.date0620;


/**
 * •添加一张银行账号数据表完成以下功能
 * •添加1条数据,批量添加n条数据
 * •使用条件删除数据
 * •使用条件更新数据
 * •根据主键查询得到一条数据
 * •使用指定条件查询数据
 * •使用多个条件模糊查询数据
 * @author CSH
 * @date 2018年6月20日上午11:14:21
 */
public class Test04 {

	public static void main(String[] args) throws Exception {
		//添加1条数据
		Test01.insert("insert into t_user(name,password,age,sex,birthday) values ('lyy','888888',18,'女','1998-08-08')");
		//批量添加3条数据
		String[] sqls={"insert into t_user(name,password,age,sex,birthday) values ('lyy2','888888',18,'女','1998-08-08')"
				,"insert into t_user(name,password,age,sex,birthday) values ('lyy3','888888',18,'女','1998-08-08')"
				,"insert into t_user(name,password,age,sex,birthday) values ('lyy4','888888',18,'女','1998-08-08')"};
		Test03.executeInsert(sqls);
		
		//使用条件删除数据
		Test01.delete(17);
		
		//使用条件更新数据
		String sql="update t_user set name='lyy2',password='666666',age=18,sex='女',birthday='1999-08-09' where id=7";
		Test01.update(sql);
		
		//根据主键查询得到一条数据
		Test01.query(15);
		
		//使用指定条件查询数据
		Test01.queryByAge(22);
		
		//使用多个条件模糊查询数据
		Test03.find(15);
	}

}
