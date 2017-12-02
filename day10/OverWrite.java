package com.java5200.date0528;


class father{
	
	private void printInfo(){
		System.out.println("csh");
	}
	/*
	public void printInfo(){
		System.out.println("csh");
	}*/
}
public class OverWrite extends father{

	void printInfo(){//default,≤ª «÷ÿ–¥
		System.out.println("csh2");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		OverWrite ow=new OverWrite();
		ow.printInfo();
	}

}
