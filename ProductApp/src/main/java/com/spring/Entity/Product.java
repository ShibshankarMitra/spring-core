package com.spring.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Product {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	String name;
	String description;
	float price;
	Details details;
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
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	public Details getDetails() {
		return details;
	}
	public void setDetails(Details details) {
		this.details = details;
	}
	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Product(int id, String name, String description, float price, Details details) {
		super();
		this.id = id;
		this.name = name;
		this.description = description;
		this.price = price;
		this.details = details;
	}
	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", description=" + description + ", price=" + price
				+ ", details=" + details + "]";
	}
	
	
}
