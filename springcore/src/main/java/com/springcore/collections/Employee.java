package com.springcore.collections;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Employee {
	private List<String> phones;
	private String name;
	private Set<String> address;
	private Map<String,String> courses;
	public List<String> getPhones() {
		return phones;
	}
	public void setPhones(List<String> phones) {
		this.phones = phones;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Set<String> getAddress() {
		return address;
	}
	public void setAddress(Set<String> address) {
		this.address = address;
	}
	public Map<String, String> getCourses() {
		return courses;
	}
	public void setCourses(Map<String, String> courses) {
		this.courses = courses;
	}
	public Employee(List<String> phones, String name, Set<String> address, Map<String, String> courses) {
		super();
		this.phones = phones;
		this.name = name;
		this.address = address;
		this.courses = courses;
	}
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Employee [phones=" + phones + ", name=" + name + ", address=" + address + ", courses=" + courses + "]";
	}
	
	
	

}
