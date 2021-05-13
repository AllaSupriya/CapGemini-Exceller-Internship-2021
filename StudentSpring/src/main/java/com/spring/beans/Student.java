package com.spring.beans;

public class Student {
	private int sId;
	private String studentName;
	private Course Course;
	
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Student(int sId, String studentName) {
		super();
		this.sId = sId;
		this.studentName = studentName;
	}
	public int getsId() {
		return sId;
	}
	public void setsId(int sId) {
		this.sId = sId;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public Course getCourse() {
		return Course;
	}
	public void setCourse(Course course) {
		Course = course;
	}
	@Override
	public String toString() {
		return "Student [sId=" + sId + ", studentName=" + studentName + ", Course=" + Course + "]";
	}
	
	
	
}
