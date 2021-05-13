package com.spring.user;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.beans.Student;

public class StudentMainClass {

	public static void main(String[] args) {
	
		ClassPathXmlApplicationContext spring = new ClassPathXmlApplicationContext("student-spring-factory.xml");
		
		Student s = (Student)spring.getBean("student1");
		Student s1 = (Student)spring.getBean("student2");
		
		System.out.println(s);
		System.out.println(s1);
	}

}
