package com.java5200.date0601;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class ComputerWork {
	
	private int s;
	
	/**
	 * 输入数据
	 */
	public void input(){
		Scanner scanner=new Scanner(System.in);
		s=scanner.nextInt();
	}
	
	/**
	 * 保存数据
	 * @throws IOException 
	 */
	public void baoCun() throws IOException{
		FileWriter writer = new FileWriter("D:\\myfile.txt");
		writer.write(s);
		writer.close();
	}
	
	/**
	 * 显示，打印数据
	 */
	public void output(){
		System.out.println(s);
	}
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		ComputerWork computerWork=new ComputerWork();
		computerWork.input();
		computerWork.baoCun();
		computerWork.output();
	}

}
