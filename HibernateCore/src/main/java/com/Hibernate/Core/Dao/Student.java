package com.Hibernate.Core.Dao;

import javax.persistence.Cacheable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

@Entity
@Cacheable
@Cache(usage= CacheConcurrencyStrategy.READ_ONLY)

public class Student {

	@Id
	@Column(name="student_id")
	private int id;
	
	@Column(name="student_name")
	private String name;
	
	@Column(name="student_city")
	private String city;
	
	private Certificate cert;
	
	
	public Certificate getCert() {
		return cert;
	}
	public void setCert(Certificate cert) {
		this.cert = cert;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", city=" + city + "]";
	}
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Student(int id, String name, String city) {
		super();
		this.id = id;
		this.name = name;
		this.city = city;
	}
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
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	
	
	
}
