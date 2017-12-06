package com.java5200.date0601;

public class DriveTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Man csh=new Man("csh",20);
		Car bmw=new Car("BMW");
		Address nancang=new Address("江西省", "南昌市", "志敏大道");
		csh.drive(bmw, nancang);
	}

}
