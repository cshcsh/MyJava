package com.java5200.date0614;

import java.io.IOException;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;

class Send implements Runnable {
	
	private PipedOutputStream pos = null; 

	public Send() {
		this.pos = new PipedOutputStream(); 
	}

	public void run() {
		
		String str = "Hello World !";
		try {
			this.pos.write(str.getBytes());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			this.pos.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public PipedOutputStream getPos() { 
		return this.pos;
	}
};

class Receive implements Runnable {
	
	private PipedInputStream pis = null; 

	public Receive() {
		this.pis = new PipedInputStream(); 
	}

	public void run() {
		byte b[] = new byte[1024]; 
		int len = 0;
		try {
			len = this.pis.read(b); 
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			this.pis.close(); 
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("接收的内容为：" + new String(b, 0, len));
	}

	public PipedInputStream getPis() {
		return this.pis;
	}
};

/**
 * 学习使用管道流,管道流的主要作用是可以进行两个 线程间的通讯,
 * 分为管道输出流 （PipedOutputStream）、管道输入流
 * （PipedInputStream）,如果要想进行管道输出,
 * 则必 须把输出流连在输入流之上,试着写一个管道流示例。
 * 
 * @author CSH
 * @date 2018年6月14日下午5:13:34
 */

public class Test06 {

	public static void main(String args[]) {
		Send s = new Send();
		Receive r = new Receive();
		try {
			s.getPos().connect(r.getPis()); 
		} catch (IOException e) {
			e.printStackTrace();
		}
		new Thread(s).start(); 
		new Thread(r).start(); 
	}
	
}
