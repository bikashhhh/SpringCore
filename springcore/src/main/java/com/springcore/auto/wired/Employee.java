package com.springcore.auto.wired;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Employee {
	
	@Autowired
	@Qualifier("address1")
	private Address address;

	public Address getAddress() {
		return address;
	}
	
	//@Autowired
	public void setAddress(Address address) {
		this.address = address;
		System.out.println("Setting Address.....");
	}
	
	//@Autowired
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
