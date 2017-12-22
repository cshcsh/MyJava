package com.java5200.date0613;


import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Iterator;
import java.util.Properties;
import java.util.Set;
import java.util.Map.Entry;

import org.junit.Test;

/**
 * •使用Properties类完成以下操作(应用单元测试)
 * •操作一：设置和取得属性
 * •操作二：将属性保存在普通文件之中
 * •操作三：从普通文件之中读取属性内容
 * •操作四：将属性保存在XML文件之中
 * •操作五：从XML文件之中读取属性
 * @author CSH
 * @date 2018年6月13日下午10:39:05
 */
public class Test03 {

	@Test
	public void test() throws IOException {
		Properties properties=new Properties();
		properties.setProperty("a", "111");
		properties.setProperty("b", "222");
		properties.setProperty("c", "333");
		OutputStream outputStream=new FileOutputStream("test.txt");
		properties.store(outputStream, "ddd");
	}
	
	@Test
	public void test2() throws IOException {
		Properties properties=new Properties();
		properties.setProperty("a", "111");
		properties.setProperty("b", "222");
		properties.setProperty("c", "333");
		OutputStream outputStream=new FileOutputStream("test2.xml");
		properties.storeToXML(outputStream, "ddd");
	}
	
	@Test
	public void test3() throws IOException {
		InputStream in = new BufferedInputStream(new FileInputStream("test.txt"));   
		Properties p = new Properties();   
		p.load(in);
		p.list(System.out);
	}
	
	@Test
	public void test4() throws IOException {
		InputStream in = new BufferedInputStream(new FileInputStream("test2.xml"));   
		Properties p = new Properties();   
		p.loadFromXML(in);
		p.list(System.out);
	}

}
