package com.java5200.date0614;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import org.junit.Test;

/**
 * 使用缓冲流和转换流完成以下任务: 
 * 从键盘输入字符串,要求将读取到的整行字符串转成大写输出。
 * 然后继续进行输入操作,
 * 直至当输入“e”或者“exit”时,退出程序
 * 
 * @author CSH
 * @date 2018年6月14日下午4:43:58
 */
public class Test04 {

	@Test
	public void test() throws IOException {
		
		InputStreamReader inputStreamReader = new InputStreamReader(System.in);
		BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
		String str = null;
		while ((str=bufferedReader.readLine())!=null) {
			if(str.equals("e")||str.equals("exit")){
				break;
			}else{
				System.out.println(str.toUpperCase());
			}
		}
	}

}
