package com.capg.beans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class NonTechCourses extends Courses{
	
	@Value("ProfessionalEthics")
	private String courseName;

	public NonTechCourses() {
		super();
		// TODO Auto-generated constructor stub
	}

	public NonTechCourses(String courseName) {
		super();
		this.courseName = courseName;
	}

	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	@Override
	public String toString() {
		return "NonTech [courseName=" + courseName + "]";
	}
	
}