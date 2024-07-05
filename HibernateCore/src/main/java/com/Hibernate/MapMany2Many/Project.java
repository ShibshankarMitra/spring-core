package com.Hibernate.MapMany2Many;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name = "project_Maany2Many")
public class Project {

	@Id()
	private int pid;
	private String pname;
	
	@ManyToMany(mappedBy = "projects", fetch =FetchType.EAGER )
	private List<Employee> employees;

	public Project(int pid, String pname, List<Employee> employee) {
		super();
		this.pid = pid;
		this.pname = pname;
		this.employees = employee;
	}

	public Project() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getPid() {
		return pid;
	}

	public void setPid(int pid) {
		this.pid = pid;
	}

	public String getPname() {
		return pname;
	}

	public void setPname(String pname) {
		this.pname = pname;
	}

	public List<Employee> getEmployees() {
		return employees;
	}

	public void setEmployees(List<Employee> employee) {
		this.employees = employee;
	}
	
	
	
	
}
