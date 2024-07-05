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
import javax.validation.constraints.NotBlank;

import org.hibernate.validator.constraints.NotEmpty;
import org.springframework.format.annotation.DateTimeFormat;

import net.bytebuddy.asm.Advice.Local;

@Entity
@Table(name = "user_validation")
public class User {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String name;
	private String email;
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	@Temporal(value = TemporalType.TIME )//Parsing as java.sql.Time for Database Operations
	private Date dateOfBirth ;
	
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
	public Date getDateOfBirth() {
		return dateOfBirth;
	}
	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
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
	public User(int id, String name, String email, Date dateOfBirth, List<String> courses, String studentType,
			String gender, String chk) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.dateOfBirth = dateOfBirth;
		this.courses = courses;
		this.studentType = studentType;
		this.gender = gender;
		this.chk = chk;
	}
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", email=" + email + ", dateOfBirth=" + dateOfBirth + ", courses="
				+ courses + ", studentType=" + studentType + ", gender=" + gender + ", chk=" + chk + "]";
	}
	
	
	
	
	
}
