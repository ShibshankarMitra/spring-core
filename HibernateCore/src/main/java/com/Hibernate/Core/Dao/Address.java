package com.Hibernate.Core.Dao;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;


@Entity
@Table(name="student_address")
public class Address {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="address_id")
	private int id;
	
	@Column(length = 50)
	private String street;
	
	
	@Column(length = 100)
	private String city;
	
	@Column(name="is_open")
	private boolean isOpen;
	
	@Transient
	private double x;
	
	@Temporal(TemporalType.DATE)
	private java.util.Date addDate;
	
	@Lob
	private byte[] image;
	
	
	public Address() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Address(int id, String street, String city, boolean isOpen, double x, Date addDate, byte[] image) {
		super();
		this.id = id;
		this.street = street;
		this.city = city;
		this.isOpen = isOpen;
		this.x = x;
		this.addDate = addDate;
		this.image = image;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getStreet() {
		return street;
	}


	public void setStreet(String street) {
		this.street = street;
	}


	public String getCity() {
		return city;
	}


	public void setCity(String city) {
		this.city = city;
	}


	public boolean isOpen() {
		return isOpen;
	}


	public void setOpen(boolean isOpen) {
		this.isOpen = isOpen;
	}


	public double getX() {
		return x;
	}


	public void setX(double x) {
		this.x = x;
	}


	public java.util.Date getAddDate() {
		return addDate;
	}


	public void setAddDate(java.util.Date date) {
		this.addDate = date;
	}


	public byte[] getImage() {
		return image;
	}


	public void setImage(byte[] image) {
		this.image = image;
	}
	
	
	
}
