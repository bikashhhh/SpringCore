package com.springcore.auto.wired;

public class Address {
     private int sector;
     private String city;
	public int getSector() {
		return sector;
	}
	public void setSector(int sector) {
		this.sector = sector;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public Address(int sector, String city) {
		super();
		this.sector = sector;
		this.city = city;
	}
	public Address() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Address [sector=" + sector + ", city=" + city + "]";
	}
     
}
