package com.Spring.Entity;

import java.time.LocalDateTime;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Convert;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;

import org.springframework.format.annotation.DateTimeFormat;

import com.Spring.DAO.UserDao;

import net.bytebuddy.asm.Advice.Local;

@Entity

public class UserDemo  {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String name;
	private String email;
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	@Temporal(TemporalType.DATE)//parsing as a java.sql.Date for Database Operations
	private Date dob ;
	
	//for Passing a generic type Collection Use @Eelementcollection Annotation
	//Hibernate will create a separate mapping table for it. On the Other hand
	//If passing a ReferenceType Collection use @onetoMany/@manytoMany.

//	
//	In both the cases Maping table is created: 
//		1. For generic Collections | @ID Main Entity| Generictype Data|
//		                           |----------------|-----------------|
//		                           
//		2. for Reference Entity type Collections | @ID MainEntity | @ID ReferenceEntity|
//		                                         |----------------|--------------------| 
//	       Also another seperate Table for the ReferencedEntity is generated
//	
	@ElementCollection
	private List<String> courses;
	private String studentType;
	private String gender;
	private String chk;
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
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Date getDob() {
		return dob;
	}
	public void setDob(Date dob) {
		this.dob = dob;
	}
	public List<String> getCourses() {
		return courses;
	}
	public void setCourses(List<String> courses) {
		this.courses = courses;
	}
	public String getStudentType() {
		return studentType;
	}
	public void setStudentType(String studentType) {
		this.studentType = studentType;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getChk() {
		return chk;
	}
	public void setChk(String chk) {
		this.chk = chk;
	}
	public UserDemo(int id, String name, String email, Date dob, List<String> courses, String studentType,
			String gender, String chk) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.dob = dob;
		this.courses = courses;
		this.studentType = studentType;
		this.gender = gender;
		this.chk = chk;
	}
	public UserDemo() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "UserDemo [id=" + id + ", name=" + name + ", email=" + email + ", dob=" + dob + ", courses=" + courses
				+ ", studentType=" + studentType + ", gender=" + gender + ", chk=" + chk + "]";
	}
	
	
	
	
	
	
	
	
}
