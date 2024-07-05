package com.SpringCore.ConstructorInjection;

public class Person {
	private int id;
	private String name;
	private Cert cert;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Cert getCert() {
		return cert;
	}
	public void setCert(Cert cert) {
		this.cert = cert;
	}
	public Person(int id, String name, Cert cert) {
		super();
		this.id = id;
		this.name = name;
		this.cert = cert;
	}
	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + ", cert=" + cert + "]";
	}
	

}
