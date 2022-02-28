package com.springcore2;

import org.springframework.stereotype.Component;

@Component("con")
public class ConnfigWithoutXML {
	private Address address;

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public ConnfigWithoutXML(Address address) {
		super();
		this.address = address;
	}

	@Override
	public String toString() {
		return "ConnfigWithoutXML [address=" + address + "]";
	}
	
	
}
