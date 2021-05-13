package com.capg.beans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class TechCourses extends Courses{
	
	@Value("Java")
	private String course;

	public TechCourses() {
		super();
		// TODO Auto-generated constructor stub
	}

	public TechCourses(String course) {
		super();
		this.course = course;
	}

	public String getCourse() {
		return course;
	}

	public void setCourse(String course) {
		this.course = course;
	}

	@Override
	public String toString() {
		return "TechCourse [course=" + course + "]";
	}

	
	
}
