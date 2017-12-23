package com.java5200.date0614;


import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import org.junit.Test;

/**
• 1：向文件中写入字符串
• 2：在之前的程序基础上,可以向文件追加内容
• 3：使用字节流和字符流读取文件内容
• 4: 实现一个文件拷贝功能,方法接收两个参数,一个是源文件路径,一个是目标文件路径

 * @author CSH
 * @date 2018年6月14日下午3:57:03
 */
public class Test02 {

	@Test
	public void test() throws IOException {
		FileOutputStream outputStream=new FileOutputStream("test02.txt");
		outputStream.write(5);
		outputStream.flush();
		if(outputStream!=null){
			outputStream.close();
		}
	}
	
	@Test
	//向文件追加内容
	public void test2() throws IOException {
		FileOutputStream outputStream=new FileOutputStream("test02.txt",true);
		outputStream.write(6);;
		outputStream.flush();
		if(outputStream!=null){
			outputStream.close();
		}
	}
	
	@Test
	//使用字节流和字符流读取文件内容
	public void test3() throws IOException {
		FileInputStream inputStream=new FileInputStream("test02.txt");
		byte[] b=new byte[1024];
		inputStream.read(b);
		for(int i=0;i<b.length;i++){
			if(b[i]==0){
				break;
			}
			System.out.println(b[i]);
		}
		if(inputStream!=null){
			inputStream.close();
		}
	}
	
	@Test
	//使用字节流和字符流读取文件内容,考虑乱码
	public void test4() throws IOException {
		FileReader fileReader=new FileReader("test02.txt");
		char[] c=new char[1024];
		fileReader.read(c);
		for(int i=0;i<c.length;i++){
			if(c[i]==0){
				break;
			}
			System.out.println(c[i]);
		}
		if(fileReader!=null){
			fileReader.close();
		}
	}
	
	@Test
	//实现一个文件拷贝功能,方法接收两个参数,一个是源文件路径,一个是目标文件路径
	public void test5() throws IOException {
		FileReader fileReader=new FileReader("test02.txt");
		FileWriter fileWriter=new FileWriter("test020.txt");
		char[] cbuf=new char[1024];
		fileReader.read(cbuf);
		fileWriter.write(cbuf);
		fileReader.close();
		fileWriter.flush();
		fileWriter.close();
		
	}
}
