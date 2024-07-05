package com.SpringCore.Autowire.Annotation;

import org.springframework.beans.factory.annotation.Autowired;

public class Emp {
	@Autowired
	private Address address;

	public Address getAddress() {
		return address;
	}
	
	public void setAddress(Address address) {
		this.address = address;
		System.out.println("Inside Setter Method");
	}
	
	public Emp(Address address) {
		super();
		this.address = address;
		System.out.println("Inside constructor'");
	}

	public Emp() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Emp [address=" + address + "]";
	}
}
