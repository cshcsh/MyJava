package com.java5200.date0619;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Scanner;

/**
 * 1编程实现：将客户端录入的十个数传入服务器端,服务器端计算平均值结果再传给客户端
 * @author CSH
 * @date 2018年6月19日下午8:39:49
 */
public class Test03 {

	public static void main(String[] args) throws IOException {

		Socket client=new Socket("localhost", 9988);
		OutputStream outputStream=client.getOutputStream();
		InputStream inputStream=client.getInputStream();
		Scanner scanner=new Scanner(System.in);
		System.out.println("输入十个数据：");
		//double[] number=new double[10];
		//for(int i=0;i<10;i++){
			//number[i]=scanner.nextDouble();
		//}
		String string=scanner.nextLine();
		outputStream.write(string.getBytes());
		client.shutdownOutput();
		int len=0;
		byte[] b=new byte[1024];
		while((len=inputStream.read(b))!=-1){
			System.out.println("接受服务器端返回的数据："+new String(b, 0, len));
		}
		inputStream.close();
		outputStream.close();
		client.close();
	}

}
