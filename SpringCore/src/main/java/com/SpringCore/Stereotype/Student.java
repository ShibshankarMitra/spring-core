package com.SpringCore.Stereotype;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("obj")
public class Student {
	@Value ("Shib")
	private String name;
	@Value ("Kolkata")
	private String addrress;
	@Value ("Python")
	private String course;
	
	@Value ("#{phones}")
	private List<String> phones;
	
	public String getName() {
		return name;
	}
	public List<String> getPhones() {
		return phones;
	}
	public void setPhones(List<String> phones) {
		this.phones = phones;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddrress() {
		return addrress;
	}
	public void setAddrress(String addrress) {
		this.addrress = addrress;
	}
	public String getCourse() {
		return course;
	}
	public void setCourse(String course) {
		this.course = course;
	}
	public Student(String name, String addrress, String course) {
		super();
		this.name = name;
		this.addrress = addrress;
		this.course = course;
	}
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", addrress=" + addrress + ", course=" + course + "]";
	}
	
	
}
