package com.java5200.date0601;

public class Address {

	private String sheng;
	private String shi;
	private String street;
	
	public Address(String sheng, String shi, String street) {
		super();
		this.sheng = sheng;
		this.shi = shi;
		this.street = street;
	}
	public String getSheng() {
		return sheng;
	}
	public void setSheng(String sheng) {
		this.sheng = sheng;
	}
	public String getShi() {
		return shi;
	}
	public void setShi(String shi) {
		this.shi = shi;
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	@Override
	public String toString() {
		return sheng +  shi  + street;
	}
	
	
	
	
	
}
