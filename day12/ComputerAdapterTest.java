package com.java5200.date0530;

interface ElectricSource { // ����ElectricSource�ӿڣ���ʾ�õ���Դ����

	public void getElectricSource1();//�õ�0V��Դ
	public void getElectricSource2();//�õ�10V��Դ
	public void getElectricSource3();//�õ�22V��Դ
	public void getElectricSource4();//�õ�220V��Դ
}

// ���������ʵ�ֽӿڣ��ڴ�������д�������������еķ�����Ϊ��
abstract class ElectricSourceAdapter implements ElectricSource {

	@Override
	public void getElectricSource1() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void getElectricSource2() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void getElectricSource3() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void getElectricSource4() {
		// TODO Auto-generated method stub
		
	}
}

// ����ֱ�Ӽ̳�ElectricSourceAdapter�࣬��ѡ���ʵ����Ҫ�ķ���
class ElectricSourceAdapterImpl extends ElectricSourceAdapter {

	@Override
	public void getElectricSource3() {
		// TODO Auto-generated method stub
		System.out.println("22V��Դ");
	}
	
}

public class ComputerAdapterTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ElectricSource electricSource=new ElectricSourceAdapterImpl();
		electricSource.getElectricSource3();
	}

}
