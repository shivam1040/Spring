package com.springcore;

public class AdditionConstructorAmbiguity {
	private int a, b;

	public AdditionConstructorAmbiguity(int a, int b) {
		this.a = a;
		this.b = b;
	}

	public AdditionConstructorAmbiguity(double a, double b) { //since no constructor is present which takes string as parameter then first constructor will be used to store values by spring(known as ambiguity)
		this.a = (int)a;
		this.b = (int)b;
	}
	
	public void doSum() {
		System.out.println(this.a+this.b);
	}
	
}
