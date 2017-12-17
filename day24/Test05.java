package com.java5200.date0611;

interface Client{
	public void run();
}
class Benz implements Client{

	@Override
	public void run() {
		System.out.println("Benz");
	}
	
}
class BMW implements Client{

	@Override
	public void run() {
		System.out.println("BMW");
	}
	
}
class Driver{
	private String driverName;
	private Client client;
	public Driver(String driverName, Client client) {
		super();
		this.driverName = driverName;
		this.client = client;
	}
	public void driver(){
		System.out.print(this.driverName+"¿ª");
		client.run();
	}
	
}

public class Test05 {

	public static void main(String[] args) {

		Client client=new BMW();
		Driver driver=new Driver("csh", client);
		driver.driver();
	}

}
