package com.java5200.date0524;

public class ToXiaMen{

	public static void main(String[] args){
		
		People csh=new People("��ʤ��",22);//�������-csh
		Car car=new Car("����");//��������
		Difang start=new Difang("�ϲ�","Ӣ�۳�");//��ʼ�ض���-�ϲ�
		Difang end=new Difang("����","�ص�");//�����ض���-����
		System.out.print(csh.getAge()+"���"+csh.getName()+"��ʻ"+car.getName()+"����");
		csh.drive(car,start,end);//�����ʻ
	}
}

class People{

	private String name;//����
	private int age;//����
	public People(){
	
	}
	public People(String name,int age){
		this.name=name;
		this.age=age;
	}
	public void setName(String name){
		this.name=name;
	}
	public String getName(){	
		return name;
	}
	public void setAge(int age){	
		this.age=age;
	}
	public int getAge(){	
		return age;
	}

	public void drive(Car car,Difang start,Difang end){//�˿������� 
		
		car.drive(start,end);//������ʻ
	}
}
class Difang{
	
	private String name;//����
	private String dec;//�ط�����

	public Difang(){
	
	}
	public Difang(String name,String dec){
		this.name=name;
		this.dec=dec;
	}
	public void setName(String name){	
		this.name=name;
	}
	public String getName(){	
		return name;
	}
	public void setDec(String dec){	
		this.dec=dec;
	}
	public String getDec(){		
		return dec;
	}
}

class Car{
	
	private String name;//����
	public Car(){
	
	}
	public Car(String name){
		this.name=name;
	}
	public void setName(String name){		
		this.name=name;
	}
	public String getName(){	
		return name;
	}
	public void drive(Difang d1,Difang d2){
		
		System.out.println(d1.getDec()+"-"+d1.getName()+" �� "+d2.getDec()+"-"+d2.getName());
	}
}