package com.Hibernate.Core.Dao;

import javax.persistence.Embeddable;

@Embeddable
//Annotates that Certificate is Embedded inside Student Class
public class Certificate {

	
	private String course;
	private String duration;
	public String getCourse() {
		return course;
	}
	public void setCourse(String course) {
		this.course = course;
	}
	public String getDuration() {
		return duration;
	}
	public void setDuration(String duration) {
		this.duration = duration;
	}
	
	public Certificate() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Certificate [course=" + course + ", duration=" + duration + "]";
	}
	public Certificate(String course, String duration) {
		super();
		this.course = course;
		this.duration = duration;
	}
	
	
}
