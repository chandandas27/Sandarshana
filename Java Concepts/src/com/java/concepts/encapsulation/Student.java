package com.java.concepts.encapsulation;

public class Student {
	
	private String studentName;
	private int studentID;
	
	public String getStudentName() {
		return studentName;
	}
	
	public int getStudentID() {
		return studentID;
	}
	
	public void setStudentName(String name) {
		studentName=name;
	}
	
	public void setStudentID(int id) {
		studentID=id;
	}

}
