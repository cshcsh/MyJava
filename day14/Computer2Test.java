package com.java5200.date0601;

public class Computer2Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		CPU2 cpu=new CPU2("����", "AMD", 3);
		
		YingPan2 yingPan2=new YingPan2("����", "ST330", 500);
		
		XingShiQi2 xingShiQi2=new XingShiQi2("����", "PS202", "1024*1024");
		
		KeyWord2 keyWord2=new KeyWord2("�޼�", "KS1000");
		
		Computer2 computer2=new Computer2("����HP", "NX6120", cpu,  yingPan2,  xingShiQi2,
				 keyWord2);
		
		System.err.println(computer2);
	}

}
