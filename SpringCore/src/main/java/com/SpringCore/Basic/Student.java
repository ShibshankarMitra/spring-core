package com.SpringCore.Basic;

public class Student {
	private String studentId;
	private String studentName;
	
	
	
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Student(String studentId, String studentName, String studentAddress) {
		super();
		this.studentId = studentId;
		this.studentName = studentName;
		this.studentAddress = studentAddress;
	}
	public String getStudentId() {
		return studentId;
	}
	public void setStudentId(String studentId) {
		System.out.println("Setting Student ID");
		this.studentId = studentId;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		System.out.println("Setting Student Name");
		this.studentName = studentName;
	}
	public String getStudentAddress() {
		return studentAddress;
	}
	public void setStudentAddress(String studentAddress) {
		System.out.println("Setting Student Address");
		this.studentAddress = studentAddress;
	}
	private String studentAddress;



	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", studentName=" + studentName + ", studentAddress=" + studentAddress
				+ "]";
	}

	
	
	
}
