package com.java5200.date0525;

public class BoyGirlTest{


	public static void main(String[] args){
		
		Boy boy=new Boy("csh",20);
		Girl girl=new Girl("tyq");
		girl.marry(boy);
		boy.marry(girl);
	}
}