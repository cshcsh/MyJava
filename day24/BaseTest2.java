package com.java5200.date0611;

interface ITest{
	public void method();
}

interface ImplInterface{
	public static final ITest I_TEST=new ITest() {
		
		@Override
		public void method() {
			// TODO Auto-generated method stub
			System.out.println("���ڽӿ���ʵ����");
		}
	};
}
public class BaseTest2 {

	
	public static void main(String[] args) {
		
		ImplInterface.I_TEST.method();
		//�磺System.out.println();
	}
	

}
