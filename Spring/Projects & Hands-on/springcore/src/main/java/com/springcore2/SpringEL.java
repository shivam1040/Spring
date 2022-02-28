package com.springcore2;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class SpringEL {
	@Value("#{1+1}")
	private int x;
	private int y;
	@Value("#{T(java.lang.Math).sqrt(25)}") //storing value by EL calling static method
	private double z;
	@Value("#{T(java.lang.Math).E}") //storing value by EL calling static variable
	private double e;
	@Value("#{new java.lang.String('SJ')}") //creeating an object of type string, passing arguement and storing it in a rfrence
	private String name;
	@Value("#{8>3}")
	private boolean isActive;
	public boolean isActive() {
		return isActive;
	}

	public void setActive(boolean isActive) {
		this.isActive = isActive;
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

	public double getZ() {
		return z;
	}

	public void setZ(double z) {
		this.z = z;
	}

	@Override
	public String toString() {
		return "SpringEL [x=" + x + ", y=" + y + ", z=" + z + ", e=" + e + ", name=" + name + ", isActive=" + isActive
				+ "]";
	}

	public double getE() {
		return e;
	}

	public void setE(double e) {
		this.e = e;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	
	
}
