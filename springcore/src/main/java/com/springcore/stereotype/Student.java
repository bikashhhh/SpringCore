package com.springcore.stereotype;

import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("obj")
@Scope("prototype")
public class Student {
	
	@Value("Rabi Shastri")
	private String name;
    @Value("Delhi")
	private String city;
    
    @Value("#{temp}")
    List<String> address;
    
    

	public List<String> getAddress() {
		return address;
	}

	public void setAddress(List<String> address) {
		this.address = address;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public Student(String name, String city) {
		super();
		this.name = name;
		this.city = city;
	}

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", city=" + city + "]";
	}
	

}
