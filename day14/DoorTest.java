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
		System.out.println("��������");
	}

	@Override
	public void closeDoor() {
		// TODO Auto-generated method stub
		System.out.println("�ط�����");
	}
	
	public void theftProofDoor() {
		// TODO Auto-generated method stub
		System.out.println("����");
	}
	
}

class WaterProof extends Door{

	@Override
	public void openDoor() {
		// TODO Auto-generated method stub
		System.out.println("����ˮ��");
	}

	@Override
	public void closeDoor() {
		// TODO Auto-generated method stub
		System.out.println("�ط�ˮ��");
	}
	
	public void waterProofDoor() {
		// TODO Auto-generated method stub
		System.out.println("��ˮ");
	}
	
}

class BulletProof extends Door{

	@Override
	public void openDoor() {
		// TODO Auto-generated method stub
		System.out.println("��������");
	}

	@Override
	public void closeDoor() {
		// TODO Auto-generated method stub
		System.out.println("�ط�����");
	}
	public void BulletProofDoor() {
		// TODO Auto-generated method stub
		System.out.println("����");
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
