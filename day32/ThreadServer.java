package com.java5200.date0619;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.Socket;

public class ThreadServer extends Thread {

	private Socket client = null;

	public void setSocket(Socket client) {
		this.client = client;
	}

	public void run() {
		PrintStream out = null;
		try {
			out = new PrintStream(client.getOutputStream());
		} catch (IOException e2) {
			e2.printStackTrace();
		}
		BufferedReader buf = null;
		try {
			buf = new BufferedReader(new InputStreamReader(client.getInputStream()));
		} catch (IOException e2) {
			e2.printStackTrace();
		}
		boolean temp = true;
		while (temp) {
			String str = null;
			try {
				str = buf.readLine();
			} catch (IOException e) {
				e.printStackTrace();
			} 
			if ("bye".equals(str)) {
				temp = false; 
			} else {
				out.println("Server>>£º" + str); 
			}
		}
		out.close();
		try {
			buf.close();
		} catch (IOException e1) {
			e1.printStackTrace();
		}
		try {
			client.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
