package com.Hibernate.MapMany2Many;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name = "employee_Maany2Many")
public class Employee {

	@Id
	private int eid;
	private String ename;
	
	@ManyToMany
	private List<Project> projects;

	public Employee(int eid, String ename, List<Project> projects) {
		super();
		this.eid = eid;
		this.ename = ename;
		this.projects = projects;
	}

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getEid() {
		return eid;
	}

	public void setEid(int eid) {
		this.eid = eid;
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public List<Project> getProjects() {
		return projects;
	}

	public void setProjects(List<Project> project) {
		this.projects = project;
	}
	
	
	
	
}
