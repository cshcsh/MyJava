package com.java5200.date0614;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import org.junit.Test;

/**
 * ʹ�û�������ת���������������: 
 * �Ӽ��������ַ���,Ҫ�󽫶�ȡ���������ַ���ת�ɴ�д�����
 * Ȼ����������������,
 * ֱ�������롰e�����ߡ�exit��ʱ,�˳�����
 * 
 * @author CSH
 * @date 2018��6��14������4:43:58
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
