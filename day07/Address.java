package com.java5200.date0525;

public class Address {

	private String nation;
	private String province;
	private String city;
	private String street;
	private String zipCode;
	
	public Address(String nation, String province, String city, String street, String zipCode) {
		super();
		this.nation = nation;
		this.province = province;
		this.city = city;
		this.street = street;
		this.zipCode = zipCode;
	}

	public String getNation() {
		return nation;
	}

	public void setNation(String nation) {
		this.nation = nation;
	}

	public String getProvince() {
		return province;
	}

	public void setProvince(String province) {
		this.province = province;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getZipCode() {
		return zipCode;
	}

	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}
	
	public String getAddress() {
		return "Address [nation=" + nation + ", province=" + province + ", city=" + city + ", street=" + street
				+ ", zipCode=" + zipCode + "]";
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Address address=new Address("中国","江西","南昌","志敏大道","330045");
		address.getAddress();
	}

}
