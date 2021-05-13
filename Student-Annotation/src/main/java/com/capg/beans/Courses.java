package com.capg.beans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Courses {
	
	@Value("101")
	private int courseId;
	
	@Value("Java")
	private String courseName;
	public Courses() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getCourseId() {
		return courseId;
	}
	public void setCourseId(int courseId) {
		this.courseId = courseId;
	}
	public String getCourseName() {
		return courseName;
	}
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	@Override
	public String toString() {
		return "Courses [courseId=" + courseId + ", courseName=" + courseName + "]";
	}
	
}