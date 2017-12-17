package com.java5200.date0611;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;

class JL{
	private String xm;// 姓名
	private String xb;// 性别
	private int nl;// 年龄
	private String jtzz;// 家庭住址
	private String xl;// 学历
	
	public JL(String xm, String xb, int nl, String jtzz, String xl) {
		super();
		this.xm = xm;
		this.xb = xb;
		this.nl = nl;
		this.jtzz = jtzz;
		this.xl = xl;
	}
	public String getXm() {
		return xm;
	}
	public void setXm(String xm) {
		this.xm = xm;
	}
	public String getXb() {
		return xb;
	}
	public void setXb(String xb) {
		this.xb = xb;
	}
	public int getNl() {
		return nl;
	}
	public void setNl(int nl) {
		this.nl = nl;
	}
	public String getJtzz() {
		return jtzz;
	}
	public void setJtzz(String jtzz) {
		this.jtzz = jtzz;
	}
	public String getXl() {
		return xl;
	}
	public void setXl(String xl) {
		this.xl = xl;
	}
	@Override
	public String toString() {
		return "-----------------简历信息------------------\n姓名:" + xm + "\t性别:" + xb + "\t\t年龄:" + nl + "\n家庭住址:" + jtzz + "\t学历:" + xl;
	}
	
}

public class Test03 {

	public static void main(String[] args) throws FileNotFoundException {
		
		JL csh=new JL("陈胜红", "男", 22, "湖南省宁远县保安镇黄门洞村", "本科");
		System.out.println(csh.toString());
		
		FileOutputStream fs = new FileOutputStream(new File("D:\\简历.txt"));
		PrintStream p = new PrintStream(fs);
		p.println(csh.toString());
		p.close();
	}
	
}
