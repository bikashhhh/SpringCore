package com.springcore.auto.wire;

public class Employee {
	private Address address;

	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
		System.out.println("Setting Address.....");
	}
	public Employee( Address address) {
		super();	
		this.address = address;
		System.out.println("Inside Contructor of Employee class....");
	}
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Employee [address=" + address + "]";
	}
}
