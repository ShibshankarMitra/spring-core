package com.SpringCore.ConstructorInjection;

public class Cert {

	private String name;

	public Cert(String name) {
		super();
		this.name = name;
	}

	@Override
	public String toString() {
		return name ;
	}
	
}
