package com.springcore;

public class Person {
	private String name;
	private int personId;
	private Certi certi;
	public Person(String name, int personId, Certi certi) {
		super();
		this.name = name;
		this.personId = personId;
		this.certi=certi;
	}
	@Override
	public String toString() {
		return "Person [name=" + name + ", personId=" + personId + ", certi=" + certi + "]";
	}
	
	
}
