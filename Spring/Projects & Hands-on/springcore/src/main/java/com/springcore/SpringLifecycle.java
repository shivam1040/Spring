package com.springcore;

public class SpringLifecycle {
	private double price;

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		System.out.println("setting");
		this.price = price;
	}

	public SpringLifecycle() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "SpringLifecycle [price=" + price + "]";
	}
	
	public void init() {
		System.out.println("Init");
	}
	
	public void destroy() {
		System.out.println("destroy");
	}
}
