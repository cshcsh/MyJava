package com.java5200.date0611;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;

class JL{
	private String xm;// ����
	private String xb;// �Ա�
	private int nl;// ����
	private String jtzz;// ��ͥסַ
	private String xl;// ѧ��
	
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
		return "-----------------������Ϣ------------------\n����:" + xm + "\t�Ա�:" + xb + "\t\t����:" + nl + "\n��ͥסַ:" + jtzz + "\tѧ��:" + xl;
	}
	
}

public class Test03 {

	public static void main(String[] args) throws FileNotFoundException {
		
		JL csh=new JL("��ʤ��", "��", 22, "����ʡ��Զ�ر�������Ŷ���", "����");
		System.out.println(csh.toString());
		
		FileOutputStream fs = new FileOutputStream(new File("D:\\����.txt"));
		PrintStream p = new PrintStream(fs);
		p.println(csh.toString());
		p.close();
	}
	
}
