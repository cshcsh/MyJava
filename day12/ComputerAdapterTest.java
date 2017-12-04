package com.java5200.date0530;

interface ElectricSource { // 定义ElectricSource接口，表示得到电源操作

	public void getElectricSource1();//得到0V电源
	public void getElectricSource2();//得到10V电源
	public void getElectricSource3();//得到22V电源
	public void getElectricSource4();//得到220V电源
}

// 定义抽象类实现接口，在此类中重写方法，但是所有的方法体为空
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

// 子类直接继承ElectricSourceAdapter类，有选择的实现需要的方法
class ElectricSourceAdapterImpl extends ElectricSourceAdapter {

	@Override
	public void getElectricSource3() {
		// TODO Auto-generated method stub
		System.out.println("22V电源");
	}
	
}

public class ComputerAdapterTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ElectricSource electricSource=new ElectricSourceAdapterImpl();
		electricSource.getElectricSource3();
	}

}
