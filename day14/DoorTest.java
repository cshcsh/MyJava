package com.java5200.date0601;

interface Door2{
	
	public void openDoor();
	public void closeDoor();
}

abstract class Door{
	
	public abstract void openDoor();
	public abstract void closeDoor();
}

class TheftProof extends Door{

	@Override
	public void openDoor() {
		// TODO Auto-generated method stub
		System.out.println("开防盗门");
	}

	@Override
	public void closeDoor() {
		// TODO Auto-generated method stub
		System.out.println("关防盗门");
	}
	
	public void theftProofDoor() {
		// TODO Auto-generated method stub
		System.out.println("防盗");
	}
	
}

class WaterProof extends Door{

	@Override
	public void openDoor() {
		// TODO Auto-generated method stub
		System.out.println("开防水门");
	}

	@Override
	public void closeDoor() {
		// TODO Auto-generated method stub
		System.out.println("关防水门");
	}
	
	public void waterProofDoor() {
		// TODO Auto-generated method stub
		System.out.println("防水");
	}
	
}

class BulletProof extends Door{

	@Override
	public void openDoor() {
		// TODO Auto-generated method stub
		System.out.println("开防弹门");
	}

	@Override
	public void closeDoor() {
		// TODO Auto-generated method stub
		System.out.println("关防弹门");
	}
	public void BulletProofDoor() {
		// TODO Auto-generated method stub
		System.out.println("防弹");
	}
	
}

public class DoorTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		TheftProof theftProof=new TheftProof();
		theftProof.theftProofDoor();
		theftProof.openDoor();
		theftProof.closeDoor();
	}

}
