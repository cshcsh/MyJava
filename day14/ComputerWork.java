package com.java5200.date0601;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class ComputerWork {
	
	private int s;
	
	/**
	 * ��������
	 */
	public void input(){
		Scanner scanner=new Scanner(System.in);
		s=scanner.nextInt();
	}
	
	/**
	 * ��������
	 * @throws IOException 
	 */
	public void baoCun() throws IOException{
		FileWriter writer = new FileWriter("D:\\myfile.txt");
		writer.write(s);
		writer.close();
	}
	
	/**
	 * ��ʾ����ӡ����
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
