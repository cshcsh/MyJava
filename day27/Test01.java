package com.java5200.date0614;


import java.io.File;
import java.io.IOException;

import org.junit.Test;

/**
•一：创建一个新文件
•二：删除一个指定的文件
•三：创建一个IOTest文件夹
•四：判断一个给定的路径是否是目录
•五：列出指定目录的全部文件

 * @author CSH
 * @date 2018年6月14日下午2:55:53
 */
public class Test01 {

	@Test
	public void createNewFile() throws IOException {
		File file=new File("newFile.txt");
		file.createNewFile();
	}
	
	@Test
	public void deleteFile() throws IOException {
		File file=new File("newFile.txt");
		file.delete();
	}
	
	@Test
	public void mkDir() throws IOException {
		File file=new File("IOTest2");
		file.mkdir();
	}
	
	@Test
	public void isDir() throws IOException {
		File file=new File("IOTest");
		System.out.println(file.isDirectory());
	}
	
	@Test
	public void listFile() throws IOException {
		File file=new File("IOTest");
		for(String s:file.list()){
			System.out.println(s);
		}
	}
	
	@Test
	public void listFiles() throws IOException {
		File file=new File("IOTest");
		for(File f:file.listFiles()){
			System.out.println(f.getName());
		}
	}

}
