package com.springcore2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class EmployeeAutowiring {
	@Autowired //autowiring by using above variable
	@Qualifier("address2") //this tag is used to specify which bean to use by name, if multiple beans are present in config
	private Address address;

	public Address getAddress() {
		return address;
	}
	
	//@Autowired //autowiring by setter method
	public void setAddress(Address address) {
		this.address = address;
	}

	public EmployeeAutowiring() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "EmployeeAutowiring [address=" + address + "]";
	}
	
	//@Autowired //autowiring by constructor method
	public EmployeeAutowiring(Address address) {
		super();
		this.address = address;
	}
	
	
}
