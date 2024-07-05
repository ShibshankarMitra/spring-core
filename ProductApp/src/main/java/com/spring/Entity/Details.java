package com.spring.Entity;

import java.time.LocalDateTime;
import java.util.Date;

import javax.persistence.Embeddable;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.springframework.format.annotation.DateTimeFormat;


@Embeddable
public class Details {

	
	private LocalDateTime dateadded;
	private String avilability;
	
	public LocalDateTime getDateadded() {
		return dateadded;
	}
	public void setDateadded(LocalDateTime dateadded) {
		this.dateadded = dateadded;
	}
	public String isAvilability() {
		return avilability;
	}
	public void setAvilability(String avilability) {
		this.avilability = avilability;
	}
	public Details(LocalDateTime dateadded, String avilability) {
		super();
		this.dateadded = dateadded;
		this.avilability = avilability;
	}
	public Details() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		
		return "Date Added =" + dateadded + ", Avilability=" + avilability;
	}
	
	
}
