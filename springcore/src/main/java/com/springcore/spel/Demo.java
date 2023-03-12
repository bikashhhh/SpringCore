package com.springcore.spel;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("obj")
@Scope("prototype")
public class Demo {
	@Value("#{22+23}")
	private int x;
	@Value("#{20+23}")
	private int y;
	
	@Value("#{T(java.lang.Math).sqrt(900)}")
	private double z;
	@Value("#{T(java.lang.Math).PI}")
	private double e;
	@Value("#{new java.lang.String('Shivaa')}")
	private String name;
	
	@Value("#{8>3}")
	private boolean isActive;
	
	public boolean isActive() {
		return isActive;
	}

	public void setActive(boolean isActive) {
		this.isActive = isActive;
	}

	public Demo(int x, int y, double z, double e, String name) {
		super();
		this.x = x;
		this.y = y;
		this.z = z;
		this.e = e;
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Demo(int x, int y, double z, double e) {
		super();
		this.x = x;
		this.y = y;
		this.z = z;
		this.e = e;
	}

	public double getE() {
		return e;
	}

	public void setE(double e) {
		this.e = e;
	}

	public double getZ() {
		return z;
	}

	public void setZ(double z) {
		this.z = z;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public Demo(int x, int y, double z) {
		super();
		this.x = x;
		this.y = y;
		this.z = z;
	}

	public Demo(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}

	public Demo() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Demo [x=" + x + ", y=" + y + ", z=" + z + ", e=" + e + ", name=" + name + ", isActive=" + isActive
				+ "]";
	}



}
